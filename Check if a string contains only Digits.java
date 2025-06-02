/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a= sc.nextLine();
		for(int i=0; i<a.length(); i++) {
			char ch=a.charAt(i);
			if(Character.isDigit(ch)==false){
			System.out.println("Not Digits");
			System.exit(0);
			}
		}
			System.out.println("Digits");
		
	}
}	