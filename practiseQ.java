import java.util.Scanner;

//Q1---------------------------------------
//enter 3 number from the user & make a function to print their average?
public class practiseQ {
    // public static int claculateAverage(int a, int b, int c) {
    // int average = (a + b + c) / 3;
    // return average;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();

    // int average = claculateAverage(a, b, c);
    // System.out.println("average of 3 numbers is " + average);
    // }

    // Q2---------------------------------------
    // //write a function to print the sum of all odd no.s form 1 to n?
    // public static void printSum(int n) {
    // int sum =0 ;

    // for(int i=1;i<=n;i++){
    // if(i%2!=0){
    // sum=sum+i;
    // }
    // }
    // System.out.println(sum);

    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // printSum(n);

    // Q3-----------------------------------
    // // write a function which takes in 2 numbers and return the greater of those
    // two?
    // public static int printGreater(int a, int b) {
    // if (a > b) {
    // return a;
    // } else {
    // return b;
    // }
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int greater = printGreater(a, b);
    // System.out.println(printGreater(a, b));
    // }

    // Q4--------------------------------------
    // // write a function that takes in the radius as input and returns the
    // // circumference of a circle?
    // public static Double getCircumference(Double radius) {
    // return 2 * 3.14 * radius;
    // }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // Double radius = sc.nextDouble();
    // System.out.println(getCircumference(radius));
    // }

    // Q5-------------------------------------------
    // // write a function that takes in age as input and return if the person is
    // // elligible to vote or not. A person of age >18 is eligible to vote.
    // public static boolean isEligible(int age) {
    // if (age > 18) {
    // return true;
    // } else {
    // return false;
    // }
    // }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // int age = sc.nextInt();
    // System.out.println(isEligible(age));
    // }

    // Q6-----------------------------------
    // // write an infinite loop using do while condition?
    // public static void main(String[] args) {
    // do {

    // } while (true);
    // }

    // Q7-----------------------------------
    // // write a program to enter the number till the user wants and at the end it
    // // should display the count of positive,negative and zeros entered ?

    // public static void main(String[] args) {
    // int positive = 0, negative = 0, zeros = 0;
    // System.out.println("press 1 to continue & 0 to stop");
    // Scanner sc = new Scanner(System.in);
    // int input = sc.nextInt();

    // while (input == 1) {
    // System.out.println("enter your number");
    // int number = sc.nextInt();
    // if (number > 0) {
    // positive++;
    // } else if (number < 0) {
    // negative++;
    // } else {
    // zeros++;
    // }
    // System.out.println("press 1 to continue & 0 to stop");
    // input = sc.nextInt();
    // }
    // System.out.println("positives :" + positive);
    // System.out.println("negatives :" + negative);
    // System.out.println("zeros :" + zeros);
    // }

    // Q8-------------------------------------
    // // two numbers are entered by the user, x and n. write a function to find the
    // // value of one number raised to power of another i.e. x^n.

    // public static void main(String[] args) {
    // System.out.println("Enter x");
    // Scanner sc = new Scanner(System.in);
    // int x = sc.nextInt();
    // System.out.println("Enter n");
    // int n=sc.nextInt();

    // int result = 1;
    // for(int i=0;i<n;i++){
    // result=result*x;
    // }
    // System.out.println("x to the power n is :"+ result);
    // }

    // Q9---------------------------------
    // // write a function to calculate the greatest common divisor of 2 number

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n1 = sc.nextInt();
    //     int n2 = sc.nextInt();

    //     while (n1 != n2) {
    //         if (n1 > n2) {
    //             n1 = n1 - n2;
    //         } else {
    //             n2 = n2 - n1;
    //         }
    //     }
    //     System.out.println("GCD is :" + n2);
    // }


    //Q10-------------------------------------------
    // write a program to print fibonacci series of n terms where n is input by user:
    // 0 1 1 2 3 5 8 13 24...
    // int the fibonacci series, a number is the sum of the previous 2 number thet came before it ?

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n =sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" ");
        if(n>1){
            for(int i=2;i<=n;i++){
            System.out.print(b+" ");
            int temp=b;
            b=a+b;
            a=temp;
        }
        System.out.println();
    }
}
}
