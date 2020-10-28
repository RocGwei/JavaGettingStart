import java.util.*;
public class Example24 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2008, 7, 8);
		calendar.add(Calendar.DATE, 100);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int date = calendar.get(Calendar.DATE);
		System.out.println("竣工日期为:" + year + "年" + month + "月" + date + "日");
	}
}
