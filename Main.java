public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        //for(init; termination; increment;) { //basic format of a for loop
        //}
        //init: code that will be initialized once at the start of the loop
        //termination: telling the for loop how we want to exit, evaluates to false
        //increment: expression that's invoked after each iteration of the loops each time the loop goes around

        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for (i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));

        int count = 0;
        for (int i = 10; i<50; i++) {
            if(isPrime(i)) {
                count ++;
                System.out.println("Number " + i + " is a prime number");
                if(count ==3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

//    Create a for statement using any range of numbers.
//    Determine if the number is a prime number using the isPrime method below
//    If it is a prime number, print it out AND increment a count of the number of prime numbers found
//    if that count is 3, exit the for loop
//    hint: use the break; statement to exit

    public static boolean isPrime(int n) {

        if(n==1) {
            return false;
        }

        for(int i=2; i<= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

    }






}
