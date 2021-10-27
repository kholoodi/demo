package com.Duplication.DuplicationApp;
import org.junit.Test;
import static org.junit.Assert.*;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DuplicationAppApplicationTests {

	private DuplicationAppApplication duplicationTest = new DuplicationAppApplication();
	  @Test
	  Public void testDoublication()
	  {
		  Integer actual = duplicationTest.Duplication(6);
		  Integer expected = 12;
		   assertEquals(expected, actual);
                }


}


