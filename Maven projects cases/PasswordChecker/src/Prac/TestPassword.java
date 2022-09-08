package Prac;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestPassword {

	@Test
	public void TestPasswordLength() {
		PasswordValidator pv=new PasswordValidator();
		Assert.assertEquals(true,pv.isValid("Ab12"));
	}

}
