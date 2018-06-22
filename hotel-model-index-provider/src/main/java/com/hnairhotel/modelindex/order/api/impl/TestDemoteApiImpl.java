package com.hnairhotel.modelindex.order.api.impl;

import org.springframework.stereotype.Component;

import com.hnairhotel.modelindex.order.api.ITestDemoteApi;

/**
 *@description: 
 *@createTime:  2018年6月22日
 *@author: gaofeng
 */
@Component("testDemoteApi")
public class TestDemoteApiImpl implements  ITestDemoteApi {
	
	public String sayHello(String name) {
		return  name + ",Hello ";
	} 
}

