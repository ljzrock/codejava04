
public class BubbleStor {

	public static void main(String[] args) {
		// 冒泡排序特点 
		/*一共要进行arr.length-1轮
		 * 每轮比较的次数都在递减 并且首次比较次数是arr.length-1
		 * 每次比较都会两两比较 ，并且会交换数组元素位置 每次比较最终确定一个元素位置
		 * 经过arr.length-1的反复比较最重会产生一个有序的数组
		 * */
		//思考：本实例是按照从小到大排列，那么从大到小如何排列呢？
		int temp = 0;
		int[] arr = {24,69,80,57,13,55,435,200,-90,-1};
		for(int i =0 ;i < arr.length-1;i++) {//外层循环控制循环次数 
	     for(int j = 0;j < arr.length-1-i;j++) {//内层循环实现数组元素位置交换
	    	 if(arr[j] > arr[j+1]) {//如果数组元素中相邻两个数前面的数大于后面的数则数组元素位置交换
	    		 temp = arr[j];// 具体实现通过temp来是实现 将较大数先让temp保存
	    		 arr[j] = arr[j+1];//再将较小数赋给前面
                 arr[j+1] = temp;//	再让temp保存的值保存在后面的数组元素位置    		 
	    	 }        //本次循环完毕会将最大的数放在数组最末位置
	     } 	
	     System.out.println("\n========第"+(i+1)+"轮比较=======");
	    	 for(int j = 0;j < arr.length;j++) {
	    		 System.out.print(arr[j]+"\t");//打印数组
	    	 }
	    	 
		}
	}

}
