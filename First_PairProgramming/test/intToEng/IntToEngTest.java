package intToEng;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void test() {
		IntToEng ite = new IntToEng();
		String s[] = {"zero","one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine", "ten", 
    			"eleven", "twelve", "thirteen", "fourteen", "fifteen", 
    			"sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
		for(int i=0; i<=5; i++){
			String t = ite.translateEng(i);
			String expected = s[i];
			assertThat(t,is(expected));
		}
	}
	
	@Test
	public void test2(){
		IntToEng ite = new IntToEng();
		String expected="";
		String act = "";
		String s1[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty",
					"seventy", "eighty", "ninety"};
		String s2[] = {"zero", "one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine"};
		
		for(int i=2; i<s1.length; i++){
			for(int k=0; k<s2.length; k++){
				expected = s1[i];
				if(k>0) expected += s2[k];
				act = ite.translateEng(i*10+k);
				assertThat(act, is(expected));
			}
		}
		expected = "one hundred";
		act = ite.translateEng(100);
		assertThat(act, is(expected));
	}

}
