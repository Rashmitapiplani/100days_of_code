import java.util.*;
public class Max_Min_element { 
	public static void main(String[] args) {Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] a=new int[n];
    for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
	 getmax(a,n);
	 getmin(a,n);
	 

	}
	static void getmin(int arr[],int n)
	{ 
		int min=arr[0];
		for(int i=1;i<n;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("min "+min);
	}
	static void getmax(int arr[],int n)
	{
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
	System.out.println("max "+max);
	}

}
