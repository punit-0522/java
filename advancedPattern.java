public class advancedPattern {
    public static void main(String[] args) {
        // int n=4;
        // //upper part
        // for(int i=1;i<=n;i++){
        //     // right part
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     //space print
        //     int spaces= 2*(n-i);
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     //left part
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // //lower part
        //  for(int i=n;i>=1;i--){
        //     // right part
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     //space print
        //     int spaces= 2*(n-i);
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     } 
        //     //left part
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i);j++){
        //     System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println("");
        // }


        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for (int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     int m=2*i-1;
        //     for(int j=1;j<=m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     int m=2*i-1;
        //     for(int j=1;j<=m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // another way of printing diamond
        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i;j++){
        //     System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //     System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
        //      for(int i=n;i>=1;i--){
        //     for(int j=1;j<=n-i;j++){
        //     System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //     System.out.print("*"+" ");
        //     }
        //     System.out.println();
        // }
       
    //  --------------------------------------------H W----------------------


        // // // HOLLOW BUTTERFLY
        // int n=5;
        //  // Upper half
        // for (int i = 1; i <= n; i++) {
        //     // Left wing
        //     for (int j = 1; j <= i; j++) {
        //         if (j == 1 || j == i) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     // Spaces
        //     for (int j = 1; j <= 2 * (n - i); j++) {
        //         System.out.print("  ");
        //     }
        //     // Right wing
        //     for (int j = 1; j <= i; j++) {
        //         if (j == 1 || j == i) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        //    // lower half
        // for (int i = n; i >= 1; i--) {
        //     // Left wing
        //     for (int j = 1; j <= i; j++) {
        //         if (j == 1 || j == i) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     // Spaces
        //     for (int j = 1; j <= 2 * (n - i); j++) {
        //         System.out.print("  ");
        //     }
        //     // Right wing
        //     for (int j = 1; j <= i; j++) {
        //         if (j == 1 || j == i) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

    
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<= n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=n;j++){
        //         if(i == 1||j == 1||i == n||j == n){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //             System.out.println();

        // }
    
    // // print pascal's triangle
    // int n=5;
    // for(int i=0;i<=n;i++){
    //     for(int j=0;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     int number =1;
    //     for(int j=0;j<=i;j++){
    //         System.out.print(number+" ");
        
    //     number=number*(i-j)/(j+1);
    //     }
    //     System.out.println();
    // }


    // // print half pyramid
    // int n=5;
    // for(int i=1;i<=n;i++){
       
    //     for(int j=1;j<i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }


    // print inverted half pyramid
     int n=7;
    for(int i=n;i>=1;i--){
       
        for(int j=1;j<i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
    
}
    
