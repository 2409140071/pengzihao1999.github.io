package leetcodetest.dayof15;
/*
 * ����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�
��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
ʾ�� 1:
���� nums = [3,2,2,3], val = 3,
����Ӧ�÷����µĳ��� 2, ���� nums �е�ǰ����Ԫ�ؾ�Ϊ 2��
�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
ʾ�� 2:
���� nums = [0,1,2,2,3,0,4,2], val = 2,
����Ӧ�÷����µĳ��� 5, ���� nums �е�ǰ���Ԫ��Ϊ 0, 1, 3, 0, 4��
ע�������Ԫ�ؿ�Ϊ����˳��
�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
 */
public class Test27 {
	   public static int removeElement(int[] nums, int val) {
	       int j=nums.length-1;
	       System.out.println(nums.length-1);
		   for(int i=nums.length-1;i>=0;i--)
	      {
	    	 if(nums[i]==val)
	    	 {
	    		 int temp=nums[i];
	    		 nums[i]=nums[j];
	    		 nums[j]=temp;
	    		 j--;
	    	 }
	      }
		  
		    return j+1;
	    }
	   public static void main(String[] args) {
		int arr[]={0,1,2,2,3,0,4,2};
		int val=2;
		
		 System.out.println("yuansugeshu"+removeElement(arr,val));
		 for(int ar:arr)
			{
				System.out.println(ar);
			}
	}
}
