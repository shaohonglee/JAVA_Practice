import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class stringtest {
	public static void main(String[] args) {
		String a="abcdabcd";
		String b="abde";
		System.out.println(a.length());
		System.out.println(a.charAt(0));
		System.out.println(a.compareTo(b));
		System.out.println(a.contains("a"));
		System.out.println(a.endsWith("cd"));
		char[] chars=new char[5];
		a.getChars(1,3,chars, 0);  //srcEnd-1 => 1~2
		System.out.println(new String (chars));  //複製
		System.out.println(a.indexOf("b",3));//第一次出現,從哪裡開始找
		String Intstring=String.valueOf(999);
		System.out.println(Intstring);
		
		StringBuffer c=new StringBuffer(a);
		System.out.println(c);
		System.out.println(c.append("zxc"));
		System.out.println(c.insert(0, "dafaf"));
		System.out.println(c.delete(4, 5));
		System.out.println(c.replace(4, 5, "zzz"));
		
		StringBuilder d=new StringBuilder();   //不保證在多執行續下運作
		
		//正規
		String str="Wang:L123456789:0922-123-321,Lee:M124011809:0933-211-425";
		Pattern pattern=Pattern.compile("[A-Z]\\d{9}");
		Matcher matcher=pattern.matcher(str);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		Pattern pattern2=Pattern.compile("0+(\\d{3})-(\\d{3})-(\\d{3})");  //用()包成$
		Matcher matcher2=pattern2.matcher(str);
		while(matcher2.find()) {
			System.out.println(matcher2.group());
		}
		String str2=matcher2.replaceAll("+886-$1-$2$3");
		System.out.println(str2);
	}
}
