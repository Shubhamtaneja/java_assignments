import java.util.Scanner;
class Leap
{
 public static void main(String args[])
 {
	 int year;
   Scanner sc= new Scanner(System.in);
   
   
   System.out.println("Enter the year that you want to check");
   year= sc.nextInt();
     if((year%4)==0 && (year%400)==0)
     {
  	  System.out.println("it is leap year");	
     }
      else if(year%100==0)
       System.out.println("NO it is not leap year");
      else
  	   System.out.println("it is  not leap year");	

 
 }
}