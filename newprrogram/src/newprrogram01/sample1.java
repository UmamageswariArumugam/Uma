package newprrogram01;

public class sample1 {
	sample1()
	{
		System.out.println("normal or defaolluu construcyor");
	}
	sample1(int a)
	{
		System.out.println("one param counts");
		
	}
	sample1(int a,int b)
	{
		System.out.println("2 param counts");
	}

	public static void main(String[] a)
	{
	sample1 obj=new sample1();
	sample1 obj1=new sample1(10);
	sample1 obj2=new sample1(10,20);
	
	
}
}