package home_task4;

public class Task4 {
	
	public int simpleInterest(double principal,double time, double rate)
	{
		int simpleValue = (int) ((principal * time * rate )/100);
		return simpleValue;
	}
	public int compoundInterest(double principal,double time, double rate)
	{
		int compoundValue =(int) (principal * Math.pow(1.0+rate, time ));
		return compoundValue;
	}

}
