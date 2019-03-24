package Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class calculatorTest {

	Cal obj=new Cal();
	@Test
	void testAdd() {
		assertEquals(10, obj.add(5,5));
		assertEquals(6, obj.add(10,-4));
		assertEquals(0, obj.add(5,-5));
		assertEquals(-6, obj.add(-10,4));
		assertEquals(6, obj.add(0,6));
	}
	@Test
	void testMultiply()
	{
		assertEquals(25, obj.multi(5,5));
		assertEquals(-40, obj.multi(10,-4));
		assertEquals(-25, obj.multi(5,-5));
		assertEquals(40, obj.multi(-10,-4));
		assertEquals(0, obj.multi(0,6));
		
	}
	@Test
	void testDivide()
	{
		assertEquals(1.0, obj.div(5,5));
		assertEquals(5.0, obj.div(25,5));
		assertEquals(-5.0, obj.div(-25,5));
		assertEquals(-5.0, obj.div(25,-5));
		assertEquals(5.0, obj.div(-25,-5));
		Assertions.assertThrows(ArithmeticException.class,()->obj.divide(25, 0));
	}

}
