import java.util.Scanner;
class lab7a
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int num,rp,quantum,bt[],rt[];
		bt=new int[10];
		rt=new int[10];
		System.out.println("Enter the number of process");
		num=sc.nextInt();
		System.out.println("Enter the burst time");
		for(int i=0;i<num;i++)
		{
			System.out.print("P["+(i+1)+"]:");
			bt[i]=sc.nextInt();
			rt[i]=bt[i];
		}
			System.out.print("Enter quantum:");
			quantum=sc.nextInt();
			int time=0;
			int i=0;
			rp=num;
			System.out.print("0");
			while(rp>0)
			{
				if(rt[i]>quantum)
				{
					rt[i]=rt[i]-quantum;
					System.out.print("|P"+(i+1)+"|");
					time=time+quantum;
					System.out.print(time);
				}
				else if(rt[i]<=quantum && rt[i]>0)
				{
					time=time+rt[i];
					rt[i]=rt[i]-rt[i];
					System.out.print("|P"+(i+1)+"|");
					System.out.print(time);
					rp--;
				}
				i++;
				if(i==num)
					i=0;
			}
		}
}
