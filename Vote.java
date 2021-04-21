class PollingStation extends Thread{
	static int polltime=5;      //玻ネ布碭Ω
	int pollTotal=0;
	String name;   //碭腹秨布┮
	Vote v;		   //щ倒街
	PollingStation(Vote v,String name){
		this.v=v;
		this.name=name;
	}
	public void run() {              //眔布
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
		System.out.println(name+"秨布┮眔:"+count+"\n仓縩布计Τ:"+temp);
		voteTotal=temp;
	}
	public void Votestart() {
		stations=new PollingStation[numOfStation];  //承щ布┮
		int allVote=0;
		for(int i=1;i<=numOfStation;i++) {
			stations[i-1]=new PollingStation(this,i+"腹");
		}
		for(int i=0;i<numOfStation;i++) {
			stations[i].start();
		}
		for(int i=0;i<numOfStation;i++) {
			try {
				stations[i].join();
			}catch(InterruptedException e) {}
		}
		System.out.println("程щ布挡狦:");
		for(int i=0;i<numOfStation;i++) {
			System.out.println(stations[i].name+"布Τ:"+stations[i].pollTotal);
			allVote+=stations[i].pollTotal;
		}
		System.out.println("程羆布计:"+ allVote);
	}
	public static void main(String[] args) {
		Vote v=new Vote();
		v.Votestart();
	}

}
