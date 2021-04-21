class Sorter{
	int[] data;
	void quick(int start,int end) {//
		if(start>=end) {
			return;
		}
		int mid=data[(start+end)/2];
		int left=start;
		int right=end;
		while(left<right) {
			while(left<end&&data[left]<mid) {
				left++;
			}
			while(right>start&&data[right]>mid) {
				right--;
			}
			if(left<=right) {
				int	temp=data[left];
				data[left]=data[right];
				data[right]=temp;
				left++;
				right--;
				show();
			}
		}
		quick(start,right);
		quick(left,end);
		
	}
	void show() {
		for(int i:data) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	void sort(int[] data) {
		this.data=data;
		show();
		quick(0,data.length-1);
	}
}
public class quicksort {
	public static void main(String[] args) {
		int[] data= {231,321,421,77,94,33,52,513,423,5,6,96,9};
		Sorter s=new Sorter();
		s.sort(data);
	}

}
