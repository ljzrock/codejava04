
public class YangHui {

	public static void main(String[] args) {
		/*杨辉三角 
		 * 分析：1，n行有n个元素
		 *  2，每行第一个元素和最后一个元素都是1
		 *  3，其他的元素值等于上一行对应的数值和该数值前一个数值的和
		 *  即：arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
		 *  4;打印10行杨辉三角
		 * */
		int[][] yangHui = new int[10][];
		for(int i = 0;i < yangHui.length;i++) {
			yangHui[i] = new int[i+1];//给一维数组开辟空间
			for(int j = 0;j < yangHui[i].length;j++) {
				
				if(j == 0 || j == yangHui[i].length-1) {//每行第一个元素和最后一个元素都是1
					yangHui[i][j] = 1;
				}else {
					yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1]; 
				//其他的元素值等于上一行对应的数值和该数值前一个数值的和
				    // i-1表示上一行 此行上的元素（j）和前一个元素（j-1）的和等于arr[i][j]
				}	
			}
		}
		for(int i = 0;i < yangHui.length;i++ ) {
			for(int j = 0;j < yangHui[i].length;j++) {
				System.out.print(yangHui[i][j]+" ");
			}
		System.out.println();
		}
	}

}
