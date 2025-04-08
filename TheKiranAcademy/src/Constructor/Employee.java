package Constructor;


public class Employee {

	private String empName;
	private int empId;
	private float empSalary;
	
	
	public Employee(String empname,int empId,float empsalary) {
		setEmpName(empName);
		setEmpId(empId);
		setempSalary(empSalary);
	}
	public String getEmpName() {
		return empName;
		
	}
	public void setEmpName(String EmpName) {
		if(empName != null && !empName.isEmpty())
			this.empName = empName;
		else
			System.out.println("name cannot be empty or numm");
	}
	public int getempId() {
		return empId;
	}
	public void setEmpId(int empId) {
		if(empId>0)
			this.empId = empId;
		else
			System.out.println("Id cannot be negative");
		
		
	}
	public float getempSalary() {
		return empSalary;
		
	}
	public void setempSalary(float Salary) {
		this.empSalary = empSalary;
		
	}
	@Override
	public String toString() {
		//return "employee [empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary + "]";
		return getEmpName()+"  "+getempId()+" "+getempSalary();
	}
	
	
}
