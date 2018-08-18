import java.util.Scanner;
class Reverse
{
 public static void main(String args[])
 {
  int n,temp=0,a,r;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter no to reverse");
  n=sc.nextInt();
  while(n>0)
  {
   r=n%10;
   temp=temp*10+r;
   n=n/10;
  }
  System.out.println("the reversed no is "+temp);
 }
}