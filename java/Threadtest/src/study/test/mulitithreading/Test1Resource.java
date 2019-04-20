package study.test.mulitithreading;

public class Test1Resource {
	private int count = 0;//������¼���в�Ʒ�ĸ���
	private boolean flag = false;//������Ϊtrue û������Ϊfalse
	private String name;
	public synchronized void produce(String name){
		while(flag == true){//���Ϊtrue��ʾ��������
			try {
				this.wait();
			} catch (Exception e) {throw new RuntimeException();}
		}
		//���Ϊtrue��������
		count++;
		this.name = "��"+count+"��"+name;
		System.out.println(Thread.currentThread().getName()+"������"+this.name);
		this.flag = true;
		this.notifyAll();
	}
	
	public synchronized void consumer(){
		while(flag == false){
			try{
				this.wait();
			}catch (Exception e) {throw new RuntimeException();}	
		}
		System.out.println(Thread.currentThread().getName()+"������"+this.name);
		this.flag = false;
		this.notifyAll();
	}
}
