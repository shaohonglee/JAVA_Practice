import java.io.*;
class ICcard {
	String name;
	int money;
	boolean addmoney(int add) {
		if(money>10000||add>10000) {	
			return false;
		}	
		else
			money=money+add;
		return true;
	}
	boolean move() {
		if(money>20) {
			money=money-20;
			return true;
		}	
		else
			return false;
	}
	void show() {
		System.out.println("您的卡號是:"+name);
		if(money>0)
			System.out.println("卡片餘額還有:"+money);
		else
			System.out.println("您的餘額不足，需加值");
	}
}
public class addmoney {
	
	public static void main (String[] argv) throws IOException{
		ICcard mycard=new ICcard();
		mycard.name="小明";
		mycard.money=100;		
		System.out.println("請選擇 A:搭車   B:儲值");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		switch(str) {
			case "A":
				System.out.println(mycard.move()?"您已到達目的地":"餘額不足");
					break;
			case "B":
				System.out.println("要儲值多少金額:");
				BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
				String str1=br1.readLine();
				int add=Integer.parseInt(str1);
				System.out.println("加值"+add+"元，"+(mycard.addmoney(add)?"成功":"失敗，超過儲值上限"));
					break;
		}
		mycard.show();
	}
}
