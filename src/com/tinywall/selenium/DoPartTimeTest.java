package com.tinywall.selenium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Arun David	
 *
 */
public class DoPartTimeTest {
	public static void main(String arg[]) throws Exception{
		System.out.println("DoPartTimeTest start.");
	    try {
	    	DoPartTimeTestFlow obj = new DoPartTimeTestFlow();
	    	obj.setUp();
	    	obj.testProviderRegister();
	        obj.testProviderJobs();
	        obj.testLogin(DoPartTimeConstant.LOGIN_PROVIDER_REGISTER_MAIL_ID,DoPartTimeConstant.LOGIN_PROVIDER_REGISTER_PASSWORD);
	     	obj.testLogin(DoPartTimeConstant.LOGIN_ADMIN_REGISTER_MAIL_ID,DoPartTimeConstant.LOGIN_ADMIN_REGISTER_PASSWORD);
	     	obj.testAdminJobApproval();	
	     	obj.testSeekerRegister();
	    	obj.testSeekerProfile();
	    	obj.testSeekerApply();
	    	obj.testLogin(DoPartTimeConstant.LOGIN_SEEKER_REGISTER_MAIL_ID,DoPartTimeConstant.LOGIN_SEEKER_REGISTER_PASSWORD);
	    	obj.testLogin(DoPartTimeConstant.LOGIN_ADMIN_REGISTER_MAIL_ID,DoPartTimeConstant.LOGIN_ADMIN_REGISTER_PASSWORD);
	     	//obj.testAdminQuickJobRequest();
	    	//obj.testProviderQuickPostJobs();
	     	//obj.tearDown();
		} catch (Throwable e) {
			System.out.print("Exception in DoPartTimeTest:"+e);
			e.printStackTrace();
		}
	    System.out.println("DoPartTimeTest end.");
    }
}
