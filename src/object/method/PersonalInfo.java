package object.method;

public class PersonalInfo implements Cloneable{
	
	private String name;
	private int age;
	private Business bz;
	
	public PersonalInfo(String name, int age, String comp, String work) {
		super();
		this.name = name;
		this.age = age;
		this.bz = new Business(comp, work);
	}
	
	public void showPersonalInfo() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		bz.showBusiness();
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Business getBz() {
		return bz;
	}

	public void setBz(Business bz) {
		this.bz = bz;
	}

	@Override
	public PersonalInfo clone() throws CloneNotSupportedException {
		return (PersonalInfo) super.clone();
	}
	
}
