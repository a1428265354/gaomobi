package leetcode.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

import leetcode.cn.node.ListNode;
/**
 * leetcode的一些题
 * @author 1428265354@qq.com
 *
 */
public class Solution {
	/**
	 *    * 关键词 paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
	 * banned = ["hit"] 输出: "ball"
	 * https://leetcode-cn.com/problems/most-common-word/description/
	 * @param paragraph   // 元字符
	 * @param banned      // 关键字
	 * @return
	 */
	public String mostCommonWord(String paragraph, String[] banned) {
		paragraph = paragraph.toLowerCase();
		String[] split = paragraph.split(" ");
		List<String> list = new ArrayList<String>();
		for (String string : split) {

			string = string.replaceAll("[\\s+\\.\\!\\/_,$%^*(+\\\"\\']+|[+——！，。？?、~@#￥%……&*（）]", "");

			list.add(string);
		}

		for (int i = 0; i < banned.length; i++) {

			for (int j = 0; j < list.size(); j++) {
				if (banned[i].equals(list.get(j))) {
					list.remove(j);
					continue;
				}

			}
		}
		int count = 0;
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		for (String s1 : list) {

			if (map1.containsKey(s1)) {
				Integer integer = map1.get(s1);
				integer++;
				if (integer > count) {
					count = integer;
				}
				map1.put(s1, integer);
				continue;
			}
			if (!map1.containsKey(s1)) {
				map1.put(s1, 1);
				continue;
			}

		}
		Iterator<Entry<String, Integer>> iterator = map1.entrySet().iterator();
		HashMap<Integer, List<String>> map2 = new HashMap<Integer, List<String>>();
		while (iterator.hasNext()) {
			Entry<String, Integer> next = iterator.next();
			if (map2.containsKey(next.getValue())) {

				map2.get(next.getValue()).add(next.getKey());
				map2.put(next.getValue(), map2.get(next.getValue()));
			} else if (!map2.containsKey(next.getValue())) {
				List<String> list2 = new ArrayList<String>();
				list2.add(next.getKey());
				map2.put(next.getValue(), list2);
			}

		}

		Iterator<Entry<Integer, List<String>>> iterator2 = map2.entrySet().iterator();
		List<String> value2 = new ArrayList<String>();
		while (iterator2.hasNext()) {
			value2 = iterator2.next().getValue();
		}

		return value2.get(0);

	}

	/*
	 * 翻转链表 输入: 1->2->3->4->5->NULL 输出: 5->4->3->2->1->NULL
	 * https://leetcode-cn.com/problems/reverse-linked-list/description/
	 */

	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = null;
		while (head != null) {
			ListNode temp = head.next;
			head.next = pre;
			pre = head;
			head = temp;
		}

		return null;

	}

	public static void main(String[] args) {

		Solution solution = new Solution();

	}
}
