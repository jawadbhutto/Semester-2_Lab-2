import java.util.Scanner;
class validation {
public static void main(String args[]){

Scanner sc = new Scanner (System.in);
System.out.print("Enter any Character --> ");
char symbol =  sc.next().charAt(0);

switch(symbol){
case 'a' :
System.out.println(symbol+" is Vowel ");
break;
case 'e' :
System.out.println(symbol+" is Vowel ");
break;
case 'i' :
System.out.println(symbol+" is Vowel ");
break;
case 'o' :
System.out.println(symbol+" is Vowel ");
break;
case 'u' :
System.out.println(symbol+" is Vowel ");
break;
case 'y' :
System.out.println(symbol+" is Semi-Vowel ");
break;
default :
System.out.println(symbol+" is Invalid ");
break;

}
}
}