
public class ArrayClass {
public static void main(String[] args) {
	int[] a=new int[6];
	a[0]=12;
	a[1]=23;
	a[2]=45;
	a[3]=34;
	a[4]=45;
	
	int count=0;
	
	for (int i : a) {
		System.out.println(i);
	count=count+i;
	
	}
	System.out.println(count);
	float avg=count/6;
	System.out.println(avg);
//	int l = a.length;
//	System.out.println(l);
//	for(int i=0;i<l;i++)
//	{
//		System.out.println(a[i]);
//	}
	
}
}
