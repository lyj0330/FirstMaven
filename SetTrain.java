package FirstJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTrain {
			public static void main(String[] args) {
				Set<String> testSet=new HashSet<String>();
				testSet.add("��˫����");
				testSet.add("�����ʥ");
				testSet.add("����֮��");
				testSet.add("��������");
				testSet.add("����֮Ӱ");
				testSet.add("Ӱ��֮��");
				Iterator<String>  ite=testSet.iterator();
				while(ite.hasNext()) {
					System.out.print(ite.next()+"   ");
				}
				System.out.println();
				System.out.println(testSet);
			}

}
