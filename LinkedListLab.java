package week6lab;

import java.util.*;

public class LinkedListLab {
    //Question 1
    public void addAndSort(LinkedList<Integer> list, int value){ //Take in the LinkedList and value
        list.add(value); //Add value to the linked list
        Collections.sort(list); //Sort the list numerically
    }

    //Question 2
    public void swapValues(LinkedList<Integer> list, int indexOne, int indexTwo){ //Take in LinkedList and the two index positions
        int valIndexOne = list.get(indexOne);
        int valIndexTwo = list.get(indexTwo);
        list.set(indexOne, valIndexTwo);
        list.set(indexTwo, valIndexOne);
    }

    //Question 3
    public void findValue(LinkedList<Integer> list, int searchVal){
        int indexVal = -1;
        for (int i = 0; i < list.size(); i++) {
            int llElement = list.get(i);
            if (llElement == searchVal) {
                indexVal = i;
                break; //Break out of the for loop
            }
        }

        if (indexVal == -1){
            System.out.println("The value " + searchVal + " was not found in the LinkedList");
        }
        else {
            System.out.println("The values " + searchVal + " was found at index " + indexVal);
        }
    }

    //Question 4
    public void addAndSortHash(HashMap<Integer, Integer> hm, int value){
        hm.put(value, value); //Add the user input value into the HashMap
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(); //Initialize TreeMap
        sortedMap.putAll(hm); //Place the keys and values from HashMap to TreeMap

        //Display the TreeMap (which is naturally sorted)
        for (Map.Entry<Integer, Integer> entry: sortedMap.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }

    //Question 5
    public void swapValuesHash(LinkedHashMap<Integer, Integer> list, int indexOne, int indexTwo){
        Set<Integer> keys = list.keySet(); //Set is a collection that contains no duplicate element
        //Store all the keys from the LinkedHashMap into the set named 'keys'
        int firstValue = list.get(indexOne); //Obtain the value stored at the first index value
        int secondValue = list.get(indexTwo); //Obtain the value stored at the second index value
        for (Integer key: keys){ //Iterate through the list of keys
            if (key == indexOne){ //If matches
                list.put(indexOne, secondValue); //Swap
                list.put(indexTwo, firstValue);
            }
        }
    }

    //Question 6
    public void findValueHash(LinkedHashMap<Integer, Integer> list, int searchVal){
        Set<Integer> keys = list.keySet();
        for (Integer key: keys){ //Iterate through all the key values
            if (searchVal == list.get(key)){ //Compare the search value with the key value
                System.out.println("The value " + searchVal + " is found at index " + key);
            }
        }
        System.out.println("The value " + searchVal + " was not found in the list"); //Return this print statement if not found
    }
}
