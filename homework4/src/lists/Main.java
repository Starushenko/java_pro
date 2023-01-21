package lists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("One");
        list.add("monobank");
        list.add("Two");
        list.add("Why");
        list.add("Why");
        list.add("Ford");
        list.add("Toyota corolla");
        list.add("Ukraine");
        list.add("monobank");
        list.add("cat");

        String line = "monobank";

        int[] array = new int[] {1,3,13,123};

        ArrayList<Integer> listOfNumbers= new ArrayList<>();
        listOfNumbers.add(1);
        listOfNumbers.add(1);
        listOfNumbers.add(1);
        listOfNumbers.add(4);
        listOfNumbers.add(4);
        listOfNumbers.add(6);
        listOfNumbers.add(13);



        ListsMethods.countOccurance(list,line);

        System.out.println(ListsMethods.toList(array));

        ListsMethods.findUnique(listOfNumbers);

        ListsMethods.calcOccurance(list);

        ListsMethods.findOccurance(list);





    }
}
