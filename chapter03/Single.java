class Single {
	// 自己创建一个对象
	private static Single INSTANCE = new Single(); 
	private Single() {}                      // 私有化构造方法
	public static Single getInstance() { // 提供返回该对象的静态方法
		return INSTANCE;
	}
}
/*
 class Single {
	private Single() {}
	public static final Single INSTANCE = new Single();
}

*/