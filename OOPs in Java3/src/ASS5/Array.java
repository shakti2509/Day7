package ASS5;
public class Array {
	public static int[] arow(int b[][])
	{ int c[]=new int[3],k=-1;
	    for(int i=0;i<3;i++)
	    {int sum=0;
	    	for(int j=0;j<3;j++)
	    		{sum=sum+b[i][j];}
	    	 c[++k]=sum;
	    	}
		return c;
	}
	public static int[] acolm(int b[][])
	{ int c[]=new int[3],l=0;
	    for(int i=0;i<3;i++)
	    {int sum=0;
	    	for(int j=0;j<3;j++)
	    		{sum=sum+b[j][i];}
	    c[l++]=sum;	
	    }
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [][] = {{1,2,3},{4,5,6},{7,8,9}};
		      int ar[]=arow(a);
		      int ac[]=acolm(a);
		      int  i=0;
		      while(i<ar.length)
		    	  {System.out.print(ar[i]);
		    	  i++;
		    	  }
		      System.out.println("\n-------------------------");
		      int j=0;
		      while(j<ac.length)
		      {
		    	  System.out.print(ac[j]);
		    	  j++;
		      }
		      }
}