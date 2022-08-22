import java.io.*;
import java.util.ArrayList;
import java.util.*;
public class lokesh20081 {
   
    public static void main(String[] args) {
        char[] ele={'a','b','c','d','e','f','g','h','i','j','k'};
        
         int i=0,count=1;
        
        while(ele.length==0)
        {
         if(count%4==0||count%10==4)
         {
             for(int j=i;j<ele.length;j++)
             {
                 ele[j]=ele[j+1];
             }
         }
         
         if(ele.length==i)    
             i=0;
         else
             i++;
         count++; 
        }
        for(int j=0;j<ele.length;j++)
            System.out.println(ele[j]);
        
       // lokesh20081 al=new lokesh20081();
       
        

    }
}
