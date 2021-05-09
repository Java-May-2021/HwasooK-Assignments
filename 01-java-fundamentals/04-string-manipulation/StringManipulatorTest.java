public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator s = new StringManipulator();

        //1
        String str = s.trimAndConcat("   Hello   ", "   World   ");
        System.out.println(str);

        //2
        char letter = 'o';
        Integer a = s.getIndexOrNull("Coding", letter);
        Integer b = s.getIndexOrNull("Hello World", letter);
        Integer c = s.getIndexOrNull("Hi", letter);
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c);

        //3
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer d = s.getIndexOfNull(word, subString);
        Integer e = s.getIndexOfNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // null


        //4
        String wordy = s.concatSubstring("Hello", 1, 2, "world");
        System.out.println(wordy); //



    }
}