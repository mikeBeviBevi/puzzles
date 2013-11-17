/*
 * Make some Triangles with Pascals formula!
 */

/**
 *
 * @author MikeBevi
 */
import java.io.*;

public class PascalsTriangle {

    /**
     * @param args the command line arguments
     */
    static BufferedReader stdin =
            new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        // TODO code application logic here
        int userInput=0;
        int n=0;
        while(userInput!=5){ 
        try {
            System.out.println("Press 1 for triangle, 2 for coefficient or 3 for"
                    + " coefficient in array, or 4 for coefficient using formula, press 5 to exit");
            userInput = Integer.parseInt(stdin.readLine());
            int k = 0;
            if (userInput == 2) {
                System.out.println("Please enter n:");
                n = Integer.parseInt(stdin.readLine());
                System.out.println("Please enter k:");
                k = Integer.parseInt(stdin.readLine());
                System.out.println(pascals(n, k));
            } else {
                if (userInput == 1) {
                    System.out.println("Please enter n:");
                    n = Integer.parseInt(stdin.readLine());
                    makeTriangle(n);


                } else {
                    if (userInput == 3) {
                        System.out.println("Please enter n:");
                        n = Integer.parseInt(stdin.readLine());
                        System.out.println("Please enter k:");
                        k = Integer.parseInt(stdin.readLine());
                        findInTriangle(n, k);
                    } else {
                        if (userInput == 4) {
                            System.out.println("Please enter n:");
                            n = Integer.parseInt(stdin.readLine());
                            System.out.println("Please enter k:");
                            k = Integer.parseInt(stdin.readLine());
                            findCoefficientFormuala(n,k);
                        }
                    }
                }
                if(userInput==5)
                    System.exit(0);
            }
        } catch (IOException e) {
            System.out.print("Please enter an integer");
        }
        }
    }

    public static int pascals(int n, int k) {

        if ((k == 0) || (n == k)) {
            return 1;
        } else {
            if (n > k && k > 0) {
                return pascals(n - 1, k) + pascals(n - 1, k - 1);
            } else {
                return 0;
            }

        }
    }

    public static void makeTriangle(int n) {
        int triangle[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            triangle[i][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int k = 1; k < n; k++) {
                triangle[i][k] = triangle[i - 1][k - 1] + triangle[i - 1][k];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(triangle[i][k] + " ");
            }
            System.out.println();
        }
    }

    public static void findInTriangle(int n, int k) {
        if (k == 0)//first posistion of triangle
        {
            System.out.println("1");
        } else {
            int triangle[][] = new int[n + 1][n + 1];
            for (int i = 0; i < n + 1; i++) {
                triangle[i][0] = 1;
            }
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }

            }
            System.out.println(triangle[n][k]);
        }
    }

    //this method only works for numbers 
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //multiplicative formula
    public static void findCoefficientFormuala(int n, int k) {
int result=1;
      for (int i = n - k + 1; i <= n; i++) {
			result= result*i;
		}
		for (int i = 1; i <= k; i++) {
			result= result/i;
		}
		System.out.println(result);
	}
    }

