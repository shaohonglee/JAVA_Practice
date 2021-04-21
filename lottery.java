import java.util.*;
public class lottery {
	public static void main(String[] args) {
		int[] lotterynum= {4,6,23,43,33,18};
		int[] num=new int[6];
		System.out.println("請輸入六個號碼:");
		Scanner scanner = new Scanner(System.in);
		num[0]=scanner.nextInt();
		num[1]=scanner.nextInt();
		num[2]=scanner.nextInt();
		num[3]=scanner.nextInt();
		num[4]=scanner.nextInt();
		num[5]=scanner.nextInt();
		for(int i=0;i<lotterynum.length;i++) {
			for(int j=0;j<=5;j++) {
				if(num[j]==lotterynum[i]) {
					System.out.println(num[j]);
				}		
			}
		}
	}
}
