import java.util.*;
public class Count_character {

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
	    char ch[] =s1.toCharArray();
	    HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	    for(char ch1: ch)
	    {
	    	if(hm.containsKey(ch1))
	    		hm.put(ch1,hm.get(ch1)+1);
	    	else
	    		hm.put(ch1,1);
	    }
	  for(Map.Entry entry:hm.entrySet()) 
	  {
		  System.out.println(entry.getKey()+" "+ entry.getValue());
	  }
	    

	

}
}