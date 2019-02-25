package first;

class Implementation implements Interface {

	@Override
	public String employeeDetails() {
		System.out.println("interface implementation");
		System.out.println("Name:" + name);
		System.out.println("Address:" + address);
		return null;
	}

	
	public int employeeId() {

		System.out.println("Id:" + id);
		return 0;
	}
	public static void main(String args[]){  
		Implementation imp=new Implementation();
		imp.employeeDetails();
		System.out.println(imp.employeeId());
	}
}
