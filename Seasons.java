package FirstJava;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入月份：");
			int input = sc.nextInt();
			switch(input){
				case 3: case 4: case 5:
					System.out.println(input+"月是春季");
					break;
				case 6: case 7: case 8:
					System.out.println(input+"月是夏季");
					break;
				case 9: case 10: case 11:
					System.out.println(input+"月是秋季");
					break;
				case 12: case 1: case 2:
					System.out.println(input+"月是冬季");
					break;
					
			}
	}

}
