package FirstJava;

public class NewPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//带参构造方法传参
			Person person = new Person("小强",18);
			//类名调用静态方法
			Person.eat();
			//实例调用成员方法
			person.eat();
			//实例调用成员方法
			person.love();
	}

}
