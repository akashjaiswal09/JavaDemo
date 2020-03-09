package threadpack;

class MyThread extends Thread{
	
	public void run() {
		for(int i=1;i<10;i++)
			System.out.println(Thread.currentThread().getName()+" "+i);
	}
	
}

public class MyThreadDemo {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.setName("one");
		thread.start();
		MyThread thread2 = new MyThread();
		thread2.setName("two");
		thread2.start();
		for(int i=1;i<6;i++)
			System.out.println(Thread.currentThread().getName()+" "+i);
	} 
	
}
