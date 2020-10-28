class cachePool<T> {             // 在创建类时，声明参数类型为T
	T temp;
	public void save(T temp) { // 在创建save()方法时，指定参数类型为T
		this.temp = temp;
	}
     public T get() {             // 在创建get()方法时，指定返回值类型为T 
		return temp;
	}
}
public class Example26 {
	public static void main(String[] args) {
		// 在实例化对象时，传入参数为Integer类型
         cachePool<Integer> pool = new cachePool<Integer>(); 
         pool.save(new Integer(1));
         Integer temp = pool.get();
         System.out.println(temp);
	}
}
