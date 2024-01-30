import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
	
		int n=sc.nextInt();
		int N=n;
		int cnt=0;
		int num=0;
		int val_na=0;
		int val_mo=0;

	
		while (N!=n || cnt==0) {
			if (n<10) {
				n=0+n;
			}
			
			val_mo=n/10;
			val_na=n%10;
			
			num=(val_mo+val_na)%10;
		
			n=(n%10)*10+num;
			cnt+=1;
		

		}
		System.out.println(cnt);
	
	

	
	}
	
}