import java.io.*;
public class ioPractice {

	public static void main(String[] args) throws IOException{
		char ch=(char) System.in.read();   //只讀第一個輸入的，且會讀到enter
		String str=Character.toString(ch); //ch是 ASCII 需要轉碼
		double pow=Integer.parseInt(str);
		System.out.println(Math.pow(2, pow));
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//InputSR 將位元包裝成字元
		//Buffer  將串流的輸入存到緩衝區，程式再去取用，避免讀取Enter
	}

}
