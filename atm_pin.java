import java.util.Scanner;
class atm_pin {
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
boolean condition = false ;

for(int i = 0 ; i<3 ; i++){
System.out.print("Enter four digit ATM Pin Code --> ");
int atm_pin = sc.nextInt();

if(atm_pin == 7866){
condition = true ;
break ;
}
else {
System.out.println("Your PIN code is Incorrect \n\tYTry Again ");
}
}

if(condition){
System.out.println("Welcome" );
}
else {
System.out.println("Your ATM Card has been Blocked ");
}
}
}