import java.util.Scanner;
public class SeqSearch {

	public static void main(String[] args) {
		// 顺序查找 
		String[] name = {"劫","发条","辛德拉","凯南","加里奥","崔斯特","索尔","亚索","皎月","凯尔","莫甘娜","安妮"};
        Scanner myScanner = new Scanner(System.in);
        System.out.print("请输入要查找的英雄：");
    	String findname = myScanner.next();
        int index = -1;//编程小技巧 使用变量的变化情况来判定
        for(int i = 0;i < name.length;i++) {
        	
        	if(findname.equals(name[i])) {
        	System.out.println("恭喜你找到了"+name[i]);
        	System.out.println("下标是："+i);
        	index = i;
        	break;
        	}
    	}
        if(index == -1) {
        	System.out.println("不好意思没有找到："+findname);
        }
	}
}