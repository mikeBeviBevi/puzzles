//Purpose: Data Structure and Algorithms Lab 7
//Author: Mike Bevi
//Version: 1.0 (Final)
//Status: Complete and thoroughly tested
//Last update: 10/25/11


/**
 */
import java.io.*;

public class TowersOfHannoi {

    static BufferedReader stdin =
            new BufferedReader(new InputStreamReader(System.in));
    static int numberOfDiskMoves = 0;
    static int numberOfCalls = 1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("This is a Tower of Hannoi simulator");
        System.out.println("Please enter the Integer amount of Disks on the tower:");
        try {
            int n = Integer.parseInt(stdin.readLine());
            solve(n, "Initial", "Destination", "Temporary");
        } catch (IOException e) {
            System.out.println("Please enter an Integer Number");
        }
        System.out.println("Number of calls: " + numberOfCalls);
        System.out.println("Number of Disk Moves: " + numberOfDiskMoves);
    }

    public static void solve(int n, String i, String d, String t) {
        if (n == 0) {
            System.out.println("Ther are no disks to move!");
        } else {
            if (n > 0) {
                numberOfCalls++;
                solve(n - 1, i, t, d);
                System.out.println("Move disk " + n + " from " + i + " to " + d + ".");
                numberOfDiskMoves++;
                numberOfCalls++;
                solve(n - 1, t, d, i);
            }

        }
    }
}