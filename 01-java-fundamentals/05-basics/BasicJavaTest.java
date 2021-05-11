import java.util.ArrayList;
import java.util.Arrays;

public class BasicJavaTest {
    public static void main(String[] args){

        int [] arr = {1,3,5,7,9,13};

        BasicJava BJ = new BasicJava();

        System.out.println("Print 1 to 255");
        //BJ.oneTo255();

        System.out.println("Print odd numbers between 1-255");
        //BJ.printOdd();

        System.out.println("Print Sum");
        //BJ.printSum();

        System.out.println("Iterating through an array");
        //BJ.iterateArray(arr);

        System.out.println("Find Max");
        //BJ.findMax(arr);
        System.out.println("Get Average");
        //BJ.getAvg(arr);

        System.out.println("Array with Odd Numbers");
        //ArrayList<Integer> arrOdd = BJ.arrayWithOdd();
        //System.out.println(arrOdd);

        System.out.println("Greater Than Y");
        //int greater = BJ.gtrThanY(arr, 3);
        //System.out.println(greater);


        System.out.println("Square the values");
        int [] SquareArr = BJ.squareTheValue(arr);
        System.out.println(Arrays.toString(SquareArr));
        

        System.out.println("Eliminate Negative Numbers");
        int [] EliminateNeg = BJ.elimNeg(arr);
        System.out.println(Arrays.toString(EliminateNeg));

        System.out.println("Max, Min, and Average");
        double [] MaxMinAvg = BJ.mMA(arr);
        System.out.println(Arrays.toString(MaxMinAvg));





    }

}



//        ////System.out.println("Square the values");
        ////int SquareArr = BJ.sqrTheVal(arr);
        ////System.out.println(Arrays.toString(SquareArr));