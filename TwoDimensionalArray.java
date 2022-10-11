
public class TwoDimensionalArray {

	public static void main(String[] args) {
		//二维数组介绍和使用
		//输出下面二维数组
//		0 0 0 0 0 0
//		0 0 1 0 0 0
//		0 2 0 3 0 0
//		0 0 0 0 0 0
		int[][] arr = {{0 ,0, 0, 0, 0, 0},{0, 0, 1, 0, 0, 0},
				{0, 2, 0, 3, 0, 0},{0, 0, 0, 0, 0, 0}};
		//二维数组中具体的数值访问 
		/*1,数组下标是从0开始 所有数组都遵从这个原则
		 * 2，访问数组具体值方法  第（i+1）个一维数组的第（j+1）个元素
		 * 以3为例在第三行第四个这是arr[2][3]  即arr[2][3] = 3 
		 * */	
		System.out.println("第三行第四个值是："+arr[2][3]);
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
		 System.out.println();	
		}
	}

}
