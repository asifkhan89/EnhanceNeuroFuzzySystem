package enhanceneurofuzzysystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Preprocessing {

    HashMap<String, HashMap<String, ArrayList<Double>>> map = new HashMap<>();

//    public void preprocess() {
//        ArrayList<Double> dataPoints = new ArrayList<>();
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("Dataset/yeast.txt"));
//            String line = new String();
//
//            while ((line = br.readLine()) != null) {
//                String[] token1 = line.split("\\s+");
//                int size = token1.length;
//                String clas = token1[size - 1];
//                String seqName = token1[0];
//                for (int i = 1; i < size - 1; i++) {
//                    dataPoints.add(Double.parseDouble(token1[i]));
//                }
//                Collections.sort(dataPoints);
//                if (!map.containsKey(clas)) {
//                    map.put(clas, new HashMap<String, ArrayList<Double>>());
//                }
//                map.get(clas).put(seqName, dataPoints);
//                dataPoints = new ArrayList<>();
//            }
//
//            br.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        for (Map.Entry<String, HashMap<String, ArrayList<Double>>> entrySet : map.entrySet()) {
//            String key = entrySet.getKey();
//            HashMap<String, ArrayList<Double>> value = entrySet.getValue();
//            System.out.println("key-->" + key);
//            System.out.println("value-->" + value);
//        }
//    }
    public List<ClassDatapoints> prep(int i) {
        List<ClassDatapoints> list = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new FileReader("dataset/yeast.txt"));
            String line = new String();

            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String[] token1 = line.split("\\s+");
                int size = token1.length;//size=10
                String clasName = token1[size - 1];
                Double val = Double.parseDouble(token1[i]);
                list.add(new ClassDatapoints(clasName, val));
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        Collections.sort(list, new CustomComparator());
        System.out.println("___________________________________________");
        System.out.println();

        return list;
    }

//    public static void main(String[] args) {
//        Preprocessing enfs = new Preprocessing();
//        for (int i = 1; i < 9; i++) {
//            for (ClassDatapoints arg : enfs.prep(i)) {
//                System.out.println(arg);
//            }
//            System.out.println();
//        }
//    }
}

class CustomComparator implements Comparator<ClassDatapoints> {

    @Override
    public int compare(ClassDatapoints o1, ClassDatapoints o2) {
        return o1.getDatapoint().compareTo(o2.getDatapoint());
    }
}
