import java.util.ArrayList;
import java.util.Arrays;

public class Sort {

    public static int[] bubbleSort(int[] array) {
        int temp;

        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        //swapping the adjacent elements if they are not in order

        return array;

    }

    public static String[] bubbleSort(String[] array) {
        String temp;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length-i-1; j++){
                if(array[j].toLowerCase().compareTo(array[j+1].toLowerCase()) > 0){ //the method checks, if the number returned is > 0 then it is different
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(array));


        return array;

    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {

        int temp;

        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size() - 1 - i; j++){
                if(list.get(j) > list.get(j + 1)){
                    temp = list.get(j);
                    list.set(j, list.get(j + 1)); // Set current to next
                    list.set(j + 1, temp); // Set next to current

                }
            }
        }

        return list;

    }

    public static int[] selectionSort(int[] array) {
       // array = new int[]{1, 1, 2, 3, 4, 5, 9, 11, 12, 12, 13, 14, 16, 19, 19, 20, 21, 25, 32, 34};

        int temp;
        int mIndex = 0;

        for(int i = 0; i < array.length; i++){
            mIndex = i;

            for(int j = i+1; j < array.length; j++){

                if(array[i] > array[j]){
                    mIndex = j;
                    temp = array[i];
                    array[i] = array[mIndex];
                    array[mIndex] = temp;
                }
            }
        }


        return array;
    }

    public static String[] selectionSort(String[] array) {
        for(int i = 0; i < array.length-1; i++){
            int minIndex = i;
            String minStr = array[i];

            for(int j = i + 1; j < array.length; j++){
                if(array[j].toLowerCase().compareTo(minStr.toLowerCase())<0){
                    minStr = array[j];
                    minIndex = j;
                }
            }

            if(minIndex != i){
                String temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }

        System.out.println(Arrays.toString(array));



        return array;

    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {

        String temp; // temporary variable for swapping
        int mIndex; //index of minimum index
        String minStr; //minimum string found in the current iteration

        for(int i = 0; i < list.size() - 1; i++){
            mIndex = i;
            minStr = list.get(i);


            for(int j = i+1; j < list.size(); j++){

                if(list.get(j).toLowerCase().compareTo(minStr.toLowerCase()) < 0 ){
                    minStr = list.get(j); //minimum string is the content of j
                    mIndex = j; // minimum index is set to j
                }

            }

            //if the minimum has changed, swap the elements
            if(mIndex != i){
                temp = list.get(mIndex); //
                list.set(mIndex, list.get(i));
                list.set(i, temp);
            }
        }
        System.out.println(Arrays.toString(list.toArray()));



        return list;

    }

}
