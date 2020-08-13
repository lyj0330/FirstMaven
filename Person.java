package FirstJava;

public class Person {
			String name;
			int age;
			String sex;
			//成员变量
			String skinColor="黄色";
			//类变量
			static String nationality="中国";
			//常量
		    static final double  Height=1.77d;
			
		   public Person (String name, int age) {
			   		System.out.println(name);
			   		System.out.println(age);
			}
		   public Person() {
			System.out.println("默认构造方法");
		}
		public static void eat() {
			   System.out.println("人会吃饭");
		   }
		   public void love() {
			   System.out.println("谈恋爱");

		   } 
}
