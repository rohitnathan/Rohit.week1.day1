package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range = 8;
		int firstnum = 0;
		int secNum = 1;
		int sum;
System.out.println(firstnum);	
	
	   for(int i=1;i<=range;i++) {
		sum = firstnum + secNum;
		firstnum = secNum;
		secNum = sum;
		System.out.println(sum);
	}

}

}

/*
Learnings
1) For loop
2) Iterate
3) Operator
*/