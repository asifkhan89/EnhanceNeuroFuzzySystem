package enhanceneurofuzzysystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Transition {

    Map<Integer, List<Integer>> binaryTransform = new HashMap<>();
    
    public Map<Integer, List<Integer>> calculateGaussian() {
        Preprocessing preprocess = new Preprocessing();
        List<ClassDatapoints> list = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            binaryTransform = new HashMap<>();
            list = preprocess.prep(i);
            Clustering cluster = new Clustering();
            cluster.createCluster(list);

            Map<Integer, ArrayList<Double>> dataPoints = cluster.getClustDataPt();
            Map<Integer, HashMap<Double, Double>> centroidSD = cluster.getClustCentroidSD2();
            Map<Integer, List<Double>> gaussianMemFunc = new HashMap<>();

            for (Integer clustNo : dataPoints.keySet()) {
                Double mean = 0.0;
                List<Double> dpSet = new ArrayList<>();
                for (Double keySet : centroidSD.get(clustNo).keySet()) {
                    mean += keySet;
                }

                Double sd = centroidSD.get(clustNo).get(mean);
                if (sd != 0) {
                    GaussianMembershipFunction g = new GaussianMembershipFunction(sd, mean);
                    for (Double dp : dataPoints.get(clustNo)) {
                        dpSet.add(g.apply(dp));
                    }
                    gaussianMemFunc.put(clustNo, dpSet);
                } else if (sd == 0) {
                    for (Double dp : dataPoints.get(clustNo)) {
                        if (dp.equals(mean)) {
                            dpSet.add(1.0);
                        } else if (!dp.equals(mean)) {
                            dpSet.add(0.0);
                        }
                    }
                    gaussianMemFunc.put(clustNo, dpSet);
                }
            }
            System.out.println();

            for (Map.Entry<Integer, List<Double>> entrySet : gaussianMemFunc.entrySet()) {
                List<Integer> trans = new ArrayList<>();
                Integer key = entrySet.getKey();
                List<Double> value = entrySet.getValue();
                System.out.println(key + " " + value);
                for (Double value1 : value) {
                    if (value1 > 0.1) {
                        trans.add(1);
                    } else {
                        trans.add(0);
                    }
                }
                binaryTransform.put(key, trans);
            }

            for (Map.Entry<Integer, List<Integer>> entrySet : binaryTransform.entrySet()) {
                Integer key = entrySet.getKey();
                List<Integer> value = entrySet.getValue();
                System.out.println(key + "  " + value);
            }
        }
        return binaryTransform;
    }

//    public static void main(String[] args) {
//        Preprocessing preprocess = new Preprocessing();
//        List<ClassDatapoints> list = new ArrayList<>();
//        list = preprocess.prep(1);
//        Clustering clust = new Clustering();
//        clust.createCluster(list);
//        Transition trans = new Transition();
//        trans.calculateGaussian();
//    }
}
