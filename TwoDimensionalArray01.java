
public class TwoDimensionalArray01 {

	public static void main(String[] args) {
		// 动态创建二维数组 （在不确定列的情下）
		/*打印;  1
		 *       2  2
		 *       3  3  3
		 * 思路分析：他有三个一维数组    列不确定  
		 *       
		 * */
		int[][] arr = new int[10][];//先创建有三个一维数组的二维数组 一维数组空间没有开辟
		for(int i = 0;i < arr.length;i++) {//遍历二维数组
			arr[i] = new int[i+1];// 这一步是在给以为数组开辟空间 
			for(int j = 0;j < arr[i].length;j++) {//遍历每个一维数组
					arr[i][j] = i+1;//给一维数组赋值
				}
		     	
			}
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {//二维数组遍历输出
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}
		
		}
	}


