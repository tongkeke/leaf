package com.eshopms.util;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class GenericClass<T extends Serializable> {
	public T get0(T t){
		return t;
	}
}
