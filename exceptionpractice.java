import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
public class exceptionpractice {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		for(int i=0;i<=a.length;i++) {
			try {
				System.out.println(a[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Error:"+e.toString());
			}
		}
		System.out.println("你要看第幾個數");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			String str=br.readLine();
			int b=Integer.parseInt(str);
			System.out.println(a[b-1]);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("超出範圍或輸入非數字");
		}catch(IOException e) {   //取代throws IOException
			System.out.println("發生IO例外");   
		}
		
	}

}
