package d_data_structures;

//#### Exercise 3
//        List documentation: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html
//
//        1. In class `MyList` Create a list of Strings with the names of star wars heroes
//        * Han Solo
//        * Luke Skywalker
//        * Darth Vader
//        * C-3PO
//        * Leia Organa
//        * Obi Wan Kenobi
//
//        2. Print the last item of the list
//        3. Reverse the order of items in the list
//        4. Print the list again
//        5. Sort the list with the default method
//        6. Print the first item of the list

import java.util.List;

public class MyLists {
    public static void main(String[] args) {
        List<String> names = List.of("Han Solo", "Luke Skywalker", "Darth Vadar", "C-3P0" ,"Leia Organa", "Obi Wan Kenobi");
        for (String n : names) {
            System.out.println("What a beautiful name " + n);
        }
//    System.out.println(names.indexOf("Han Solo"));
        System.out.println(names.get(5));
    }

}


