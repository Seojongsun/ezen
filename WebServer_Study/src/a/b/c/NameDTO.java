package a.b.c;

public class NameDTO {

	private String name = "홍길동";
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "NameDTO [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
