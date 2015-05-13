package intToEng;

import java.util.Scanner;

public class IntToEng {

    // ���C�����\�b�h
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // ���l���p�󂷂�ϊ����郁�\�b�h
    static String translateEng(int n) {
		String �\�̈�[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty",
				"seventy", "eighty", "ninety"};
    	String ��̈�[] = {
    			"zero", "one", "two", "three", "four", "five",
    			"six", "seven", "eight", "nine"}; 
    	String �\����\��[] ={"ten", 
    			"eleven", "twelve", "thirteen", "fourteen", "fifteen", 
    			"sixteen", "seventeen", "eighteen", "nineteen"};
    	
    	boolean flag = false;
    	String ans ="";
    	if(n>=1000){
    		if(n/1000 >= 2)
    			ans += ��̈�[n/1000];
    		ans += " thousand ";
    		n %= 1000;
    		flag = true;
    	}
    	if(n>=100){
    		ans += ��̈�[n/100]+" hundred ";
    		n %= 100;
    		flag = false;
    	}
    	if(n>=20){
    		ans += �\�̈�[n/10];
    		n = n%10;
    		flag = true;
    	}
    	if(n>=10){
    		return ans + �\����\��[n%10];
    	}
    	if(n>=0){
    		if(ans.length()>0 && n == 0)
    			return ans;
    		if(!flag && ans.length()>0){
    			ans += " and ";
    		}
    		ans += ��̈�[n];
    	}
    	return ans;
    }
}