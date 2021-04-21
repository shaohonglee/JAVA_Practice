public class tossdice {

	public static void main(String[] args) {
//		System.out.println("要投擲幾顆骰子:");
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//    	String str=br.readLine();
//    	double diceNum=Double.valueOf(str);
		int[] data=new int[13];
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				data[i+j]++;
			}
		}
		for(int k=2;k<data.length;k++) {
			System.out.println("骰出"+k+"的機率為"+data[k]+"/36");
		}
		
	}

}
