package FirstJava;

public class Person {
			String name;
			int age;
			String sex;
			//��Ա����
			String skinColor="��ɫ";
			//�����
			static String nationality="�й�";
			//����
		    static final double  Height=1.77d;
			
		   public Person (String name, int age) {
			   		System.out.println(name);
			   		System.out.println(age);
			}
		   public Person() {
			System.out.println("Ĭ�Ϲ��췽��");
		}
		public static void eat() {
			   System.out.println("�˻�Է�");
		   }
		   public void love() {
			   System.out.println("̸����");

		   } 
}
