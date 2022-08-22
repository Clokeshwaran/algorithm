import java.util.*;
public class divide {
    
    
    //merge part
    void merge(int ar[],int L,int m,int R)
    {
        int l=m-L+1;
        int r=R-m;
        int leftar[]= new int [l];
        int rightar[]=new int [r];
        for(int i=0;i<l;i++)
            leftar[i]=ar[L+i];
        
        for(int j=0;j<r;j++)
            rightar[j]=ar[m+1+j];
        int i=0,j=0;
        int k=L;
        while(i<l&&j<r)
        {
            if(leftar[i]<=rightar[j])
            {
                ar[k]=leftar[i];
                i++;
            }
            else
            {
              ar[k]=rightar[j];
              j++;
            }
            k++;
        }
            while(i<l)
            {
                ar[k]=leftar[i];
                i++;
                k++;
                
            }
            while(j<r)
            {
                ar[k]=rightar[j];
                j++;
                k++;
            }
          
    }
    
    
    
     //Recursive call and Divide the array
    void sort(int ar[],int l,int r)
    {
        if(l<r)
        {
            int m=(l+r)/2;
            sort(ar,l,m);
            sort(ar,m+1,r);
            merge(ar,l,m,r);
        }
    }
    
    
    
    //main method
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a = new int[n];
        
        for(int i=0;i<n;i++)
         a[i]=in.nextInt();
        
        
        divide ll = new divide();
        ll.sort(a, 0, a.length-1);
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
} 
}
