package fibonaccinumbers;

//Purpose: Data Structure and Algorithms Midterm

//Author: Michael Bevilacqua
//Version: 1.0 (Final)
//Complete and thoroughly tested/
//Last update: 10/18/11
//Submitted:  10/18/11
public class FibonacciNumbers {

    //@ param int n the factorial number to calculate
    //iterative returns factorial of a number n
    public static int iFactorial(int n) {
        int result = 1;
        for (int i = 2; i < n; i++) {
            result = result * i;
        }
        return result;
    }//end iFactorial

    //@param int n the factorial number to be calcualted
    //recurssive method returns factorial of a number n
    public static int rFactorial(int n) {
        int result = 1;
        if (n == 0) {
            result = 1;
        } else {
            result = n * (rFactorial(n - 1));
        }
        return result;
    }//end rFactorial

    //@ param int n the fibanacci number were looking for
    //recurssive method returns fibonacci number n
    public static int rFib(int n) {//recurssive method returns fibonacci number n
        int criticalOperations= (2* rFib(n+1))-1;
        int numberOfCalls = rFib(n+1)-1;
        int result = 1;
        if ((n == 0) || (n == 1)) {
            result = n;
        } else {
            result = rFib(n - 1) + rFib(n - 2);
        }
        return result;
    }//end rFib

    //@ param int n the fobonacci number were looking for
    //iterative method returns fibonacci number n
    public static int iFib(int n) {//iterative method returns fibonacci number n
        int result = n;//so in case of n=0 or 1 returns correctly
        int fk_2 = 1;
        int fk_1 = 0;
        for (int i = 2; i <= n; i++) {//i equals fibanocci # were looking for
            result = fk_2 + fk_1;
            fk_2 = fk_1;
            fk_1 = result;
        }
        return result;
    }//end iFib
    
    
}