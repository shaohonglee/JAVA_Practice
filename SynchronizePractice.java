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
	public synchronized void a() {  //synchronized�|�y������    �Nsynchrnoize�h���άO�[�Wwait  notify����
  //public void a() {  		
		System.out.println("��ka�}�l����");
		try {
			while(!bexcuted) {
			wait();
			}
		}catch(InterruptedException e) {}
		System.out.println("��ka���浲��");
	}
	public synchronized void b() {
		System.out.println("��kb�}�l����");
		bexcuted=true;
		notify();
		System.out.println("��kb���浲��");
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
		}System.out.println("�{������");
	}

}
