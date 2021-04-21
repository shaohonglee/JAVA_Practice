class ThreadA extends Thread {
	public void run() {
		Lock.obj.a();
	}
}
class ThreadB extends Thread{
	public void run() {
		Lock.obj.b();
	}
}
class Lock{
	public static Lock obj=new Lock();
	private boolean bexcuted=false;
	public synchronized void a() {  //synchronized會造成死結    將synchrnoize去除或是加上wait  notify控制
  //public void a() {  		
		System.out.println("方法a開始執行");
		try {
			while(!bexcuted) {
			wait();
			}
		}catch(InterruptedException e) {}
		System.out.println("方法a執行結束");
	}
	public synchronized void b() {
		System.out.println("方法b開始執行");
		bexcuted=true;
		notify();
		System.out.println("方法b執行結束");
	}
}
public class SynchronizePractice {

	public static void main(String[] args) {
		ThreadA ta=new ThreadA();
		ThreadB tb=new ThreadB();
		try {
			ta.start();
			tb.start();
			ta.join();
			tb.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.println("程式結束");
	}

}
