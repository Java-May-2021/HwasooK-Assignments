import java.util.ArrayList;
public class BasicJava {
//Print 1-255
    public void oneTo255(){

        for(int i = 1; i < 256; i++){

            System.out.println(i);
        }
    }
//Print odd numbers between 1-255
    public void printOdd() {
        for(int i = 1; i < 256; i+=2) {
            System.out.println(i);
        }
    }
//Print Sum
    
    public void printSum() {
        int sum = 0;
        for(int i = 1; i < 256; i++) {
            sum += i;
            String PrintStr = "New number: " + i + "Sum: " + sum;
            System.out.println(PrintStr);
        }
    }
//Iterating through an array
    public void iterateArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
//Find Max
    public void findMax(int[] arr) {
        int maxNum = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (maxNum < arr[i]) {
                maxNum = arr[i];
            }
        }
        System.out.println(maxNum);
    }
//Get Average
    public void getAvg(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double)sum/arr.length;
        System.out.println(avg);
    }
//Array with Odd Numbers
    public  ArrayList<Integer> arrayWithOdd(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i<256; i += 2){
            list.add(i);
        }
        return list;
    }
//Greater Than Y
    public int gtrThanY(int[] arr, int y) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y){
                count += 1;
            }
        }
        return count;
    }
//Square the values
    //public int[] sqrTheVal(int[] arr){
        //int[] sqr = new int[arr.length];
        //for (int i = 0; i < arr.length; i ++){
        //    sqr[1] = arr[i]*arr[i];
        //}
        //return sqr;
    //}

    public  int [] squareTheValue(int [] arr){
        int [] sqrarr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){

            sqrarr[i] = arr[i]*arr[i];          
                        
        }

        return  sqrarr;
    }

//Eliminate Negative Numbers
    public int[] elimNeg(int[] arr){
        int[] elimarr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                elimarr[i] = 0;
            }
            else {
                elimarr[i] = arr[i];
            }
        }
        return elimarr;
    }

//Max, Min, and Average
    public double [] mMA(int[] arr){
        double max = (double)arr[0];
        double min = (double)arr[0];
        double sum = 0;

        for (int i = 0; i < arr.length; i ++) {
            sum += arr[i];
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }

        }
        double avg = sum/arr.length;
        double [] returnArr = {max, min, avg};
        return returnArr;
    }








}