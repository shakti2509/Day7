package ASS2;

public class Book {
	private float price;
	private static int bid=1;
	public Book()
	{
		price=2015.56f;
		bid++;
	}
	public Book(float price,int bid) {
	
		this.bid=bid++;
		this.price = price;
	}
	public void display ()
	{
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("book id:"+bid);
		System.out.println("book price"+price);
	}
	

}
