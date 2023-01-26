package BubbleSortExamples;

public class Ex1 
{
	public static void m(int A[])
	{
		for(int K:A)
		{
			System.out.println(K);
		}
	}
	public static void main(String[] args)
	{
		int a[]= {70,82,31,11,24};
		int x=a.length;
		for(int i=0;i<x-1;i++)
		{
			for(int j=0;j<x-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int n=a[j];
					a[j]=a[j+1];
					a[j+1]=n;
				}
			}
		}
		m(a);
	}

}
