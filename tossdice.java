public class tossdice {

	public static void main(String[] args) {
//		System.out.println("�n���Y�X����l:");
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
			System.out.println("��X"+k+"�����v��"+data[k]+"/36");
		}
		
	}

}
