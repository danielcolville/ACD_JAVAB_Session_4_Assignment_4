package session4;

public class InsertionSort {

	public static void main(String[] args) {
		int [] unsorted= {5,32,88,75,55,22,2,7,86,44};
		/*
		for(int i=0;i<unsorted.length;i++) {
			int currMinInd=i;
			for(int j=i+1;j<unsorted.length;j++) {
				if(unsorted[j]<unsorted[currMinInd]) {
					currMinInd=j;
				}
			}
			int temp=unsorted[i];
			unsorted[i]=unsorted[currMinInd];
			unsorted[currMinInd]=temp;
		}
		for(int i=0;i<unsorted.length;i++) {
			System.out.println(unsorted[i]);
		}*/
		int[] a=selSort(unsorted,unsorted.length);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static int[] selSort(int[] sort,int len) {
		if(len==1) {
			return sort;
		}
		int currMinInd=sort.length-len;
		for(int j=sort.length-len+1;j<sort.length;j++) {
			if(sort[j]<sort[currMinInd]) {
				currMinInd=j;
			}
		}
		int[] next=new int[sort.length];
		int j;
		
		for(j=0;j<(sort.length-len);j++) {
			next[j]=sort[j];
		}
		int temp=sort[j];
		next[j]=sort[currMinInd];
		j++;
		
		for(int i=j;i<sort.length;i++) {
			if(i!=currMinInd) {
				next[i]=sort[i];
				//j++;
			}
			else {
				System.out.println("temp is"+temp);
				next[i]=temp;
			}
		}
		return selSort(next,len-1);
	}

}
