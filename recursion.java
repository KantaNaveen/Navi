/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public void fun(int n)
	{if(n==1)return;
	System.out.println(n);
	fun(n+1);
	System.out.println(n);
	}
	public static void main(String[] args){
	    Main m=new Main();
	    m.fun(1);
	}
}