import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.*;

public class PuzzleJava {
    public int sumOfArr(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //print greater than 10
    public ArrayList<Integer> gtrThanTen(int[] arr) {
        ArrayList<Integer> GreaterThanTen = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                GreaterThanTen.add(arr[i]);
            }
        }
        return GreaterThanTen;
    }

    //shuffleNames
    public ArrayList<String> shflArr(ArrayList<String> arr) {
        Collections.shuffle(arr);
        return arr;
    }

    //print names longer than 5
    // public ArrayList<String> gtrThanFive(ArrayList<String> arr){
    //     ArrayList<String> GreaterThanFive = new ArrayList<String>();
    //     for (int i = 0; i < arr.length; i++) {
    //         if(arr.get(i).length()>5) {
    //             GreaterThanFive.add(arr.get(i));
    //         }
    //     }
    //     return GreaterThanFive;
    // }

//Two6letters





    
}
