package com.subrutin.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Employee
		implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

	private String id;
	private String fullName;
	private String address;

	@Override
	public void setBeanName(String name) {
		System.out.println("1. bean name aware called");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("2. bean factory aware called");

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("3. ApplicationContextAware - ApplicationContext  called");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("5. InitializingBean - afterPropertiesSet called");

	}

	public void customInit() {
		System.out.println("6. custom-init");
	}

	public void customDestroy() {
		System.out.println("10. custom-destroy");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("9. destroy");

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullName=" + fullName + ", address=" + address + "]";
	}

}
