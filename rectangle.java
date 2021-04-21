import java.io.*;
public class rectangle {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("ªø:");
    	String str=br.readLine();
    	int lng=Integer.parseInt(str);
    	System.out.println("¼e:");
    	str=br.readLine();
    	int wid=Integer.parseInt(str);
    	
    	for(int i=1;i<=lng;i++) {
    		for(int j=1;j<=wid;j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
	}
}
