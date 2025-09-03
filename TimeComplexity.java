// BEST CASE: O(1)
// AVERAGE CASE:O(n+1/2)
// WORST CASE:O(n)

import java.util.Scanner;

// eg:1
public class TimeComplexity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("hello world");
            }
        }
    }
}
// TIME COMPLEXITY : (n*n times)=O(n^2)

// eg:2
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("hello");
            }
        }
    }
    // TIME COMPLEXITY: O(n*m)

// eg:3
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        for (int i=0;i<n;i++){
        System.out.println("hello");
     }
            for(int j=0;j<m;j++){
                System.out.println("world");
            }
    }
// TIME COMPLEXITY:O(n+m)

