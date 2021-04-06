package com.cobiscorp.cobis.utils.base;

import java.util.HashMap;
import java.util.Map;

public class Singleton {

	private static final Singleton instance = new Singleton();

	@SuppressWarnings("rawtypes")
	private Map<Class, Object> mapHolder = new HashMap<Class, Object>();

	private Singleton() {
	}

	@SuppressWarnings("unchecked")
	public static <T> T getInstance(Class<T> classOf)  {
		synchronized (instance) {
			if (!instance.mapHolder.containsKey(classOf)) {
				T obj;
				try {
					obj = classOf.newInstance();
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
				instance.mapHolder.put(classOf, obj);
			}
			return (T) instance.mapHolder.get(classOf);
		}
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}