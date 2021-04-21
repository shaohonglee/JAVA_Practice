public class swap_bubblesort {
	public static void main(String[] args) {
		double[] temp= {23,26,42,31,33,27,28,40};
		swapminmax(temp);
		bubblesort(temp);
	}
	public static void swapminmax(double [] temp) {
		double min=temp[0];
		double max=temp[0];
		for (int i=1;i<temp.length;i++) {
			if(temp[i]>max) {
				max=temp[i];
			}
			if(temp[i]<min) {
				min=temp[i];
			}
		}
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
	}
	public static void bubblesort(double [] temp) {
		System.out.println("原始陣列為:");
		for(double i: temp)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("經過排序後:");
		
		for(int i=0;i<temp.length-1;i++) {  
			for(int j=0;j<temp.length-1-i;j++) {   //最後一個無法跟後面的換
				if(temp[j]>temp[j+1]) {
					double tmp=temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=tmp;
				}		
			}
		}
		for(double i: temp)
			System.out.print(i+" ");
	}
}

