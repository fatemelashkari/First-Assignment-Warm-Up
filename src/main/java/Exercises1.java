import java.util.Scanner;
public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        if(n == 1 || n == 0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        char[][] triangle = new char[rows][];
        for (int i = 0; i < rows; i++) {
            triangle[i] = new char[i + 1]; // Each row has i + 1 columns
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = '*'; // Fill each position with '*'
            }
        }
        return triangle;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int n;
            n = in.nextInt();
            Exercises1 obj = new Exercises1();
            System.out.println(obj.factorial(n));
            n = in.nextInt();
            System.out.println(obj.fibonacci(n));
            //for triangle
            n = in.nextInt();
            char[][] triangle = obj.generateTriangle(n);
            for (int i = 0 ; i < triangle.length ; i++) {
                for (int j = 0 ; j < triangle[i].length ; j++) {
                    System.out.print(triangle[i][j] + " ");
                }
                System.out.println();
            }

        }

    }

}