public class Pythagorean {
    public double calculateHypotenuse(int lenA, int lenB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        double i;
        i = Math.sqrt((lenA*lenA) + (lenB * lenB));
        return i;
    }
}
