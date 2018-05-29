package com.keyholesoftware.beandef.example.lazyloading;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.keyholesoftware.beandef.example.lazyloading.config.AppConfig;
import com.keyholesoftware.beandef.example.lazyloading.model.ClassA;
import com.keyholesoftware.beandef.example.lazyloading.model.ClassB;

public class LazyLoadingMainTest {

	@Test
	public void givenLazyAnnotation_whenConfigClass_thenLazyAll() {
		// Add @Lazy to AppConfig.class while testing
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		ctx.getBean(ClassA.class);
		ctx.getBean(ClassB.class);
		System.out.println("givenLazyAnnotation_whenConfigClass_thenLazyAll() is complete");
	}

	@Test
	public void givenLazyAnnotation_whenAutowire_thenLazyBean() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		ClassA classA = ctx.getBean(ClassA.class);
		classA.getBInstance();
		System.out.println("givenLazyAnnotation_whenAutowire_thenLazyBean() is complete");
	}

	@Test
	public void givenLazyAnnotation_whenBeanConfig_thenLazyBean() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		ctx.getBean(ClassA.class);
		System.out.println("givenLazyAnnotation_whenBeanConfig_thenLazyBean() is complete");
	}

}
