package FirstJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTrain {
			public static void main(String[] args) {
				Set<String> testSet=new HashSet<String>();
				testSet.add("无双剑姬");
				testSet.add("齐天大圣");
				testSet.add("不祥之刃");
				testSet.add("诡术妖姬");
				testSet.add("刀锋之影");
				testSet.add("影流之主");
				Iterator<String>  ite=testSet.iterator();
				while(ite.hasNext()) {
					System.out.print(ite.next()+"   ");
				}
				System.out.println();
				System.out.println(testSet);
			}

}
