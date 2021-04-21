import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class mathexample {

	public static void main(String[] args) throws IOException{
		System.out.println("[(x+1)/n]+[(x+2)/(n-1)]+.......");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("x:");
    	String str=br.readLine();
    	double x=Double.valueOf(str);
    	System.out.println("n:");
    	str=br.readLine();
    	double n=Double.valueOf(str);
    	double num = 0.0;
    	for (int i=1;i<=n;i++) {
    		num=num+(x+i)/(n-i+1);
    	}
    	System.out.print(num);
	}

}
