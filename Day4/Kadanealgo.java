<<<<<<< HEAD
import java.util.*;
public class Kadane_Algo {

	public static void main(String[] args) { Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int [] a=new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	largestsum(a,n);
	
		// TODO Auto-generated method stub

	}
	static void largestsum(int[] a,int n)
	{ int maxsum=a[0],currsum=0;
		for(int i=0;i<n;i++)
		{
			currsum+=a[i];
			if(currsum>maxsum)
				maxsum=currsum;
			if(currsum<0)
				currsum=0;
			
				
			
				
		}
		System.out.println(maxsum);
			
	}

}
=======
import java.util.*;
public class Kadane_Algo {

	public static void main(String[] args) { Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int [] a=new int[n];
	for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	largestsum(a,n);
	
		// TODO Auto-generated method stub

	}
	static void largestsum(int[] a,int n)
	{ int maxsum=a[0],currsum=0;
		for(int i=0;i<n;i++)
		{
			currsum+=a[i];
			if(currsum>maxsum)
				maxsum=currsum;
			if(currsum<0)
				currsum=0;
			
				
			
				
		}
		System.out.println(maxsum);
			
	}

}
>>>>>>> f64fb08314dc958f5bb4671685d3508d7c659c97
