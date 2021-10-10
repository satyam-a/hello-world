import java.util.List;

public class Employee {
	private Integer eid;
	private String ename;
	private String gender;
	
	private List<Address> addresses;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public Employee(Integer eid, String ename, String gender, List<Address> addresses) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.gender = gender;
		this.addresses = addresses;
	}
	
	
}
