package ASS6;

public class Box {
	private int height,width,length;
	public Box()
	{
		height=length=width=1;
	}
	
     public Box( int height, int width,int length)
     {
    	 this.height=height;
    	 this.length=length;
    	 this.width=width;
     }
     public void display()
     {
    	 System.out.println("volume is :"+(length*width*height));
     }
	
		
		

	}


