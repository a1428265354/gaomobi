package gaomobi;

public class Test_array {
	public static void main(String[] args) {
		int[] i = { 1, 2, 3 };
		System.out.println(i.hashCode());
		int[] j = new int[3];
		System.out.println(j.hashCode());
		System.out.println(j == i);
		j = i;
		System.out.println(j.hashCode());

	}
}
