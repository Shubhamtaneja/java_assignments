import java.util.Scanner;
class Add
{
 public static void main(String args[])
 {
   float a,b,c;
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter values of a and b");
   a= sc.nextFloat();
   b= sc.nextFloat();
   c=a+b;
   System.out.println("The sum of a and b is "+c);
 }
}