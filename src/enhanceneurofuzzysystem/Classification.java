package enhanceneurofuzzysystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Classification {

    Map<Integer, List<Integer>> binaryTransform;

    private Double arr[][];
    Transition trans = new Transition();

    public void signoid() {
        Transition trans = new Transition();

//        Preprocessing preprocess = new Preprocessing();
//        List<ClassDatapoints> list = new ArrayList<>();
        Map<Integer, List<Integer>> gaus = new HashMap<>();
//        for (int k = 1; k < 9; k++) {
//            list = preprocess.prep(k);
//            Clustering cluster = new Clustering();
//            cluster.createCluster(list);
        gaus = trans.calculateGaussian();
//        }
        ArrayList<ArrayList<Double>> list = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entrySet : gaus.entrySet()) {
            Integer key = entrySet.getKey();
            List<Integer> value = entrySet.getValue();
            int numInputs = value.size();
            int numOutput = 10;

            arr = new Double[numInputs + 1][numOutput];
//            System.out.println(key+"  "+value);

            for (int i = 0; i < numInputs; i++) {
                for (int j = 0; j < numOutput; j++) {
                    arr[i][j] = Math.abs(new Random().nextDouble() - 0.5);
                }
            }

            ArrayList<Double> list1 = new ArrayList<>();
            for (Double[] array : arr) {
                list1.addAll(Arrays.asList(array));
            }
            list1.removeAll(Collections.singleton(null));
            list.add(list1);
//            for (int i = 0; i < numInputs; i++) {
//                for (int j = 0; j < numOutput; j++) {
//                    System.out.print(arr[i][j] + "\t");
//                }
//                System.out.println("");
//            }
        }
//        List<Double> list = new ArrayList<>();
//        for (Double[] array : arr) {
//            for (Double array1 : array) {
//                System.out.print(array1+"\t");
//            }
//            System.out.println();
//        }
        Map<Integer, ArrayList<ArrayList<Double>>> wtMap = new HashMap<>();
        int i = 1;
        for (ArrayList<Double> list1 : list) {
//            System.out.println(i);
            ArrayList<ArrayList<Double>> wtlist = new ArrayList<>();
            int j = 0;
            ArrayList<Double> l1 = new ArrayList<>();
            for (Double list11 : list1) {
                l1.add(list11);
//                System.out.print(list11 + " ");
                j++;
                if (j == 10) {
                    j = 0;
                    wtlist.add(l1);
                    l1 = new ArrayList<>();
//                    System.out.println();
                }
            }
            wtMap.put(i, wtlist);
            i++;
        }

        Map<Integer, Double> signoid = new HashMap<>();
        for (Map.Entry<Integer, ArrayList<ArrayList<Double>>> entrySet : wtMap.entrySet()) {
            Integer key = entrySet.getKey();
            ArrayList<ArrayList<Double>> value = entrySet.getValue();
//            System.out.println(key);
//            System.out.println(value);
//            System.out.println();
            double sum = 0;
            int count = 0;
            for (ArrayList<Double> value1 : value) {
                Double val = 0.0;
                for (Integer v1 : gaus.get(key)) {
                    for (Double v2 : value1) {
                        val = v2 + v1;
                    }
                }
                sum += val;
                count++;
            }
            sum /= count;
            signoid.put(key, sum);
        }

        for (Map.Entry<Integer, Double> entrySet : signoid.entrySet()) {
            Integer key = entrySet.getKey();
            Double value = entrySet.getValue();
            Double result = 1 / 1 + Math.exp(-value);
            System.out.print(key + " ");
            System.out.print(">>>> " + result + "\n");
        }
    }

    public static void main(String[] args) {
        Classification clss = new Classification();
        clss.signoid();
    }
}
