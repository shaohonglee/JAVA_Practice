import java.io.*;
public class diamond {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("µÙ§Î°ª:");
		String str=br.readLine();
		int h=Integer.parseInt(str);		
		for(int i=1;i<=((h+1)/2);i++) {
			for(int m=1;m<=((h+1)/2)-i;m++) {
				System.out.print(" ");
			}
			for(int n=1;n<=2*i-1;n++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=h/2;i++) {
			for(int m=1;m<=i;m++) {
				System.out.print(" ");
			}
			for(int n=1;n<=h-i*2;n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
