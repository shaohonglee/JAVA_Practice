import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class fileRead {

	public static void main(String[] args) throws IOException{
		fileR();
		
	}
	public static void fileR() throws IOException{
		Path path =Paths.get("D:/eclipse_oxygen/workplace/Tutorial/src/test.txt");
		System.out.println(path.getFileName());
		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		String str=path.toAbsolutePath().toString();
		FileReader fr=new FileReader(str);
		int ch;
		while((ch=fr.read())!=-1)
			System.out.print((char)ch);
		fr.close();
	}
	public static void fileW() throws IOException{
		String str1="D:\\eclipse_oxygen\\workplace\\Tutorial\\src\\test1.txt";
		FileWriter fw=new FileWriter(str1,true);  //加上True 會續寫檔案
		fw.write("hello write");
		fw.write('\n');
		fw.write("我怎麼那麼爛");
		fw.flush();
		fw.close();
	}
	public static void fileBufferR() throws IOException{
		String str2="D:\\eclipse_oxygen\\workplace\\Tutorial\\src\\test2.txt";
		BufferedReader br=new BufferedReader(new FileReader(str2));
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
	}
	public static void fileBufferW() throws IOException{
		String str2="D:\\eclipse_oxygen\\workplace\\Tutorial\\src\\test2.txt";
		BufferedWriter bw=new BufferedWriter(new FileWriter(str2));
		for(int i=1;i<10;i++) {
			bw.write("write test"+"\n");
		}
		bw.close();
	}
	

}
