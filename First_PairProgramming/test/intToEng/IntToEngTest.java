package intToEng;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void test() {
		IntToEng ite = new IntToEng();
		String s[] = {"zero","one", "two", "three", "four", "five"};
		for(int i=0; i<=5; i++){
			String t = ite.translateEng(i);
			String expected = s[i];
			assertThat(t,is(expected));
		}
	}

}
