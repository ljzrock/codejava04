
public class BubbleStor01 {

	public static void main(String[] args) {
		// 本例实现需要按照从大到小排列一个数组
		int[] arr = {12,45,7,29,80,76};
		int temp = 0;
		for(int i = 0;i < arr.length-1;i++) {//外层循环
		for(int j = 0;j < arr.length-1-i;j++) {//内层循环
			if(arr[j]<arr[j+1]) {
				temp = arr[j];
				arr[j] = arr[j+1]; //数组元素位置交换
				arr[j+1] = temp;
			}//本轮循环完毕会将数组最小数值保存在数组最末尾位置
		}
		System.out.println("\n++++++++++第"+(i+1)+"轮比较++++++++++");
		for(int j = 0;j < arr.length;j++) {
			System.out.print(arr[j]+"\t");
			
			}
		}
	}

}
