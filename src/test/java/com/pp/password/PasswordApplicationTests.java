package com.pp.password;

import com.pp.password.utils.Utils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@SpringBootTest
class PasswordApplicationTests {

	/*
	Test for check encryption and decryption methods working well
	 */
	@Test
	public void  testEncryption(){
		assertThat(Utils.decrypt(Utils.encrypt("Test")),containsString("Test"));
	}

}
