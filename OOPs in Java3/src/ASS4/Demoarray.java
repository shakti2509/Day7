package ASS4;

public class Demoarray {
    public static int max(int a[])
    { int m=0;
    	for(int i=0;i<a.length;i++)
    	{   
    		if(m<a[i])
    			m=a[i];		
    	}
    	return m;
    }
    public static int min(int a[])
    { int n=a[0];
    	for(int i=0;i<a.length;i++) {
    		if(n>a[i])
    			n=a[i];
    		
    	}
    	return n;
    }
    public static int avg(int a[]) {
    	int av=0;
    	for(int i=0;i<a.length;i++)
    	{
    		av=av+a[i];
    		
    	}
    	return av/a.length;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {2,34,35,75,12,23,67,997,2222,3,4,17};
		int mx=max(arr);
		int mn=min(arr);
		int av=avg(arr);
		System.out.println("maximum is :"+mx);
		System.out.println("minmum is :"+mn);
		System.out.println("average is : " +av);
		

	}

}
