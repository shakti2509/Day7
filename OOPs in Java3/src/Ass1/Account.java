package Ass1;

public class Account {
	private int acno;
	private static float intr;
	private float balance;
	static 
	{ 
		intr=1.5f;
	}
	 public Account()
	 {
		 acno=0;balance=0;
		 intr=1.5f;
	
	 }
	 
	 public Account (int a,float i,float b)
	 {
		 acno=a;
		 intr=i;
		 balance=b;
	 }
	 public static void  Upintr(float r)
	 {
		 intr=r;
}
	 public void calbal()
	 {
		 float   c=(balance*intr)/100;
		    balance= balance + c ;
	 }
	 public void display()
	 {
		 System.out.println("--------------------------------------------");
		 System.out.println("account no is :"+acno);
		 System.out.println("balance is :"+balance);
		 System.out.println("intrest rate :"+intr);
		 
		 
	 }
	 }
