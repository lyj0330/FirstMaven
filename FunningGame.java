package FirstJava;

import java.util.Random;
import java.util.Scanner;

public class FunningGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("###��ӭ����������С��Ϸ###");
			System.out.println("��Ϸ��������һ����������ϵͳԤ����������Ƚϣ��¶�Ӯ����Ϸ��һ��ֻ�����λ���Ŷ");
			System.out.println("׼������Ϸ��ʼ...");
			Random random = new Random();
			int x = random.nextInt(3);
			for(int i=0;i<3;i++){
				Scanner sc = new Scanner(System.in);
				System.out.println("��"+(i+1)+"��"+"��"+"��������Ҫ�µ����֣�");
				int input  = sc.nextInt();
				if(input<x) {
					System.out.println("^~^���С��");
				}
				else if(input>x) {
					System.out.println("^<^��´���");
				}else {
					System.out.println("^_^��ϲ��¶��ˣ�");
					break;
				}
				if(i==2) {
					System.out.println("�ÿ�ϧ����Ļ���������");
				}
				}
				System.out.println("����ϵͳ���õ�������"+x);
			}
}
