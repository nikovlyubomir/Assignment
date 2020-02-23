package com.example.Exercise;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import com.example.Exercise.Rest.CalculateRestController;


@SpringBootTest(classes = CalculateRestController.class)
class CalculateRestControllerTest {

	@Test
	void Calculate1() { // testing 100*100
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="10000";
		String originalOutput = controller.CalculateBigNumbers("100", "100");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate2() { // testing 100*-100
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="-10000";
		String originalOutput = controller.CalculateBigNumbers("-100", "100");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate3() { // testing 0*-100
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="0";
		String originalOutput = controller.CalculateBigNumbers("0", "100");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate4() { // testing 123456789*123456789
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="15241578750190521";
		String originalOutput = controller.CalculateBigNumbers("123456789", "123456789");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate5() { // testing 998877665544332211*998877665544332211
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="997756590723294801112232185932148521";
		String originalOutput = controller.CalculateBigNumbers("998877665544332211", "998877665544332211");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate6() { // testing 998877665544332211*-998877665544332211
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="-997756590723294801112232185932148521";
		String originalOutput = controller.CalculateBigNumbers("998877665544332211", "-998877665544332211");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate7() { // testing 123ABC*BCA123
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="Please use only integers and '-' operator for declaring negative integers!";
		String originalOutput = controller.CalculateBigNumbers("123ABC", "BCA123");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate8() { // testing 123ABC*123
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="Please use only integers and '-' operator for declaring negative integers!";
		String originalOutput = controller.CalculateBigNumbers("123ABC", "123");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate9() { // testing 123*123ABC
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="Please use only integers and '-' operator for declaring negative integers!";
		String originalOutput = controller.CalculateBigNumbers("123", "123ABC");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate10() { // testing ABC123*123
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="Please use only integers and '-' operator for declaring negative integers!";
		String originalOutput = controller.CalculateBigNumbers("ABC123", "123");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate11() { // testing 123*ABC123
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="Please use only integers and '-' operator for declaring negative integers!";
		String originalOutput = controller.CalculateBigNumbers("123", "ABC123");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate12() { // testing ABC*ABC
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="Please use only integers and '-' operator for declaring negative integers!";
		String originalOutput = controller.CalculateBigNumbers("ABC", "ABC");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate13() { // testing ABC*123
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="Please use only integers and '-' operator for declaring negative integers!";
		String originalOutput = controller.CalculateBigNumbers("ABC", "123");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate14() { // testing 123*ABC
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="Please use only integers and '-' operator for declaring negative integers!";
		String originalOutput = controller.CalculateBigNumbers("123", "ABC");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate15() { // testing 1-2-3*-1-2-3
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="Please use only integers and '-' operator for declaring negative integers!";
		String originalOutput = controller.CalculateBigNumbers("1-2-3", "-1-2-3");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate16() { // testing 123*-1-2-3
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="Please use only integers and '-' operator for declaring negative integers!";
		String originalOutput = controller.CalculateBigNumbers("123", "-1-2-3");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate17() { // testing -123*1-2-3
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="Please use only integers and '-' operator for declaring negative integers!";
		String originalOutput = controller.CalculateBigNumbers("-123", "1-2-3");

		assertEquals(expectedOutput, originalOutput);
	}
	@Test
	void Calculate18() { // testing -123*1-2-3
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="3683297622691562085500742781348841954902561";
		String originalOutput = controller.CalculateBigNumbers("-1919191919191919191919", "-1919191919191919191919");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate19() { // testing -998877665544332211*998877665544332211
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="-997756590723294801112232185932148521";
		String originalOutput = controller.CalculateBigNumbers("998877665544332211", "-998877665544332211");

		assertEquals(expectedOutput, originalOutput);
	}


	@Test
	void Calculate21() { // testing 0*0
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="0";
		String originalOutput = controller.CalculateBigNumbers("0", "0");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate22() { // testing 32183128*0
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="0";
		String originalOutput = controller.CalculateBigNumbers("32183128", "0");

		assertEquals(expectedOutput, originalOutput);
	}

	@Test
	void Calculate23() { // testing 32183128*0
		CalculateRestController controller = new CalculateRestController();

		String expectedOutput="0";
		String originalOutput = controller.CalculateBigNumbers("-32183128", "0");

		assertEquals(expectedOutput, originalOutput);
	}



}
