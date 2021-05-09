import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class wk1day2 {
    public static void main(String[] args) {
        String name = "Matt";
        String name2 = "Matt";

        String name3 = new String("Rickie");
        String name4 = new String("Rickie");

        // System.out.println(name == name2);
        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4));

        String[] people = {"Matthew", "Bronson", "Rickie", "Aaron"};

        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(numbers);

        for(int j = 0; j< numbers.length; j ++) {
            System.out.println(numbers[j]);
        }
//after import Arrays
        System.out.println(Arrays.toString(numbers)); 

//collection (superclass)
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        System.out.println(stringList);

        System.out.println(stringList.contains("one"));
        System.out.println(stringList.contains("pizza"));

        // System.out.println(numbers[3]);
        System.out.println(stringList.get(0));
        System.out.println(stringList.indexOf("one"));

        for (int k = 0; k < stringList.size(); k++) {
            System.out.println(stringList.get(k));
        }

        //for Each loop
        for(String  thisNumber : stringList){
            System.out.println(thisNumber);
        }

        //var object = {}
        //hashmaps
        Hashmap<String, String> ourHobbies = new Hashmap<String, String>();
        ourHobbies.put("Matthew", "Photography");
        ourHobbies.put("Bronson", "Bodybuilding");
        ourHobbies.put("Jonathan", "Golfing");
        ourHobbies.put("Rickie", "Architecture");
        ourHobbies.put("Steve", "Golfin");
        ourHobbies.put("Aaron", "backpacking");
        ourHobbies.put("Hwasoo", "Golf");
        ourHobbies.put("Evghenia", "Singing");
        ourHobbies.put("Will", "Python");
        System.out.println(ourHobbies);
        
        
        
    }
}
