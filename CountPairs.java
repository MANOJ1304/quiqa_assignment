import java.util.*;
public class CountPairs
{
	public static void main(String...args)
		{
			int arr[]={1,5,3,12,-7,0,98,-3,3};
			int k=5;
			int n=arr.length;
			CountPairs(arr,k,n);
		}
		static void CountPairs(int arr[],int k,int n)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]+arr[j]==k)
					System.out.println(arr[i]+" "+arr[j]);
				}
				
			}
			
				
		}
}