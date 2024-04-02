import java.util.Scanner;
class sum_average {
public static void main (String args[]){

Scanner sc = new Scanner (System.in);

System.out.print("Enter total courses : ");
byte total_course = sc.nextByte();

int total_mark = 0;
for(int i = 1; i<=(int)total_course; i++){
System.out.print("Enter Subject "+i+" marks : ");
int subject_mark = sc.nextInt();
if(subject_mark>=0&&subject_mark<=150){
total_mark = total_mark + subject_mark;
}
}

System.out.println("Total Sum : "+total_mark);
System.out.println("Average --> "+(total_mark/total_course));

}


}