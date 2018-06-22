package com.hnairhotel;

import org.junit.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.hnairhotel.modelindex.order.api.ITestDemoteApi;

import lombok.extern.slf4j.Slf4j;

/**
 *@description: TODO
 *@createTime:  2018年6月22日
 *@author: gaofeng
 */
@Slf4j
public class TestDubbo extends BaseJunit4Test {
	
	@Autowired
	ITestDemoteApi testDemoteApi;
	
	@Test
	public void say() {
		String str = testDemoteApi.sayHello("Jim");
		log.info(" >>>>>" + str);
		
	}
	
}

