package leetCode.cn;

import leetCode.cn.node.ListNode;

public class test {

	public static void main(String[] args) {
		/*
		 * ListNode a = new ListNode(10); ListNode b = new ListNode(20); ListNode c =
		 * new ListNode(30); ListNode d = new ListNode(40); ListNode e = new
		 * ListNode(50); a.next = b;// 这里a的next直接指向了b b.next = c; d.next = e; e.next =
		 * null; ListNode head = a; ListNode new_head; while (head ) {
		 * 
		 * }
		 * 
		 * System.out.println(a.hashCode() + "\n" + a.next.hashCode() + "\n" +
		 * b.hashCode());
		 */
		test name = new test();
		name.PrintN2(10);
	}

	void PrintN1(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
	}

	void PrintN2(int n) {
		if (n != 0) {
			PrintN2(n - 1);
			System.out.println(n);
		}
	}

}
