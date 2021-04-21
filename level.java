import java.io.*;
public class level {
	public static void main(String[] args)
	throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("½Ð¿é¤J¶¥¼h");
		String str=br.readLine();
		int level=Integer.parseInt(str);
		int num=1;
		for(int i=1;i<level;i++) {
			num=num*i;
		}
		System.out.println(num);
	}
}
