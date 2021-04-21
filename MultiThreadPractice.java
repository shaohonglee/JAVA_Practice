import java.util.Date;
class MultiThread extends Thread{
	public void run() {
		try {
			while(true) {
				sleep(1000);
				Date now =new Date();
				System.out.println("新執行緒:"+now);
			}
		}catch (InterruptedException e) {
			
		}
	}
}
//class TimerThread implements Runnable{          //若想繼承thread又想繼承其他類別的話要用Runnable
//	public void run() {							  //Runnable內只定義了run()
//		while(true) {
//			for(int i=0;i<500_000_000;i++); 
//			Date now =new Date();
//			System.out.println("新執行緒:"+now);
//		}
//	}
//}
public class MultiThreadPractice{
	public static void main(String[] args) {
		MultiThread m=new MultiThread();
		m.start();
	//	Thread newThread=new Thread(new TimerThread());   //Thread裡再包Runnable的實作
	//	newThread.start();
		try {	
			while(true) {
			//	for(int i=0;i<500_000_000;i++);
				Thread.sleep(1000);	
				Date now =new Date();
				System.out.println("舊執行緒:"+now);
				System.out.println(Thread.currentThread());
				
			}
		}catch(InterruptedException e) {
			
		}
	}
}
