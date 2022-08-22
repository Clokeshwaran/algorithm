import java.util.*;
class lok
{
	 void findMin(int V)
	{
            int deno[] = {1, 2, 5};
	    int n = deno.length;
		for (int i = n - 1; i >= 0; i--)
		{
			while (V >=deno[i])
			{
				V=V-deno[i];
                                System.out.print(deno[i]+" ");
			}
		}

	}
	public static void main(String[] args)
	{
		
            
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		System.out.print("Following is minimal number of coins :");
                lok b=new lok();
		b.findMin(n);
	}
}




