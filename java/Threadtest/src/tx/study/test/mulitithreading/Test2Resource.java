package tx.study.test.mulitithreading;

import java.util.concurrent.Semaphore;

public class Test2Resource {
	private final int MAX_ITEMS = 500;//��ʾһ�����������500ֻ���������˱��������ѡ�
	private String name;
	private Semaphore Pro_semaphoer = new Semaphore(MAX_ITEMS);
	private Semaphore Con_semaphoer = new Semaphore(0);
	private Semaphore lock_semaphoer = new Semaphore(1);
	public  void produce(String name){
	
		try {
			Pro_semaphoer.acquire();
			lock_semaphoer.acquire();
			this.name = "��"+(int)(MAX_ITEMS-this.Pro_semaphoer.availablePermits()-
					
					1)+"��"+name;
			System.out.println(Thread.currentThread().getName()+"������"+this.name);
			Con_semaphoer.release();
			lock_semaphoer.release();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public  void consumer(){
		
		try {
		
			Con_semaphoer.acquire();
			lock_semaphoer.acquire();
			
			System.out.println(Thread.currentThread().getName()+"������һ����Ѽ"+"��ʣ"+(int)(Con_semaphoer.availablePermits()+1)+"��"+"��������");
			
			Pro_semaphoer.release();
			lock_semaphoer.release();
	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}	
}
