import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class throwexceptionPractice {

	public static void main(String[] args) throws IOException{
		double[] a= {1,2,3,4,5};
		System.out.println("請輸入除數:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int b=Integer.parseInt(str);
		try{
			if(b==0) {
				throw new valueException("您輸入的除數為零");
			}else if(b<0) {
				throw new valueException("您輸入的除數為負數");
			}else {
				System.out.println(a[4]/b);
			}
		}catch(valueException e) {
			System.out.println("發生例外:"+e);
		}
	}
}
class valueException extends RuntimeException{
	public valueException(String s) {
		super(s);
	}
}