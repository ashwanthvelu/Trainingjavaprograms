package first;



public class Sample {

	String name;
	String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public static void main(String[] args) {
		
		Sample sample=new Sample();
		sample.setName("Ashwanth");
		sample.getName();
		sample.setAddress("cbe");
		sample.getAddress();
		System.out.println(sample.getName()+" "+sample.getAddress());
		
	}

}
