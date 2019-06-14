import java.util.*;
public class CountPairsHashSet
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
			if(n<2)
					return;
				HashSet<Integer> hset= new HashSet<>();
			for(int i=0;i<n;i++)//O(n^2)Brute Force Method
			{
				
				int diff=k-arr[i];
				if(hset.contains(diff))
				{
					System.out.println(diff+" "+arr[i]);
				}
				hset.add(arr[i]);
				
				
				
			}
			
		}
}