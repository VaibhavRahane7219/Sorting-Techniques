package SelectioSortExa;

public class Ex1 
{
		public static void m(int A[])
		{
			for (int K:A)
			{
			System.out.print(K);
			}
        }
	public static void main(String[] args)
	{
		int a[]= {70,82,31,11,24};
		int x=a.length;
		for(int i=0;i<x-1;i++)
		{
			int small=i;
			for(int j=i+1;j<x;j++)
			{
				if(a[small]>a[j])
				{
				small=j;
				}
			}
			int n=a[small];
			a[small]=a[i];
			a[i]=n;
		}
		m(a);
	}

}
