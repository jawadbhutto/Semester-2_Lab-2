import java.util.Scanner;
class function {
public static void main(String args[]){
Scanner input = new Scanner (System.in);
System.out.print("Enter your name : ");
String name = input.nextLine();
System.out.println("Press -> c <-- for Capital letters ");
System.out.println("Press -> s <-- for small letters ");
char check = input.next().charAt(0);

switch (check){
case 'c' :
System.out.println(name.toUpperCase());
break;
case 's' :
System.out.println(name.toLowerCase());
break;
}
}
}