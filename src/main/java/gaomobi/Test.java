package gaomobi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/*	输入:4332314
 * 	输出:4321
 * 	要求 : 不改变顺序的情况下去重
 */

/**	
 * 	看到的题
 *	输入:4332314
 * 	输出:4321
 * 	要求 : 不改变顺序的情况下去重 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		int inNum = 551251251;
		String ofnum = String.valueOf(inNum);
		String[] numArray = ofnum.split("");
		String result = "";

		for (int i = 0; i < numArray.length; i++) {
			if (result.contains(numArray[i])) {
				continue;
			}
			result += numArray[i];
		}
		System.out.println(result);
	}

}
