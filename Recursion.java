import java.util.*;

public class Recursion {
    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative
     */
    public static double sqrt(double n, double tolerance){
      return sqrtHelpM(n,1,tolerance);
    }

    private static double sqrtHelpM(double n, double guess, double tolerance) {
      if (n == 0) return 0;
      if (n == 1) return 1;
      if (Math.abs((guess * guess - n)/n) >= tolerance) {
        return sqrtHelpM(n, ((n/guess+guess)/2), tolerance);
      }
      return guess;
    }

   /*Recursively find the n'th fibbonaci number in linear time
    *fib(0) = 1; fib(1) = 1; fib(5) = 5
    *precondition: n is non-negative
    */
   public static int fib(int n){
     return fibHelpM(n,0,1);
   }

   private static int fibHelpM(int n, int firstN, int secN) {
     if (n == 0) return 0;
     if (n == 1) return secN;
     return fibHelpM(n-1,secN,firstN+secN);
   }

  /*Recursively finds and returns all the subset totals of the numbers
   *1 to n inclusive in an ArrayList of integers
   *precondition: n is non-negative
   */
   public static ArrayList<Integer> makeAllSums(int n){
     ArrayList<Integer> ansList = new ArrayList<Integer>();
     makeAllSumsHelpM(n,0,ansList);
     return ansList;
   }

   private static void makeAllSumsHelpM(int n, int sum, ArrayList<Integer> sums) {
     if (n==0) sums.add(sum);
     if (n != 0) {
       makeAllSumsHelpM(n-1,sum,sums);
       makeAllSumsHelpM(n-1,sum+n,sums);
     }
   }

   public static void main(String[] args) {
     System.out.println("Testing sqrt method");
     System.out.println("sqrt(2,.0000001) = 1.4142: " + sqrt(2, .0000001));
     System.out.println("sqrt(100,.0000001) = 10: " + sqrt(100, .0000001));
     System.out.println("sqrt(49,.0000001) = 7: " + sqrt(49,.0000001));

     System.out.println("\nTesting fib method");
     System.out.println("fib(0) = 0: " + fib(0));
     System.out.println("fib(1) = 1: " + fib(1));
     System.out.println("fib(2) = 1: " + fib(2));
     System.out.println("fib(3) = 2: " + fib(3));
     System.out.println("fib(4) = 3: " + fib(4));
     System.out.println("fib(5) = 5: " + fib(5));
     System.out.println("fib(8) = 21: " + fib(8));
     System.out.println("fib(10) = 55: " + fib(10));

     System.out.println("\nTesting makeAllSums method");
     System.out.println("makeAllSums(3): [0, 3, 2, 5, 1, 4, 3, 6]");
     System.out.println(makeAllSums(3));
     System.out.println("makeAllSums(2): [0,1,2,3]");
     System.out.println(makeAllSums(2));
   }

}
