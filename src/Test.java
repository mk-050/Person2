
public class Test {

	public static void main(String[] args) {
		
		//①
		Person taro = new Person();
		taro.name= "taro";
		taro.age=18;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		System.out.println(" ");
		
		//②
		Person jiro = new Person("jiro",20);
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		System.out.println(" ");
		
		//③
		Person saburo= new Person("saburo");
		
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
		System.out.println(" ");
		
		//④
		Person noName = new Person(25);
		
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		System.out.println(" ");

		//➄
		Person hanako =new Person("hanako",17);
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
		
	}
}
