package session4;

public class SelectionSort {

	public static void main(String[] args) {
		int [] unsorted= {5,32,88,75,55,22,2,7,86,44};
		int[] a=recursiveCall(unsorted,unsorted.length);
		System.out.print("The sorted list is:\n[");
		System.out.print(a[0]);
		for(int i=1;i<a.length;i++) {
			System.out.print(","+a[i]);
		}
		System.out.println("]");
	}
	public static int[] recursiveCall(int[] abc,int n) {
		if(n==1) {
			return abc;
		}
		int currMinInd=abc.length-n;
		for(int j=abc.length-n+1;j<abc.length;j++) {
			if(abc[j]<abc[currMinInd]) {
				currMinInd=j;
			}
		}
		int[] next=new int[abc.length];
		int j;
		
		for(j=0;j<(abc.length-n);j++) {
			next[j]=abc[j];
		}
		int temp=abc[j];
		next[j++]=abc[currMinInd];
		
		for(int i=j;i<abc.length;i++) {
			if(i!=currMinInd) {
				next[i]=abc[i];
			}
			else {
				next[i]=temp;
			}
		}
		return recursiveCall(next,n-1);
	}

}

