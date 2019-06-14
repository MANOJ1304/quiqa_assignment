import java.util.*;
public class CountPairsSort
{
	public static void main(String...args)
	{
		int arr[]={1,5,3,12,-7,0,98,-3,3};
		int k=5;
		int n=arr.length;
		CountPairsSort(arr,n,k);
		
	}
	static void CountPairsSort(int arr[],int n,int k)
	{
		Arrays.sort(arr);
		int l=0;
		int r=n-1;
		while(l<r)
		{
			if(arr[l]+arr[r]==k)
			{
				System.out.println(arr[r]+" "+arr[l]);
				l++;
				r--;
			}
			else if(arr[l]+arr[r]<k)
			{
				l++;
			}
			else{
				r--;
			}
		}
	}
}