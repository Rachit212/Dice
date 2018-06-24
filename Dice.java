import java.io.*;
import java.util.Random;
public class Dice {
 public void roll(int faces) {
	 Random random=new Random();
 int a;
 if(faces==2) {
	 a=random.nextInt(2)+1; 
	 if(a==1)
		 System.out.println("Heads");
	 else
		 System.out.println("Tail");
 }

 else if(faces==4 || faces==5 || faces==6)
		      System.out.println(random.nextInt(faces)+1);
		  else
		      System.out.println("Error");
 }	
 }
class Dice_Roll
{
	public static void main(String args[]) {
		Dice d=new Dice();
		d.roll(5);	
	}
	
}

