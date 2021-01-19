// Function prototype to find element that apperas n/2 times in array

class Majority
{
    static int majorityElement(int a[], int size)
    { int found=0,count=0,element=0;
       HashMap<Integer,Integer>hm =new HashMap<Integer,Integer>();
       for(int i=0;i<a.length;i++)
       { count=0;
           if(hm.containsKey(a[i]))
           hm.put(a[i],hm.get(a[i])+1);
           else
           hm.put(a[i],1);
            
           
       }
       int max=Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) 
              {
                  if(e.getValue()>max)
                  { max=e.getValue();
                  element =e.getKey();
                     
                  }
              }
      if(max>size/2)
       return element;
      else
      return -1;
    }
}