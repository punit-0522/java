import java.util.*;
public class Recursion3 {
    //Q/----------- Print all the permutations of a string
    // public static void printPerm(String str, String permutation) {
    //     if (str.length() ==0){
    //         System.out.println(permutation);
    //         return;
    //     }
    //         for(int i=0;i<str.length();i++){
    //         char currChar =str.charAt(i);  
    //         String newStr = str.substring(0,i)+str.substring(i+1);
    //         printPerm(newStr, permutation + currChar );        
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "abc";
    //     printPerm(str,"");
    // }


//Q/----------- Count total paths in a maze to move from (0,0) to (n,m)
        // public static int CountPaths (int i , int j , int n , int m){
        //     if(i==n || j==m){
        //         return 0;
        //     }
        //     if(i==n-1 && j==m-1){
        //         return 1;
        //     }
        //     // move downward
        //     int downward = CountPaths (i+1 , j ,n , m);
        //     //move rightward
        //     int rightward = CountPaths(i, j+1 ,n , m);
        //     return downward + rightward;

        // }         
        // public static void main(String[] args) {
        //     int n=3 , m=3;
        //     System.out.println (CountPaths(0, 0, n, m));
        // }         


        // Q3/----------- Place tiles of size 1xm in a floor of size nxm
        // public static int placeTiles(int n, int m) {
        //     if(n == m){
        //         return 2;
        //     }
        //     if (n < m){
        //         return 1;
        //     }
        //     //vertical placementa
        //     int verticalPlacements = placeTiles(n-m , m);
        //     //horizontal placement
        //     int horizontalPlacements = placeTiles(n-1 ,m);
        //     return verticalPlacements + horizontalPlacements;
        // } 
        // public static void main(String[] args) {
        //     int n =4 , m=2;
        //     System.out.println(placeTiles(n, m));
        // }



        //Q4/----------- find the number of ways in which you can invite n people to your party , single or in pairs
         public static int callGuests(int n) {
            if (n<=1){
            return 1;
            }
            //single 
            int way1 = callGuests(n-1);
            //pair
            int  way2 =(n-1)*callGuests(n-2);
            return way1+way2;
         }
         public static void main(String[] args) {
            int n = 3;
            System.out.println(callGuests(n));
         }

//         //Q5/----------- print all all subsets of a set of first n natural numbers 
// public static void printSubset (ArrayList<Integer> subset){
//     for(int i=0;i<subset.size();i++){
//         System.out.print(subset.get(i)+" ");
//     }
//     System.out.println();
// }
// public static void findSubset(int n , ArrayList<Integer> subset){
//     //base case
//     if(n==0){
//         printSubset(subset);
//         return;
//     }
//     //include n in subset
//     subset.add(n);
//     findSubset(n-1 , subset);
//     //exclude n from subset
//     subset.remove(subset.size()-1);
//     findSubset(n-1 , subset);
// }
// public static void main(String[] args) {
//     int n =3;
//     ArrayList<Integer> subset = new ArrayList<>();
//     findSubset(n, subset);
// }
}