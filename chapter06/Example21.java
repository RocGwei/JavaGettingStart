public class Example21 {
	public static void main(String args[]) {
		int w = Integer.parseInt(args[0]);
		int h = Integer.parseInt(args[1]);
		for(int i=0;i<h;i++){
			StringBuffer sb=new StringBuffer();
			for(int j=0;j<w;j++){
				sb.append("*");
			}
			System.out.println(sb.toString());
		}		
	}
}
