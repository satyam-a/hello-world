import java.util.ArrayList;
import java.util.List;

public class HelloGoodbye {
	
	
	public static void main(String[] args,List<String> addressType) {
		List<Address> addresses = new ArrayList<Address>();
		int i = 0;
		if(!addressType.isEmpty()) {
			for(String addType:addressType) {
				Address a = new Address();
				a.setAid(i++);
				a.setAddressType(addType);
				a.setCompleteAddress("Bangalore");
				addresses.add(a);
			}
		}
		
		
		Employee e1 = new Employee();
		e1.setAddresses(addresses);
	}
}
