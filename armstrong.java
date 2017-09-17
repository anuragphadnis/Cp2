import java.util.*;
class armstrong
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)
	{
		int N=s.nextInt();
		int N2=N,ans=0;		
		while(N2!=0)
		{
			int t=N2%10;
			ans+=t*t*t;
			N2/=10;
		}
		if(ans==N)
			System.out.println("Arm-strong");
		else
			System.out.println("Arm-Not-strong");
	}

}
