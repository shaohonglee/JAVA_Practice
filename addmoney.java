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
		System.out.println("�z���d���O:"+name);
		if(money>0)
			System.out.println("�d���l�B�٦�:"+money);
		else
			System.out.println("�z���l�B�����A�ݥ[��");
	}
}
public class addmoney {
	
	public static void main (String[] argv) throws IOException{
		ICcard mycard=new ICcard();
		mycard.name="�p��";
		mycard.money=100;		
		System.out.println("�п�� A:�f��   B:�x��");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		switch(str) {
			case "A":
				System.out.println(mycard.move()?"�z�w��F�ت��a":"�l�B����");
					break;
			case "B":
				System.out.println("�n�x�Ȧh�֪��B:");
				BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
				String str1=br1.readLine();
				int add=Integer.parseInt(str1);
				System.out.println("�[��"+add+"���A"+(mycard.addmoney(add)?"���\":"���ѡA�W�L�x�ȤW��"));
					break;
		}
		mycard.show();
	}
}
