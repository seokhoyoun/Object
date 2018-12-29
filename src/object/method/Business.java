package object.method;

public class Business {
	private String company;
	private String work;
	public Business(String company, String work) {
		super();
		this.company = company;
		this.work = work;
	}
	public void showBusiness() {
		System.out.println("회사 : "+company);
		System.out.println("업무 : "+work);
	}
	@Override
	public Business clone() throws CloneNotSupportedException {
		return (Business) super.clone();
	}
}
