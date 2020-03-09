package threadpack;

class MyRunnable implements Runnable {
	public void run(){
		for(int i=1;i<10;i++) {
			if(i==2)
				try {
					Thread.sleep(4000);
				}
				catch (InterruptedException e){
					
					e.printStackTrace();
				}
		
			System.out.println(Thread.currentThread().getName()+"- run -"+i);
		}
	}
}
public class MyRunnableDemo {

	public static void main(String[] args) {

		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		
		for(int i=1;i<6;i++)
			System.out.println(Thread.currentThread().getName()+" "+i);

	}

}
