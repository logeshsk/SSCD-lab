import java.util.Scanner;
class lab9b
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int n;
		int frame[]= new int[3];
		System.out.println("Enter the number of pf");
		n=sc.nextInt();
		int ip[]=new int[n];
		System.out.println("Enter the input");
		for(int i=0;i<n;i++)
		{
			ip[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++)
			frame[i]=-1;
		int hit=0;
		int fault=0;
		int j=0;
		boolean check;
		for(int i=0;i<n;i++)
		{
			check=false;
			for(int k=0;k<3;k++)
			{
				if(ip[i]==frame[k])
				{
					hit++;
					check=true;
				}
			}
			if(check==false)
			{
				frame[j]=ip[i];
				fault=fault+1;
				j++;
			}
			if(j>=3)
			{
				j=0;
			}
		}
		System.out.println("Hit="+hit);
		System.out.println("Fault="+fault);
	}
}
