import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class throwexceptionPractice {

	public static void main(String[] args) throws IOException{
		double[] a= {1,2,3,4,5};
		System.out.println("�п�J����:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int b=Integer.parseInt(str);
		try{
			if(b==0) {
				throw new valueException("�z��J�����Ƭ��s");
			}else if(b<0) {
				throw new valueException("�z��J�����Ƭ��t��");
			}else {
				System.out.println(a[4]/b);
			}
		}catch(valueException e) {
			System.out.println("�o�ͨҥ~:"+e);
		}
	}
}
class valueException extends RuntimeException{
	public valueException(String s) {
		super(s);
	}
}