/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package InsertionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Integer [] arr={8,4,23,42,16,15};
      InsertionSort(arr);


    }

    public static Integer[]   InsertionSort(Integer[] arr)
    {

        for (int i = 0; i < arr.length ; i++) {
            int j = i - 1;
            int temp = arr[i];

            while (j>=0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j=j - 1;
                System.out.println("j>=0 && arr[j]= true");
                System.out.println("j="+j+"\t arr[j + 1]="+arr[ j+1]+"   temp ="+temp +"\t");}

           System.out.println("j>=0 && arr[j]= false");

                arr[j + 1] = temp ;
           List<Integer> list1 = new ArrayList<Integer>();
            Collections.addAll(list1, arr);
            System.out.println("i= "+i+"\t arr="+list1);
        }
        return arr;

        }

    }

