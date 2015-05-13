package intToEng;

import java.util.Scanner;

public class IntToEng {

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
		String 十の位[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty",
				"seventy", "eighty", "ninety"};
    	String 一の位[] = {
    			"zero", "one", "two", "three", "four", "five",
    			"six", "seven", "eight", "nine"}; 
    	String 十から十九[] ={"ten", 
    			"eleven", "twelve", "thirteen", "fourteen", "fifteen", 
    			"sixteen", "seventeen", "eighteen", "nineteen"};
    	
    	String ans ="";
    	if(n==100){
    		return "one hundred";
    	}
    	if(n>=20){
    		ans += 十の位[n/10];
    		n = n%10;
    	}
    	if(n>=10){
    		return 十から十九[n%10];
    	}
    	if(n>=0){
    		if(ans.length()>0 && n == 0);	
    		else ans += 一の位[n];
    	}
    	return ans;
    }
}