import java.util.Scanner;
class Greatest
{
 public static void main(String args[])
 {
 int a,b,c;
 System.out.println("Enter 3 value");
 Scanner sc= new Scanner(System.in);
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
 if(a>b && a>c)
 {
    System.out.println("The greatest no is "+a);
 }
 else if(b>a && b>c)
 {
    System.out.println("The greatest no is "+b);
 }   
 else if(c>a && c>b)
 {
        System.out.println("The greatest no is "+c);
 }
 else
 {
    System.out.println("wrong input");
 }
 }
}