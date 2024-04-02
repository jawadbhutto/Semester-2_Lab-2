import java.util.Scanner;
class bhutto_mart {
public static void main (String args[]){
Scanner sc = new Scanner (System.in);

System.out.println("Hello\t Aslam o Alikum\n Welcome to Bhutto Friut Shop");

System.out.print("How many Items you want to purchase --> ");
byte item = sc.nextByte();
int total = 0;

for(int i = 0; i<(int)item; i++){

System.out.println("Button     Item Type       Price ");
System.out.println("Press 1    Apple           300 ");
System.out.println("Press 2    PineApple       500 ");
System.out.println("Press 3    Coconut         400 ");
System.out.println("Press 4    Oranges         100 ");

short press = sc.nextShort();
int kg = 0;
switch (press){
case 1 :
System.out.println("How many kg of Apple: ");
 kg = sc.nextInt();
kg = kg * 300;
total = total +  kg;
break;
case 2 :
System.out.println("How many kg of Pineapple: ");
 kg = sc.nextInt();
kg = kg * 500;
total = total +  kg;
break;
case 3 :
System.out.println("How many kg of Coconut: ");
 kg = sc.nextInt();
kg = kg * 400;
total = total +  kg;
break;
case 4 :
System.out.println("How many kg of Orange: ");
kg = sc.nextInt();
kg = kg * 100;
total = total +  kg;
break;
default :
System.out.println("We have not Other Fruits ");
--i;
}
}
System.out.print("Your Total Bill --> "+total);
}
}