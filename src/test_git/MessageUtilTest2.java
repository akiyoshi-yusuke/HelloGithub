package test_git;

import static org.junit.Assert.*;
import org.junit.Test;

public class MessageUtilTest2 {

	@Test
	public void test() {
		// setup
		MessageUtil messageUtil = new MessageUtil();
		// when
		String message = messageUtil.createMessage("akiyo");
		// then
		assertEquals("hello, akiyo", message);	}

}
