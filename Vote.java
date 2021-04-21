class PollingStation extends Thread{
	static int polltime=5;      //���Ͳ��X��
	int pollTotal=0;
	String name;   //�X���}����
	Vote v;		   //�뵹��
	PollingStation(Vote v,String name){
		this.v=v;
		this.name=name;
	}
	public void run() {              //�o��
		for(int i=0;i<polltime;i++) {
			int count=(int)(Math.random()*500);
			v.Countvote(name,count);
			pollTotal+=count;
		}
	}
}
public class Vote {
	private int voteTotal=0;
	private int numOfStation=2;
	private PollingStation[] stations; 
	public void Countvote(String name,int count){
		int temp=voteTotal;
		temp=temp+count;
		System.out.println(name+"���}���ұo:"+count+"\n�ֿn���Ʀ�:"+temp);
		voteTotal=temp;
	}
	public void Votestart() {
		stations=new PollingStation[numOfStation];  //�Ыا벼��
		int allVote=0;
		for(int i=1;i<=numOfStation;i++) {
			stations[i-1]=new PollingStation(this,i+"��");
		}
		for(int i=0;i<numOfStation;i++) {
			stations[i].start();
		}
		for(int i=0;i<numOfStation;i++) {
			try {
				stations[i].join();
			}catch(InterruptedException e) {}
		}
		System.out.println("�̫�벼���G:");
		for(int i=0;i<numOfStation;i++) {
			System.out.println(stations[i].name+"������:"+stations[i].pollTotal);
			allVote+=stations[i].pollTotal;
		}
		System.out.println("�̫��`���Ƭ�:"+ allVote);
	}
	public static void main(String[] args) {
		Vote v=new Vote();
		v.Votestart();
	}

}
