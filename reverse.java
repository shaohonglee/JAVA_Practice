
public class reverse {
	public static void main(String[] args) {
		int[] data= {30,20,10,5,34};
		int[] reversedata=new int[data.length];
		
		for(int i=0;i<data.length;i++) {
			reversedata[i]=data[data.length-i-1];
		}
		for(int i: data)
			System.out.print(i+" ");
		System.out.println();
		for(int i: reversedata)
			System.out.print(i+" ");
	}
}
