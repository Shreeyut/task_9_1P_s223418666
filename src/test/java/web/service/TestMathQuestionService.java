package web.service;

import org.junit.Assert;
import org.junit.Test;

import web.service.MathQuestionService;

public class TestMathQuestionService {
 
	@Test
	public void testTrueAdd() {
		Assert.assertEquals(MathQuestionService.q1Addition ("1", "2"), 3, 0);
	}

	@Test
	public void testq1AddNumber1Null() {
		Assert.assertThrows(IllegalArgumentException.class, () -> {
            MathQuestionService.q1Addition(null, "2");
        });
	}
	@Test
	public void testq1AddNumber2Null() {
		Assert.assertThrows(IllegalArgumentException.class, () -> {
            MathQuestionService.q1Addition("2", null);
        });
	}
	@Test
	public void testTrueSub() {
		Assert.assertEquals(MathQuestionService.q2Subtraction ("2", "1"), 1, 0);
	}

	@Test
	public void testq2SubNumber1Null() {
		Assert.assertThrows(IllegalArgumentException.class, () -> {
            MathQuestionService.q2Subtraction(null, "2");
        });
	}
	@Test
	public void testq2SubNumber2Null() {
		Assert.assertThrows(IllegalArgumentException.class, () -> {
            MathQuestionService.q2Subtraction("2", null);
        });
	}
	@Test
	public void testTrueMul() {
		Assert.assertEquals(MathQuestionService.q3Multiplication ("2", "2"), 4, 0);
	}

	@Test
	public void testq3MulNumber1Null() {
		Assert.assertThrows(IllegalArgumentException.class, () -> {
            MathQuestionService.q3Multiplication(null, "2");
        });
	}
	@Test
	public void testq3MulNumber2Null() {
		Assert.assertThrows(IllegalArgumentException.class, () -> {
            MathQuestionService.q3Multiplication("2", null);
        });
	}
}
