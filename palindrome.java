import java.util.Scanner;
class palindrome {
public static void main( String args[]){
Scanner sc = new Scanner (System.in);

System.out.print("Enter number from 1 - 999  --> ");
int check = sc.nextInt();

int rem,sum=0,temp;    
 
  temp=check;    
  while(check>0){    
   rem=check%10; 
   sum=(sum*10)+rem;    
   check=check/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");
}
}