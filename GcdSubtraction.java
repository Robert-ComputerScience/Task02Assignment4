public class GcdSubtraction
{


 // I modified it so It can subtract instead of using the modulus operator
    public static int gcdSubtraction(int x, int y) {
        if (x == y) // base case
            return x;
        else if (x > y)
            return gcdSubtraction(x - y, y);
        else
            return gcdSubtraction(x, y - x);
    }
 // Prints The Subtracted GCD
    public static void main(String[] args) {
        int rS = gcdSubtraction(118, 448);
        System.out.println("GCD Subtraction: " + rS);
    }
}
