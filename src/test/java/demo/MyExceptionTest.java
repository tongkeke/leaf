package demo;

import org.junit.Test;

import com.eshopms.util.MyException;

public class MyExceptionTest {
	@Test
	public void myExceptionTest() throws MyException{
		throw new MyException("you yichang ");
	}
}
