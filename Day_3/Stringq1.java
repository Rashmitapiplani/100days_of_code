public class stringqs1 {

	public static void main(String[] args) { Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt(); char ch,ch1;
	       String [] s1= new String[n]; int flag=0;
	       String res="";
	       for(int i=0;i<n;i++)
	    	   s1[i]=sc.next();
	       for(int i=0;i<n;i++)
	       {
	    	   ch=s1[i].charAt(0);
	    	   ch1=s1[i].charAt(s1[i].length()-1);
	    	   if((ch1=='a'|| ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')&&(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'))
	    	    {res=res+s1[i];
	    	   flag=1;
	    	    }
	    	   
	       }
	       if(flag ==0)
	       
	    	   System.out.println("no match");
	       else
	    	   System.out.println(res);
	      
	      
		// TODO Auto-generated method stub

	}

}
