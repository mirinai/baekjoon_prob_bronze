import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

//class에는 접근제한자를 public 쓰면 안됨
class MoxNamuji {


	private int n;
	

	
	public MoxNamuji(int i) {
		// TODO Auto-generated constructor stub
		this.n=i;
	}
	//프린트 
	public void PrintNum(BufferedWriter bw) throws IOException {
		//셀프넘버가 아닌 값들을 true로 넣는다 넣을 배열
		boolean[] NonSelfNumber = new boolean[10001];
		
		for (int num=n;num<=10000;num++) {
			int generatedNum= getNum(num);

			if (generatedNum<=10000) {
				NonSelfNumber[generatedNum]=true;
				
			}
		}
		//셀프넘버 출력/i가 10000까지 셀프넘버만 출력하게 만든다.
		for (int i = 1; i <= 10000; i++) {
			
			if (!NonSelfNumber[i]) {
				bw.write(Integer.toString(i));
				bw.newLine();
		    }
		
			
		}	
		
			
		
	}

		
	//프린트 메서드에서 받은 값을 계산 수열을 만든다
	private int getNum(int num) {
		int sum = num;//먼저 앞의 수를 넣기
		
		//sum에 각 자리마다 있는 수들을 더한다./셀프넘버는 출력될 수 가 없다.예) 1->2로 2는 4, 3은 6, 4는 8,5는 10, 6은 12...31은 36
		while (num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
		
		

	}
	
	
}


public class Main {//->클래스 이름을 Main으로 바꿔라
	public static void main(String[] args) {
		//입력은 버퍼리더를 쓸 것
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//출력은 버퍼라이터
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		
		//int n = Integer.parseInt(br.readLine());//

		MoxNamuji mn = new MoxNamuji(1);
		try {
			mn.PrintNum(bw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try {
			//br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}