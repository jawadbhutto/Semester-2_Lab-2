import java.util.Scanner;
class lucky_number {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);

boolean check = false ;

for(int i=0 ;i<5 ; i++){
System.out.print("Enter guess number : ");
int guess = sc.nextInt();

if(guess==786){
check = true ;
break;
}
else{
System.out.println("Try Again your Luck");
}
}
if(check){
System.out.println("Congratulations \n You Won ");
}
else{
System.out.println("You loose the match");
}

}

}