package lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListsMethods {
    public static void countOccurance(List<String> list, String line){
        int result=0;
        for (String element: list) {
            if (element.equals(line)){
                result++;
            }
        }
        System.out.println("the row is repeated: " + result + " times");
    }

    public static List<Integer> toList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer element: array ) {
            list.add(element);
        }
        return list;
    }

    public static void findUnique(List<Integer> listOfNumbers) {
        ArrayList<Integer> newListOfNumbers = new ArrayList<>();
        for (Integer element:listOfNumbers) {
            if (!newListOfNumbers.contains(element)){
                newListOfNumbers.add(element);
            }
        }
        System.out.println(newListOfNumbers);
    }


    public static void calcOccurance(List<String> list){
        Map<String, Integer> resultList= new HashMap<>();
        resultList.put(list.get(0),0);
        for (String element: list ) {
            if(resultList.containsKey(element)){
                resultList.put(element, resultList.get(element)+1);
            } else {
                resultList.put(element, 1);
            }
        }
        System.out.println(resultList.toString());

    }
}


