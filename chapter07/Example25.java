class CachePool {                          // 创建CachePool类
	Object temp;
	public void save(Object temp) {     // 定义一个save()方法用于保存数据
		this.temp = temp;
	}
	public Object get() {                 // 定义一个get()方法用于获取数据
		return temp;
	}
}
public class Example25 {
	public static void main(String[] args) {
		CachePool pool = new CachePool();     // 创建CachePool对象
		pool.save(new Integer(1));             // 存入数据
		String temp = pool.get();              // 取出数据
		System.out.println(temp);
	}
}
