package com.kzarif;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AutoDeployApplicationTests {

	@Test
	void contextLoads() {
		String data = "Data";
		assertTrue( data.equals("Data"));
	}

}
