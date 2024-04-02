import java.util.*;
class reverse_order {
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.print("Enter number less than 100: ");
short short_num = sc.nextShort();

while (short_num >=0){
if(short_num%2!=0){
System.out.println(short_num);

}
--short_num;
}

}
}