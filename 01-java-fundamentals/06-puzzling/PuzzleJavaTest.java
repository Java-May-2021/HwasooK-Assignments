import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.*;

public class PuzzleJavaTest {
    public static void main(String[] args) {
        int[] MyArr = {3,5,1,2,7,9,8,13,25,32};
        PuzzleJava Puzz = new PuzzleJava();

        int totalSum = Puzz.sumOfArr(MyArr);
        System.out.println(totalSum);

            //print greater than 10
        ArrayList<Integer>  GreaterThanTenList = Puzz.gtrThanTen(MyArr);

        System.out.println(GreaterThanTenList);

        //shuffleNames
        String [] names = {"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
        ArrayList<String> NameList = new ArrayList<String>(Arrays.asList(names));

        System.out.println(Puzz.shflArr(NameList));
        //System.out.println(Puzz.gtrThanFive(NameList));


    }
}
