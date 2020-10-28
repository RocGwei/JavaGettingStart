import java.util.*;
public class Example31 {
	public static void main(String[] args) {
		int[] arr = { 9, 8, 3, 5, 2 };
		int[] copied = Arrays.copyOfRange(arr, 1, 7);
		for (int i = 0; i < copied.length; i++) {
			System.out.print(copied[i] + " ");
		}
	}
}
