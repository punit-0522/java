import java.util.Scanner;
public class loop {
    public static void main (String  args[]){
        // for(int a=0; a<11; a++){
        //     System.out.println(a);
        // }
          


        // int i=0;
        // while (i<11) {
        //     System.out.println("hello");
        //     i++;
        // }


        // int i=0;
        // do{
        //     System.out.println("hello");
        //     i++;
        // }
        // while(i<10);

//(Q:print the sum of first natural n number.)
        // Scanner sc=new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum=0;
        // for(int i=0; i<=n;i++){
        //     sum=sum+i;
        // }
        // System.out.println(sum);


//(Q:print the table of a number input by user.)
 Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
for(int i=1; i<=10; i++){ 
System.out.println(n*i);
}
    }
}
