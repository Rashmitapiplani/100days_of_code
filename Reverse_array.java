
import java.util.*;
public class Reverse_array {

	public static void main(String[] args) { int temp;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		 int end=n-1;
		for(int r=0;r<n/2;r++)
		{
			temp= a[r];
			a[r]=a[end];
			a[end]=temp;
			end--;
			
		}
		
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}

}
