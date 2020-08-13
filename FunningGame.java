package FirstJava;

import java.util.Random;
import java.util.Scanner;

public class FunningGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("###欢迎来到猜数字小游戏###");
			System.out.println("游戏规则：输入一个正整数与系统预设的数字作比较，猜对赢得游戏，一共只有三次机会哦");
			System.out.println("准备好游戏开始...");
			Random random = new Random();
			int x = random.nextInt(3);
			for(int i=0;i<3;i++){
				Scanner sc = new Scanner(System.in);
				System.out.println("第"+(i+1)+"次"+"，"+"请输入你要猜的数字：");
				int input  = sc.nextInt();
				if(input<x) {
					System.out.println("^~^你猜小了");
				}
				else if(input>x) {
					System.out.println("^<^你猜大了");
				}else {
					System.out.println("^_^恭喜你猜对了！");
					break;
				}
				if(i==2) {
					System.out.println("好可惜，你的机会用完了");
				}
				}
				System.out.println("本轮系统设置的数字是"+x);
			}
}
