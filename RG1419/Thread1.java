public class Thread1 implements Runnable
{
	public void run()
		{
		Thread t=Thread.currentThread();
		String n=t.getName();
		int pr=t.getPriority();
		ThreadGroup tg=t.getThreadGroup();
		System.out.println("Name="+n);
		System.out.println("Priority="+pr);
		System.out.println("Group="+tg);
		}
}

class Main
{
	public static void main(String ar[])
		
		{
			Thread1 t=new Thread1();
			Thread t1=new Thread(t);
			Thread t2=new Thread(t,"TWO");
			Thread t3=new Thread(t,"THREE");
			t1.setName("ONE");
			t2.setPriority(10);
			t1.start();
			t2.start();
			t3.start();
		}
			
}		
