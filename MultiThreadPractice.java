import java.util.Date;
class MultiThread extends Thread{
	public void run() {
		try {
			while(true) {
				sleep(1000);
				Date now =new Date();
				System.out.println("�s�����:"+now);
			}
		}catch (InterruptedException e) {
			
		}
	}
}
//class TimerThread implements Runnable{          //�Y�Q�~��thread�S�Q�~�Ө�L���O���ܭn��Runnable
//	public void run() {							  //Runnable���u�w�q�Frun()
//		while(true) {
//			for(int i=0;i<500_000_000;i++); 
//			Date now =new Date();
//			System.out.println("�s�����:"+now);
//		}
//	}
//}
public class MultiThreadPractice{
	public static void main(String[] args) {
		MultiThread m=new MultiThread();
		m.start();
	//	Thread newThread=new Thread(new TimerThread());   //Thread�̦A�]Runnable����@
	//	newThread.start();
		try {	
			while(true) {
			//	for(int i=0;i<500_000_000;i++);
				Thread.sleep(1000);	
				Date now =new Date();
				System.out.println("�°����:"+now);
				System.out.println(Thread.currentThread());
				
			}
		}catch(InterruptedException e) {
			
		}
	}
}
