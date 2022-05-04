import java.util.Scanner;
public class lab7b{
	public static void main(String args[]){
		int process[],bt[],wt[],txt[],i,j=0,n,total=0;
		float avg_wt, avg_txt;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of processes");
		n=s.nextInt();
		process=new int[n];
		bt=new int[n];
		wt=new int[n];
		txt=new int[n];
		System.out.println("Enter brust time:");
		for(i=0;i<n;i++)
		{
			System.out.println("P["+(i+1)+"]:");
			bt[i]=s.nextInt();
			process[i]=i+1;
		}
		int pos,temp;
		for(i=0;i<n;i++){
			pos=i;
			for(j=j+1;j<n;j++){
				if(bt[j]<bt[pos])
					pos=j;
			}
			temp=bt[i];
			bt[i]=bt[pos];
			bt[pos]=temp;
			temp=process[i];
			process[i]=process[pos];
			process[pos]=temp;
		}
		wt[0]=0;
		for(i=1;i<n;i++)
		{
			wt[i]=0;
			for(j=0;j<i;j++){
				wt[i]=wt[i]+bt[j];}
			total=total+wt[i];
		}
		avg_wt=(float)total/n;
		System.out.println("Process\tBRUST TIME\tWAITING TIME\tTOTAL AVERAGE TIME");
		total=0;
		for(i=0;i<n;i++)
		{
			txt[i]=wt[i]+bt[i];
			total=total+txt[i];
			System.out.println("p"+process[i]+"\t"+bt[i]+"\t\t"+wt[i]+"\t\t"+txt[i]);
		}
		avg_txt=(float)total/n;
		System.out.println("average wait time = "+avg_wt);
		System.out.println("average run around time = "+avg_txt);
	}
}





