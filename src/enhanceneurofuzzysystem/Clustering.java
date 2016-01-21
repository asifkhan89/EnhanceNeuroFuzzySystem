package enhanceneurofuzzysystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Clustering {

    Map<Integer, HashMap<Double, Integer>> clustCentroidMem1 = new TreeMap<>();
    Map<Integer, HashMap<Double, Integer>> clustCentroidMem2 = new TreeMap<>();
    Map<Integer, ArrayList<Double>> clustDataPt = new HashMap<>();
    Map<Integer, HashMap<Double, Double>> clustCentroidSD2 = new TreeMap<>();

    public Map<Integer, ArrayList<Double>> getClustDataPt() {
        return this.clustDataPt;
    }

    public Map<Integer, HashMap<Double, Double>> getClustCentroidSD2() {
        return this.clustCentroidSD2;
    }

    public Map<Integer, HashMap<Double, Double>> createCluster(List<ClassDatapoints> list) {
        HashMap<Integer, ArrayList<Double>> storeCluster = new HashMap<>();
        HashMap<Double, Integer> centroidMem = new HashMap<>();
//        HashMap<Double, Double> centroidSD = new HashMap<>();
        ArrayList<Double> dp = new ArrayList<>();
        int i = 1;
        int flag = 0;
        String clas = new String();
        for (ClassDatapoints list1 : list) {
            if (flag == 0) {
                dp.add(list1.getDatapoint());
                storeCluster.put(i, dp);
                dp = new ArrayList<>();
            } else {
                if (list1.getClassName().equals(clas)) {
                    storeCluster.get(i).add(list1.getDatapoint());
                } else {
                    dp = new ArrayList<>();
                    Integer clus = ++i;
                    dp.add(list1.getDatapoint());
                    storeCluster.put(clus, dp);
                }
            }
            flag = 1;
            clas = list1.getClassName();
        }

        Double threshold = 0.0;
        for (Map.Entry<Integer, ArrayList<Double>> entrySet : storeCluster.entrySet()) {
            Integer clust = entrySet.getKey();
            ArrayList<Double> dtpt = entrySet.getValue();
            System.out.println(clust + " ---> " + dtpt);
            Double val = 0.0;
            for (Double value1 : dtpt) {
                val += value1;
            }
            int size = dtpt.size();
            Double centroid = val / size;
            Double sd = 0.0;
            for (Double dtpt1 : dtpt) {
                sd += Math.sqrt((dtpt1 - centroid) * (dtpt1 - centroid));
            }
//            System.out.println("centroid= " + centroid);
//            System.out.println("no of members= " + size);
            centroidMem.put(centroid, size);
//            centroidSD.put(centroid, sd);
            threshold += size;
            clustCentroidMem1.put(clust, centroidMem);
//            clustCentroidSD1.put(clust, centroidSD);
            centroidMem = new HashMap<>();
//            centroidSD = new HashMap<>();
        }

        threshold /= storeCluster.size();
        System.out.println();
        for (Map.Entry<Integer, HashMap<Double, Integer>> entrySet : clustCentroidMem1.entrySet()) {
            Integer key = entrySet.getKey();
            HashMap<Double, Integer> value = entrySet.getValue();
            System.out.println(key + "  " + value);
        }

        System.out.println();

//        for (Map.Entry<Integer, HashMap<Double, Double>> entrySet : clustCentroidSD1.entrySet()) {
//            Integer key = entrySet.getKey();
//            HashMap<Double, Double> value = entrySet.getValue();
//            System.out.println(key + "  " + value);
//        }
        System.out.println();
        System.out.println("Threshold= " + threshold);
        System.out.println();

        ArrayList<Integer> nm = new ArrayList<>();
        ArrayList<Double> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (Map.Entry<Integer, HashMap<Double, Integer>> entrySet : clustCentroidMem1.entrySet()) {
            Integer key = entrySet.getKey();
            HashMap<Double, Integer> value = entrySet.getValue();
            for (Map.Entry<Double, Integer> entrySet1 : value.entrySet()) {
                Double key1 = entrySet1.getKey();
                Integer value1 = entrySet1.getValue();
                arr1.add(key1);
                arr2.add(value1);
            }
            nm.add(key);
        }
//        System.out.println();
//        System.out.println("Datapoints: " + arr1);
//        System.out.println("Clusters: " + nm);
//        System.out.println("Members : " + arr2);
//        System.out.println();

        int k = 1;
        Set<Integer> grp = new HashSet<>();
        Map<Integer, Set<Integer>> res = new HashMap<>();
        for (int j = 1; j < arr1.size() - 1; j++) {

            if (j == 1 && arr2.get(j - 1) > threshold) {
                grp.add(nm.get(j - 1));
                res.put(k, grp);
                //k++;
                grp = new HashSet<>();
            }

            if (arr2.get(j) < threshold) {
                Double dist1 = distance(arr1.get(j), arr1.get(j + 1));
                Double dist2 = distance(arr1.get(j), arr1.get(j - 1));
                //System.out.println(dist1 + "   " + dist2);
                Double minDist = minDistance(dist1, dist2);
                //System.out.println(minDist);

                if (dist1.equals(minDist)) {
                    if (grp.contains(nm.get(j))) {
                        grp.add(nm.get(j));
                        grp.add(nm.get(j + 1));
                        res.put(k, grp);
                    } else {
                        grp = new HashSet<>();
                        grp.add(nm.get(j));
                        grp.add(nm.get(j + 1));
                        res.put(++k, grp);
                    }
                } else {
                    if (grp.contains(nm.get(j - 1))) {
                        grp.add(nm.get(j));
                        grp.add(nm.get(j - 1));
                        res.put(k, grp);
                    } else {
                        grp = new HashSet<>();
                        grp.add(nm.get(j));
                        grp.add(nm.get(j - 1));
                        res.put(++k, grp);
                    }
                }
            } else {
                if (!grp.contains(nm.get(j))) {
                    grp = new HashSet<>();
                    grp.add(nm.get(j));
                    res.put(++k, grp);
                }
            }
        }

        System.out.println();
        Map<Integer, ArrayList<Double>> data = new HashMap<>();
        for (Map.Entry<Integer, Set<Integer>> entrySet : res.entrySet()) {
            HashMap<Double, Integer> centMem = new HashMap<>();
//            HashMap<Double, Double> centSD = new HashMap<>();

            Double cent = 0.0;
//            Double sd = 0.0;
            Integer mem = 0;
            Integer key = entrySet.getKey();
            Set<Integer> value = entrySet.getValue();
            System.out.println(key + " -- " + value);
            ArrayList<Double> dtp = new ArrayList<>();
            for (Integer dt : value) {
                dtp.addAll(storeCluster.get(dt));
            }
            data.put(key, dtp);

            for (Integer value1 : value) {
                for (Map.Entry<Double, Integer> entrySet1 : clustCentroidMem1.get(value1).entrySet()) {
                    Double key1 = entrySet1.getKey();
                    Integer value2 = entrySet1.getValue();
                    cent += key1;
                    mem += value2;
                }
//                for (Map.Entry<Double, Double> entrySet1 : clustCentroidSD1.get(value1).entrySet()) {
//                    Double value2 = entrySet1.getValue();
//                    sd += value2;
//                }
            }
//            data.put(key, cent);
            //System.out.println(cent/value.size() + "  " + mem);
            centMem.put(cent / value.size(), mem);
//            centSD.put(cent / value.size(), sd);
            clustCentroidMem2.put(key, centMem);
//            clustCentroidSD2.put(key, centSD);
        }

        System.out.println();
//        System.out.println(data);
        for (Map.Entry<Integer, HashMap<Double, Integer>> entrySet : clustCentroidMem2.entrySet()) {
            Integer key = entrySet.getKey();
            HashMap<Double, Integer> value = entrySet.getValue();
            System.out.println(key + " - " + value);
        }
        System.out.println();

//        for (Map.Entry<Integer, HashMap<Double, Double>> entrySet : clustCentroidSD2.entrySet()) {
//            Integer key = entrySet.getKey();
//            HashMap<Double, Double> value = entrySet.getValue();
//            System.out.println(key + "    " + value);
//        }
        System.out.println();

        for (Map.Entry<Integer, ArrayList<Double>> entrySet1 : data.entrySet()) {
            Integer key1 = entrySet1.getKey();
            ArrayList<Double> value1 = entrySet1.getValue();
            System.out.println(key1 + "  " + value1);
            clustDataPt.put(key1, value1);
            Double sd = 0.0, val = 0.0;
            HashMap<Double, Double> map = new HashMap<>();
            for (Double value11 : clustCentroidMem2.get(key1).keySet()) {
                val += value11;
            }

            for (Double pts : value1) {
                sd = Math.sqrt(((pts - val) * (pts - val)) / value1.size());
            }
            map.put(val, sd);
            clustCentroidSD2.put(key1, map);
        }
        
        System.out.println();
        
        for (Map.Entry<Integer, HashMap<Double, Double>> entrySet : clustCentroidSD2.entrySet()) {
            Integer key = entrySet.getKey();
            HashMap<Double, Double> value = entrySet.getValue();
            System.out.println(key + " - " + value);
        }
        return clustCentroidSD2;
    }

    public Double distance(Double a, Double b) {
        Double result = Math.abs(a - b);
        return result;
    }

    public Double minDistance(Double a, Double b) {
        if (a < b) {
            return a;
        }
        return b;
    }
}
