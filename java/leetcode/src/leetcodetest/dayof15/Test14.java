package leetcodetest.dayof15;
/*
 * �Ѻ����ÿ���ַ�ת��Ϊ�ַ��� 
 *  ���к�buffer�еĲ��ֽ��бȽ� �����buffer�е��ַ�����ͬ 
 */
public class Test14 {
	  public static  String longestCommonPrefix(String[] strs) {
		  if(strs.length==0)
			  return "";
		  if (strs.length == 1){
		      return strs[0];
		        }
		     
		 char base []=strs[0].toCharArray();
		 StringBuffer result= new StringBuffer();
		 int k=0;
		
		 boolean flag=true;
		 for(int s=0;s<=base.length-1&&flag==true;s++)//��ͷ�ַ�Ϊ��׼ ǰ׺���ַ��������ܳ���ͷ�ַ�
		 {
		 for(int i=1;i<=strs.length-1;i++ )//�����ÿ���ַ���
		     {    
		      char [] compare=strs[i].toCharArray();//��ȡ�����ַ������ַ������ʾ��ʽ	
		      if(s>compare.length-1||compare[s]!=base[s])
		      {
		    	  flag=false;
		    	  break;
		      }
		       if(compare[s]==base[s])//����ͻ����ַ�����Ƚ���ͬ
		       {
		    		 k++;  		
		       }
		       
		    }
		 }
		 System.out.println(k);
		 int end=k/(strs.length-1);
		 for(int start=0;start<=end-1;start++)
		 {
			 result.append(base[start]);
		 }	 
		  return result.toString();
		          
	    }
	  public static void main(String[] args) {
		String [] str={""};
		System.out.println(longestCommonPrefix(str));
		
	}
}
