
public class P40Text2 {
   public static void main(String []args)
   {
	   Text test1=new Text();
	   Text test2=new Text();
	   test1.f=86.76f;
	   test2.f=594.45f;
	   test1=test2;//��ʱʵ���ϰ�test2�����ø�ֵ����test1 ������ָ��һ���洢�ռ�
	    //���������һ��ֵ�����޸ģ��޸ĵ�������ֵ ��û��ʹ�õĶ���ͽ��������������
	   System.out.println("test1.f:"+test1.f+"test2.f:"+test2.f);
   }
}
class Text
{
	float f;
}