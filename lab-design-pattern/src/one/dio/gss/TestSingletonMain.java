package one.dio.gss;

import one.dio.gss.singleton.SingletonEager;
import one.dio.gss.singleton.SingletonLazy;
import one.dio.gss.singleton.SingletonLazyHolder;

public class TestSingletonMain {
	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		eager = SingletonEager.getInstance();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
		System.out.println(holder);
		holder= SingletonLazyHolder.getInstance();
		System.out.println(holder);
	}
}
