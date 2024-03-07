public class GcdSubtraction
{


 // I modified it so It can subtract instead of using the modulus operator
 // Using an else if to subtract it both ways
 public static int gcd(int x, int y) {
     if (x < y) {
         return gcd(y, x); // swap x and y if x is less than y
     } else if (y == 0) {
         return x; // gcd is x when y is 0
     } else {
         return gcd(y, x - y); // recursive call
     }
 }
 // Prints The Subtracted GCD
    public static void main(String[] args) {
        int rS = gcd(48, 18);
        System.out.println("GCD Subtraction: " + rS);
    }
}
