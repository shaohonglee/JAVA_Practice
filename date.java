import java.util.*;
class dates{
	String[] weekday= {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
	String[] chtweekday= {"§���@","§���G","§���T","§���|","§����","§����","§����"};
	int i=0;
	String askDate(int n) {
		return weekday[n-1];
	}
	String askDate(String enday) {
		while(enday==weekday[i]) {
			i++;
		}
		return chtweekday[i];
	}
}
public class date {
	public static void main(String[] args) {
		while(true) {
			dates d=new dates();
			System.out.println("�п�J1~7:");
			Scanner sc=new Scanner(System.in);
			if(sc.hasNextInt()) {
				int i=sc.nextInt();
				System.out.println(d.askDate(i));
			}else {
				String i=sc.nextLine();
				System.out.println(d.askDate(i));
			}
		}
	}
}
