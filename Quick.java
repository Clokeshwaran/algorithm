import java.util.*;
class Quick {
    
    void quic(int ar[],int l,int r)
    {
        int pi,i,j;
        if(l<r)
        {
            pi=ar[l];
            i=l;
            j=r;
            
            while(i<j)
            {
                while((ar[i]<pi)&&(i<r))
                    i++;
                while((ar[j]>=pi)&&(j>l))
                    j--;
                if(i<j)
                    sw(ar,i,j);
            }
                sw(ar,l,j);
                quic(ar,l,j-1);
                quic(ar,j+1,r);
                
                
                    
            
        }
        
    }
    
    
    void sw(int a[],int i,int j)
    {
        int t;
        t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    
    
    
    

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the arry size");
        int n=sc.nextInt();
        
        int[] a = new int[n];
        
        for(int i=0;i<n;i++)
         a[i]=sc.nextInt();
        
        Quick lo = new Quick();
        lo.quic(a, 0, n-1);
        
        for(int i=0;i<n;i++)
         System.out.print(a[i]+" ");
        
        
    }
}
