import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringChange {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		br.close();
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		char[] temp=str.toCharArray();
		try {
			for(int i=0;i<temp.length;i++) {
				if(Character.isLetter(temp[i])||Character.isWhitespace(temp[i])) {
					if(Character.isLowerCase(temp[i])) {
						temp[i]=Character.toUpperCase(temp[i]);
					}else if(Character.isUpperCase(temp[i])) {
						temp[i]=Character.toLowerCase(temp[i]);
					}
				}else {
					throw new RuntimeException() ;
				}
			}
			System.out.println("轉換前為:"+str);
			System.out.print("轉換後為:");
			for(int i=0;i<temp.length;i++) {
				System.out.print(temp[i]);
			}	
		}catch (RuntimeException e) {
			System.out.println(e+":輸入非字母");
		}
		
	}

}
