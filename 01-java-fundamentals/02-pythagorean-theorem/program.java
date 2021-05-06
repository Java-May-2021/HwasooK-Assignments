public class program {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        byte myByte = 100;
        short myShort = 1000;
        int myInt = 10000000;
        long myLong = 100000000000L;
        float myFloat = 3.14f;
        double myDouble = 3.144516567;
        boolean myBoolean = false;
        char myChar = 'a';

        Integer myInteger = 39;
        Character myCharacter = 'd';
        

        //strings
        String myName = "Hwasoo";
        System.out.println(myName.length());


        int isOdd = 5;
        if(isOdd % 2 != 0){
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is not odd");
        }

        String name = "Hwasoo";
        String name2 = "Hwasoo";
        System.out.println(name.equals(name2));

        //loops
        int i = 0;
        while(i < 4) {
            System.out.println(i);
            i++;
        }

        for (int j = 0; j<4; j++) {
            System.out.println(j);
        }

        

    }
}