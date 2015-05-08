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
		String v[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty",
				"seventy", "eighty", "ninety"};
    	String u[] = {
    			"zero", "one", "two", "three", "four", "five",
    			"six", "seven", "eight", "nine", "ten", 
    			"eleven", "twelve", "thirteen", "fourteen", "fifteen", 
    			"sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
    	if(n<=20){
    		return u[n];
    	}else if(n<100){
    		int i = n/10;
    		int k = n%10;
    		String ans = v[i];
    		if(k!=0) ans += u[k];
    		return ans;
    	}else{
    		return "one hundred";
    	}
    }
}