package test.philosophersproblem;

import java.util.concurrent.Semaphore;

/*
 * 
 * ��ѧ�ҳԷ�˼·��
 *   ����ÿ����ѧ��������ߵĿ���
 *   һ��������ߵĿ���
 *   ���������ұߵĿ���  ����ұߵĿ��ӱ����� ���ͷ���ߵĿ���
 *   ���������ֻ���Ӷ��õ��� ->�Է�
 *       ���û���õ�->����˼��
 *   
 *   ʵ�ֲ���:
 *      ��һ���������������ʾ�����Ƿ��õ� ���Ϊtrue�õ��� ���Ϊfalse��ʾ����û�б��õ�
 *          
 *   
 *   
 * ע�⣺ÿ����ѧ��ֻ��ͬʱһ������߻��ұߵĿ��ӣ�����õ���ߵĿ��ӣ�û���õ��ұߵģ������°���ߵĿ��ӷ���
 *   
 */
public class EatingResource {
	private boolean  flags[] = {false , false, false , false , false};
	
	//��ʾ��i����ѧ�ҿ�ʼ��
	public void start(int i){
		System.out.println("��ѧ��"+i+"�ڽ���˼��");
		flags[i%5] = true;//�õ���ߵĿ���
	  System.out.println("��ѧ��"+i+"�õ���ߵĿ��� ");
		if(flags[(i+4)%5] == true){//����ȥ���ұߵĿ���ʧ��
		     flags[i%5] = false;      //�ͷ���ߵĿ���
		     System.out.println("��ѧ��"+i+"�ò����ұߵĿ����ͷ�����ߵĿ��� ���������ֿ�ʼ˼����");
		}
		else{
			flags[(i+4)%5] = true; //��ʾ�õ����ұߵĿ��ӿ��Կ�ʼ�Է���
			System.out.println("��ѧ��"+i+"��ֻ���Ӷ��õ���");
			System.out.println("��ѧ��"+i+"��ʼ�Է���");
			flags[i%5]=false;//�ͷ����ҿ���
			flags[(i+4)%5]=false;
			System.out.println("��ѧ��"+i+"��������ֻ����");
			
		}
	}
}


