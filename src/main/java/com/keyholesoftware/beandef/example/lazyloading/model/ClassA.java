package com.keyholesoftware.beandef.example.lazyloading.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class ClassA {

	@Lazy
	@Autowired
	private ClassB classB;

	public ClassA() {
		System.out.println("ClassA bean initialized!");
	}

	public ClassB getBInstance() {
		return classB;
	}
}
