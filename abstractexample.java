interface Timestop {
	void notifytime(int i);   //未實作
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
			System.out.println("共執行"+second+"秒，睡眠結束");
	}
}
class Watchuser implements Timestop{          //實作手錶擁有者進行暫停的動作
	public void notifytime(int i) {
		System.out.println("執行緒睡眠"+i+"秒");
	}
}
public class abstractexample {
	public static void main(String[] args) {
		Watchuser w=new Watchuser();
		Timer.stopTimer(5, w);
	}
}
