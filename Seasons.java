package FirstJava;

import java.util.Scanner;

public class Seasons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("�������·ݣ�");
			int input = sc.nextInt();
			switch(input){
				case 3: case 4: case 5:
					System.out.println(input+"���Ǵ���");
					break;
				case 6: case 7: case 8:
					System.out.println(input+"�����ļ�");
					break;
				case 9: case 10: case 11:
					System.out.println(input+"�����＾");
					break;
				case 12: case 1: case 2:
					System.out.println(input+"���Ƕ���");
					break;
					
			}
	}

}
