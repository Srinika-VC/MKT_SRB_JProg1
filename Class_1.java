package abstractclass;
abstract class Class_3
{
	abstract void method1(); // abstrac method
	abstract void method2(); // abstrac method //67%
	void method4() // cocrete method
	{
		System.out.println("Logic for loggout from system");
	}
}
abstract class Class_2 extends Class_3
{
	abstract void method3();
	abstract void method5(); //50%
}
public class Class_1 extends Class_2
{
public static void main(String[] args) //cocrete method
	{
	}

	@Override
	void method3() 
	{
		
	}

	@Override
	void method5()
	{
		
	}

	@Override
	void method1() 
	{
		
	}

	@Override
	void method2()
	{
		
	}

}
