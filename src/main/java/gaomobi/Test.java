package gaomobi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/*	输入:4332314
 * 	输出:4321
 */
public class Test {

	public static void main(String[] args) throws IOException {
		int in_num = 423234;
		String ofnum = String.valueOf(in_num);
		String[] numArray = ofnum.split("");
		String result = "";

		List<Object> flist = new ArrayList<Object>();
		for (int i = 0; i < numArray.length; i++) {
			if (result.contains(numArray[i])) {
				continue;
			}
			result += numArray[i];
		}
		System.out.println(result);
	}

}
