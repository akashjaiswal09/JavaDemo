package lambdapack;

import java.util.Scanner;

public class LambdaDemo {

	public static void main(String[] args) {
		MaxFinder mf =  (x,y)-> x>y?x:y;
//		Display disp = ()-> System.out.println("hello");
//		disp.disp();
		Display disp=s->{System.out.println(s);
						System.out.println("Akash!!!");
						};
		}
		disp.disp("Hiii");
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter a and b");
		int a = scr.nextInt();
		int b = scr.nextInt();
		System.out.println(mf.findMax(a,b));

	}

}
@FunctionalInterface
interface MaxFinder{
	int findMax(int a,int b);
}

@FunctionalInterface
interface Display{
	void disp(String s);
}
//class MaxFinderImpl implements MaxFinder{
//
//	@Override
//	public int findMax(int a, int b) {
//		return a>b?a:b;
//	}
//
//}