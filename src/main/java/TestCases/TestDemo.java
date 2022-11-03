package TestCases;
import com.db.AdminRegistration;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.db.AdminRegistration;
import com.db.Login;
import com.db.*;
class TestDemo {

	@Test
	public void Admin_Registration_true() {
		
		assertEquals(true,AdminRegistration.adminReg("cccc","1234","ccc@gmail.com"));
	}
	
	@Test
	public void UserVerification() {
		
		assertEquals(false,Login.userVerification("abc", "1234"));
	}
	
	
	@Test
	public void UserRegistration() {
		
		assertEquals(true,sameUserName.userVerification("ranga"));
	}
	
	@Test
	public void SupplierRegistration() {
		
		assertEquals(true,SupplierRegistration.supplierReg("boss","1234","boss@gmail.com"));
	}
	
	
	
	
	

}
