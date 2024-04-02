import java.util.Scanner;
class calculator {
public static void main (String args[]){
Scanner input = new Scanner (System.in);

while (true){
System.out.print("Enter nummber 1: ");
int num1 = input.nextInt();
System.out.print("Enter nummber 2: ");
int num2 = input.nextInt();

System.out.print("Enter Operator symbol: ");
char symbol = input.next().charAt(0);

switch (symbol){
case '+' :
System.out.println("Addition : "+ (num1 + num2));
break;
case '-' :
System.out.println("Subtraction : "+ (num1 - num2));
break;
case '*' :
System.out.println("Multiplication : "+ (num1 * num2));
break;
case '/' :
System.out.println("Divion : "+ (num1 / num2));
break;
default :
System.out.println(symbol+" does not exist");
break;
}

System.out.print("if you want cancel Press --> n <--  ");
char cancel = input.next().charAt(0);
if(cancel == 'n'){
System.out.println("Your program has been ended");
break;
}
}
}
}