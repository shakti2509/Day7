package ASS3;

public class Date {
	private int day,month,year;
	private static int cnt=1;
	public Date()
	{ cnt++;
		day=month=1;
		year=2022;
	}
	public Date(int day, int month, int year) {
		super();
		cnt++;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void display()
	{
		System.out.println("-------------------------------------------------------------------------------------------------------");
		System.out.println("Date is :"+day);

		System.out.println("month is :"+month);
		System.out.println("count is "+cnt);

	}
	

}
