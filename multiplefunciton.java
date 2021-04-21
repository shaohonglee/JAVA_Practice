class mathskill{
	public static double avg(int[] data) {
		double sum=0;
		for(int i:data) {
			sum+=i;
		}
		return sum/data.length;
	}
	public static double avg(double[] data) {
		double sum=0;
		for(double i:data) {
			sum+=i;
		}
		return sum/data.length;
	}
}
public class multiplefunciton {
	public static void main(String[] args) {
		int[] data={3,3,4};
		System.out.println(mathskill.avg(data));
		mathskill m=new mathskill();
		double[] data1={2.2,3.3,4.4};
		System.out.println(m.avg(data1));
		}

}
