package pkj1;

public class Student 
{
public int sum(int a, int b)
{
	int c=a+b;
	System.out.println("Sum is "+c);
	return c;
}
public int sub(int a, int b)
{
	int d=a-b;
	System.out.println("Sub is "+d);
	return d;
}
public int mul(int a, int b)
{
	int e=a*b;
	System.out.println("Mul is "+e);
	return e;
}
public void div(int a, int b)
{
	int f=a/b;
	System.out.println("Final Expression  is : "+f);
	}
public static void main(String[] args) 
{
Student obj=new Student();
int sum1=obj.sum(10,2);
int sum2=obj.sum(sum1, 2);
int sub1=obj.sub(sum2, 2);
int mul1=obj.mul(sub1, 2);
obj.div(mul1, 2);
}
}
