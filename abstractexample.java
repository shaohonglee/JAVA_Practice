interface Timestop {
	void notifytime(int i);   //����@
}
class Timer{ 
	static void stopTimer(int second,Timestop obj) {
			for(int i=1;i<=second;i++) {
				try {
					obj.notifytime(i);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("�@����"+second+"��A�ίv����");
	}
}
class Watchuser implements Timestop{          //��@����֦��̶i��Ȱ����ʧ@
	public void notifytime(int i) {
		System.out.println("������ίv"+i+"��");
	}
}
public class abstractexample {
	public static void main(String[] args) {
		Watchuser w=new Watchuser();
		Timer.stopTimer(5, w);
	}
}
