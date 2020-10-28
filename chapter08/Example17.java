import java.io.*;
public class Example17 {
	public static void main(String[] args) throws Exception {
		StringBuffer sb=new StringBuffer();
		int ch;
         // while循环用于读取键盘输入的数据
		while((ch=System.in.read())!=-1){    // 判断是否读取到数据的末尾
              // 对输入的字符进行判断，如果是回车“\r”或者换行“\n”，则跳出循环
			if(ch=='\r'||ch=='\n'){
				break;
			}
			sb.append((char)ch);      // 将读取到数据
		}
		System.out.println(sb);       // 打印键盘输入的数据
	}
}
