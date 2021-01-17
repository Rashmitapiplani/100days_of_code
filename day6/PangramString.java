import java.util.*;
public class PangramString {

	public static boolean main1(String s) { boolean ch[] = new boolean[26];int i; s.toLowerCase();
    for(i=0;i<s.length();i++)
    {
        ch[s.charAt(i)-'a']=true;
    }
    for(i=0;i<26;i++)
    {
        if(ch[i]==false)
        {
            
            return false;
        }
        
    }
    
    return true;
		// TODO Auto-generated method stub

	}
	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
    boolean result= main1(s);
    if(result==true)
    	System.out.println("1");
    	else
    		System.out.println("0");
	
}
}
