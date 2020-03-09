package JUnit;

public class OddOrEven {
	public String OddOrEven(int a) {
	if(a==0) 
		throw new RuntimeException("zero not accepted");
	else if(a%2==0)
		return "Even";
	else
		return "Odd";
		
	}
	
	public static void main(String[] args) {
		OddOrEven o= new OddOrEven();
		System.out.println(o.OddOrEven(13));

	}

}
