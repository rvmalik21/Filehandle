package pkj1;
//(((((10/2)-2)-2)+2)*2)
public class Student2 
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
}public void mul(int a, int b)
{
int e=a*b;
System.out.println("Fianl Result of Expresion (((((10/2)-2)-2)+2)*2)  is "+e);
}public int div(int a, int b)
{
int f=a/b;
System.out.println("Div is "+f);
return f;
}
public static void main(String[] args) 
{
Student2 obj=new Student2();
int div1=obj.div(10, 2);
int sub1=obj.sub(div1, 2);
int sub2=obj.sub(sub1, 2);
int sum1=obj.sum(sub2, 2);
obj.mul(sum1, 2);
}
}

