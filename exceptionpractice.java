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
		System.out.println("�A�n�ݲĴX�Ӽ�");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			String str=br.readLine();
			int b=Integer.parseInt(str);
			System.out.println(a[b-1]);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("�W�X�d��ο�J�D�Ʀr");
		}catch(IOException e) {   //���Nthrows IOException
			System.out.println("�o��IO�ҥ~");   
		}
		
	}

}
