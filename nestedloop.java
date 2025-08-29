
public class nestedloop {

  public static void main(String[] args) {
        int n=4;
        int m=5;

        // // Q/ print the square using '*'? 
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("*");
        // }

        
    // // Q/ print the hollow rectangle ?
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=m;j++){
    //         if(i==1||j==1||i==n||j==m){
    //             System.out.print("*");
    //         }else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }


    // //Q/ ptint the right angle triNgle using "*"?
    // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        //     System.out.print("*");
        // }
        // System.out.println();
    // }


    // //Q/ ptint the right angle triNgle using "*"?(rotated by 180 deg)
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    // //Q/ print the left angle triangle using "*"?
    //  outer loop
    //  for(int i=1;i<=n;i++){
    //     //inner loop -> space print
    //      for(int j=1;j<=n-i;j++){
    //          System.out.print(" ");
    //      }
    //      //inner loop -> star print
    //      for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //      }
    //      System.out.println();
    //     }


    // //Q/ print the right angle triangle using no.s ?
    // for(int i=1;i<=m;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    //   // Q/ print the right angle triangle using no.s ?(rotated by 180 deg)
    //    for(int i=m;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }


    // // Q/print the right angle triangle using increasing order no.s ?
    // int num=1;
    // for(int i=1;i<=m;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(num+" ");
    //         num++;
    //     }
    //     System.out.println();
    // }


    // //Q/print the pattern using binary no.s?
    // for(int i=1;i<=m;i++){
    //     for(int j=1;j<=i;j++){
    //         int sum=i+j;
    //         if(sum%2==0){
    //             System.out.print(1);
    //         }else{
    //             System.out.print(0);
    //         }
    //     }
    //     System.out.println();
    // }




    int num=1;
    for(int i=1;i<=m;i++){

           for(int j=1;j<=i;j++){
            int sum=i+j;
            if(sum%2==0){
            System.out.print(1);
            }else{
                System.out.print(0);
            }           
           }
           System.out.println();
        
        }
    }
 } 


