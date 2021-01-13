// Ishan loves chocolate 
//  only function 
class Ishanlovechoco{
    
   
    
    public static int chocolates (int arr[], int n) { int lastpointer=n-1,firstpointer=0;
      if(n==1)
      return arr[0];
      else if(n==2)
      {
         if(arr[0]>arr[1])
         return arr[1];
         else
         return arr[0];
      }
       while(firstpointer+1!=lastpointer)
       {
           if(arr[firstpointer]>=arr[lastpointer])
           firstpointer++;
           else
           lastpointer--;
       }
       if(arr[firstpointer]>arr[lastpointer])
       return arr[lastpointer];
       else
       return arr[firstpointer];//Complete the function
    }
    
    
}
