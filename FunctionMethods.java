import java.util.Scanner;

public class FunctionMethods {
        // public static void PrintMyName(String name){
        //     System.out.println(name);
        //     return;
        // }
        // public static void main(String args[]) {
        //     Scanner sc = new Scanner(System.in);
        //     String name= sc.next();
        //     PrintMyName(name);   // function call
        // }


        // // make a function to add 2 numbers and return th sum?
        // public static int calculateSum(int a, int b){
        //     int sum=a+b;
        //     return sum;
        // }
        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     int a=sc.nextInt();         
        //     int b=sc.nextInt();


        //     int sum = calculateSum(a,b);
        //     System.out.println("sum of 2 number is "+sum);
        // }


        // //make a function to multiply 2 numbers and return th product?
        // public static int calculateProduct(int a, int b){
        //     int Product =a*b;
        //     return Product;
        // }
        // public static void main(String[] args) {
        //     Scanner sc =new Scanner(System.in);
        //     int a =sc.nextInt();
        //     int b =sc.nextInt();
        // int Product = calculateProduct(a , b);
        // System.out.println(Product);
        // }


        // //make a function to calculate a factorial of a number and rturn factorial?
        // public static void printFactorial(int n){
        //     if(n<0){
        //         System.out.println("invalid no.");
        //         return;
        //     }
        //     int factorial=1;
        //     for(int i=n;i>=1;i--){
        //         factorial=factorial*i;
        //     }
        //     System.out.println(factorial);
        //     return;
        // }
        //     public static void main (String[]args){
        //         Scanner sc=new Scanner(System.in);
        //         int n = sc.nextInt();

        //         printFactorial(n);


public static void calculateFactorial(int n) {
  int Factorial=1;
  for(int i=n;i>=1;i--){
  Factorial = Factorial*i;
  }
  System.out.println(Factorial);
  return;
}
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n =sc.nextInt();
    

    calculateFactorial(n);

}
}
        

    
    
