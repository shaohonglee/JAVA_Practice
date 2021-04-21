import java.util.*;
public class oo_practice {
//	class mathmethod{
	public static int ffunc(int a) {
			if(a<3)
				return 1;
			else
				return ffunc(a-1)+ffunc(a-2);
		}
//	}	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int f=Integer.parseInt(str);
		
		System.out.println(ffunc(f));
	}
}
