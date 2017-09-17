import java.util.*;
class palindrome
{
	static Scanner s=new Scanner(System.in);
	static int pow(int a,int b)
	{
		int ans=1;
		while(b>0)
		{
		ans*=a;
		b--;		
		}	
		return ans;
}
	public static void main(String args[])
	{
		int N=s.nextInt();
		int N2=N;
		int N3=0;		
		int cnt=1;
		int dig=0,Ntmp=N;
		while(Ntmp>0)
		{
			dig++;
			Ntmp/=10;		
		}
	dig--;
	//System.out.print(dig);
		cnt=pow(10,dig);
		while(N2!=0)
		{
			N3+=(N2%10)*cnt;
			N2/=10;
			cnt/=10;
		}	
	//	System.out.println(N3);	
		if(N3==N)
			System.out.print("Palindrome hai :)");	
		else
			System.out.print("Palindrom ni hai :( ");		
	}
}
