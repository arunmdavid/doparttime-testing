
package com.tinywall.selenium;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.thoughtworks.selenium.*;
import junit.framework.*;
 
/**
 * @author Arun David
 *
 */
public class DoPartTimeTestFlow extends TestCase {
    private Selenium browser;
   
        
    public void setUp() throws Exception {
    	System.out.println("setUp start.");
        browser = new DefaultSelenium("localhost",4444, "*firefox", DoPartTimeConstant.BASE_PATH);
        browser.start();
        System.out.println("setUp end.");
    }
    public void testLogin(String username,String password) throws Exception {
        System.out.println("testLogin start.");
        DoPartTimeTestUtil doparttime=new DoPartTimeTestUtil(this.browser);
        doparttime.login(username,password);
        System.out.println("testLogin end.");

    }
    public void testProviderRegister() throws Exception {
        System.out.println("testproviderregister start.");
        DoPartTimeTestUtil doparttime=new DoPartTimeTestUtil(this.browser);
        doparttime.providerRegister();
        doparttime.fillProviderDetails();
        doparttime.providerVerification();
        System.out.println("testproviderRegister end.");
    }
    public void testProviderJobs() throws Exception {
        System.out.println("testProviderJobs start.");
        DoPartTimeTestUtil doparttime=new DoPartTimeTestUtil(this.browser);
        //doparttime.login(DoPartTimeConstant.PROVIDER_REGISTER_MAIL_ID,DoPartTimeConstant.PROVIDER_REGISTER_PASSWORD);
        doparttime.providerJobs();
        System.out.println("testProviderJobs end.");
    }
    public void testAdminJobApproval() throws Exception {
    	System.out.println("testAdminJobApproval start.");
        DoPartTimeTestUtil doparttime=new DoPartTimeTestUtil(this.browser);
        doparttime.login(DoPartTimeConstant.LOGIN_ADMIN_REGISTER_MAIL_ID,DoPartTimeConstant.LOGIN_ADMIN_REGISTER_PASSWORD);
        doparttime.adminJobApproval();
        System.out.println("testAdminJobApproval end.");
        
    }
     public void testSeekerProfile() throws Exception {
        System.out.println("testSeekerProfile start.");
        DoPartTimeTestUtil doparttime=new DoPartTimeTestUtil(this.browser);
        doparttime.login(DoPartTimeConstant.SEEKER_REGISTER_MAIL_ID,DoPartTimeConstant.SEEKER_REGISTER_PASSWORD);
        doparttime.seekerProfile();
        System.out.println("testSeekerProfile end.");
    }
   
    public void testSeekerRegister() throws Exception {
        System.out.println("testSeekerRegister start.");
        DoPartTimeTestUtil doparttime=new DoPartTimeTestUtil(this.browser);
        doparttime.seekerRegister();
        doparttime.fillPersonalDetails();
        doparttime.submitProfessionalDetails();
        System.out.println("testSeekerRegister end.");
    }
    public void testSeekerApply() throws Exception {
        System.out.println("testSeekerApply start.");
        DoPartTimeTestUtil doparttime=new DoPartTimeTestUtil(this.browser);
        doparttime.seekerApply();
        System.out.println("testSeekerApply end.");
    }
    public void testProviderQuickPostJobs() throws Exception {
        System.out.println("testProviderQuickPostJobs start.");
        DoPartTimeTestUtil doparttime=new DoPartTimeTestUtil(this.browser);
        //doparttime.login(DoPartTimeConstant.PROVIDER_REGISTER_MAIL_ID,DoPartTimeConstant.PROVIDER_REGISTER_PASSWORD);
        doparttime.providerQuickPostJobs();
        doparttime.providerVerification();
        System.out.println("testProviderQuickPostJobs end.");
    }
    public void testAdminQuickJobRequest() throws Exception {
        System.out.println("testAdminQuickJobRequest start.");
        DoPartTimeTestUtil doparttime=new DoPartTimeTestUtil(this.browser);
        doparttime.adminQuickJobRequest();
        System.out.println("testAdminQuickJobRequest end.");
    }
   
    
   public void tearDown() throws Exception {
    	System.out.println("tearDown start.");
    	System.out.print("Tests Completed.");
    	//browser.close();
        System.out.println("tearDown end.");
    }
}