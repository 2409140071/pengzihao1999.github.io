package leetcodetest.dayof15;
import java.text.NumberFormat;


/*
 * ������ת˼·
 * 1.�����ж����������Ǹ��� �����ʹӵ�һλ��ʼת �����ӵڶ�λ��ʼת
 * 2.ͨ��һ����Ǽ�¼���������Ǹ���
 * ���ж������
 * 3.�������� ֱ�����
 * 4.���Ǹ�����ǰ���һ������
 */
public class Test7 {
 public static int  fun(int x)
 {
	  boolean flag=(x>0?true:false);
	  int end=(flag==true?0:1);
	  System.out.println(flag+""+end);
	  String str=String.valueOf(x);
	  char [] ch=str.toCharArray();
	  StringBuffer sb=new StringBuffer();
	  for(int i=ch.length-1;i>=end;i--)
	  {
		  sb.append(ch[i]);
	  }
	  int result=0;
	  try
	  {
	    result=Integer.parseInt(sb.toString());	 
	  }
	  catch (NumberFormatException e) {
		return 0;
	  }
	  return flag==true? result:-result;
	   
	  
	  
	  
 }
 public static void main(String[] args) {
	System.out.println(fun(1234567899));
}
}
