public class Recursion {

  /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
  //  public static double sqrt(double n, double tolerance){

//    }

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
//   public static ArrayList<Integer> makeAllSums(int num){

//   }

   public static void main(String[] args) {
     System.out.println("Testing fib method:");
     System.out.println("fib(0): " + fib(0));
     System.out.println("fib(1): " + fib(1));
     System.out.println("fib(2): " + fib(2));
     System.out.println("fib(3): " + fib(3));
     System.out.println("fib(4): " + fib(4));
     System.out.println("fib(5): " + fib(5));
     System.out.println("fib(10): " + fib(10));
   }

}
