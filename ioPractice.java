import java.io.*;
public class ioPractice {

	public static void main(String[] args) throws IOException{
		char ch=(char) System.in.read();   //�uŪ�Ĥ@�ӿ�J���A�B�|Ū��enter
		String str=Character.toString(ch); //ch�O ASCII �ݭn��X
		double pow=Integer.parseInt(str);
		System.out.println(Math.pow(2, pow));
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//InputSR �N�줸�]�˦��r��
		//Buffer  �N��y����J�s��w�İϡA�{���A�h���ΡA�קKŪ��Enter
	}

}
