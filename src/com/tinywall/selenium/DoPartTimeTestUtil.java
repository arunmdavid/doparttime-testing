package com.tinywall.selenium;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.thoughtworks.selenium.Selenium;

/**
 * @author Arun David
 */
public class DoPartTimeTestUtil {
	private Selenium browser;
	public DoPartTimeTestUtil() {
		super();
	}
	public DoPartTimeTestUtil(Selenium browser) {
		super();
		this.browser = browser;
	}
    boolean login(String username,String password) throws Exception{
    	System.out.println("login start.");
    	browser.open(DoPartTimeConstant.BASE_PATH+"/auth/login");
        browser.waitForPageToLoad("50000");
        browser.type("username",username);
        browser.type("password",password);
        browser.click("login-submit");
        browser.waitForPageToLoad("70000");
        System.out.println("login end.");
        return true;
    }   
    boolean providerRegister() throws Exception{
        System.out.println("providerRegister start.");
        browser.open(DoPartTimeConstant.BASE_PATH+"/provider_register");
        browser.waitForPageToLoad("50000");
        browser.type("tinywall_CommonBundle_user_name",DoPartTimeConstant.PROVIDER_REGISTER_FULL_NAME);
        browser.type("tinywall_CommonBundle_user_email",DoPartTimeConstant.PROVIDER_REGISTER_MAIL_ID);
        browser.type("tinywall_CommonBundle_user_password",DoPartTimeConstant.PROVIDER_REGISTER_PASSWORD);
        browser.type("tinywall_CommonBundle_user_mobile",DoPartTimeConstant.PROVIDER_REGISTER_MOBILE);
        //browser.click("tinywall_CommonBundle_user_acceptTerms");        
        browser.click("tinywall_CommonBundle_user_submit");
        browser.waitForPageToLoad("70000");
        System.out.println("providerRegister end.");
        return true;
    }
    boolean fillProviderDetails() throws Exception{
        System.out.println("providerDetails start.");
        browser.waitForPageToLoad("50000");
        browser.type("tinywall_ProviderBundle_company_name",DoPartTimeConstant.PROVIDER_DETAILS_COMPANY_NAME);
        browser.type("tinywall_ProviderBundle_company_description",DoPartTimeConstant.PROVIDER_DETAILS_COMPANY_DESCRIPTION);
        browser.type("tinywall_ProviderBundle_company_website",DoPartTimeConstant.PROVIDER_DETAILS_COMPANY_WEBSITE);
        browser.type("tinywall_ProviderBundle_company_landmark",DoPartTimeConstant.PROVIDER_DETAILS_COMPANY_LANDMARK);
        browser.type("tinywall_ProviderBundle_company_location",DoPartTimeConstant.PROVIDER_DETAILS_COMPANY_LOCATION);
        browser.type("tinywall_ProviderBundle_company_pincode",DoPartTimeConstant.PROVIDER_DETAILS_COMPANY_PINCODE);
        browser.click("tinywall_ProviderBundle_company_submit");
        browser.waitForPageToLoad("70000");
        System.out.println("providerDetails end.");
        return true;
    }
    boolean providerVerification() throws Exception{
        System.out.println("providerVerification start.");
        browser.open(DoPartTimeConstant.BASE_PATH+"/provider/registration_step3_submit/?action=skip");
        browser.waitForPageToLoad("50000");
        System.out.println("providerVerification end.");
        return true;
    }
    boolean providerJobs() throws Exception{
        System.out.println("providerJobs start.");
        //browser.open(DoPartTimeConstant.BASE_PATH+"/provider/job/24/edit");
        browser.open(DoPartTimeConstant.BASE_PATH+"/provider/job/new");
        browser.waitForPageToLoad("50000");
        browser.select("tinywall_ProviderBundle_job_company",DoPartTimeConstant.PROVIDER_JOBS_COMPANY_NAME);
        browser.type("tinywall_ProviderBundle_job_title",DoPartTimeConstant.PROVIDER_JOBS_TITLE);
        browser.type("tinywall_ProviderBundle_job_description",DoPartTimeConstant.PROVIDER_JOBS_DESCRIPTION);
        browser.type("tinywall_ProviderBundle_job_benefits",DoPartTimeConstant.PROVIDER_JOBS_BENEFITS);
        browser.type("tinywall_ProviderBundle_job_eligibility",DoPartTimeConstant.PROVIDER_JOBS_ELIGIBILITY);
        browser.type("tinywall_ProviderBundle_job_openingCount",DoPartTimeConstant.PROVIDER_JOBS_OPENING_COUNT);
        browser.click("tinywall_ProviderBundle_job_gender_0");
        browser.click("tinywall_ProviderBundle_job_jobType_2");
        browser.type("tinywall_ProviderBundle_job_startTime",DoPartTimeConstant.PROVIDER_JOBS_STARTTIME);
        browser.type("tinywall_ProviderBundle_job_endTime",DoPartTimeConstant.PROVIDER_JOBS_ENDTIME);  
        browser.select("tinywall_ProviderBundle_job_salaryPeriod",DoPartTimeConstant.PROVIDER_JOBS_SALARYPERIOD);
        browser.type("tinywall_ProviderBundle_job_startSalary",DoPartTimeConstant.PROVIDER_JOBS_START_SALARY);
        browser.type("tinywall_ProviderBundle_job_endSalary",DoPartTimeConstant.PROVIDER_JOBS_END_SALARY);
        browser.click("tinywall_ProviderBundle_job_day_0");
        browser.type("tinywall_ProviderBundle_job_startDate",DoPartTimeConstant.PROVIDER_JOBS_START_DATE);
        browser.type("tinywall_ProviderBundle_job_endDate",DoPartTimeConstant.PROVIDER_JOBS_END_DATE);
        browser.type("tinywall_ProviderBundle_job_endAge",DoPartTimeConstant.PROVIDER_JOBS_END_AGE);
        browser.type("tinywall_ProviderBundle_job_education",DoPartTimeConstant.PROVIDER_JOBS_EDUCATION);
        browser.type("tinywall_ProviderBundle_job_experience",DoPartTimeConstant.PROVIDER_JOBS_EXPERIENCE);
        browser.type("tinywall_ProviderBundle_job_landmark",DoPartTimeConstant.PROVIDER_JOBS_LANDMARK);
        browser.type("tinywall_ProviderBundle_job_area",DoPartTimeConstant.PROVIDER_JOBS_AREA);
        browser.type("tinywall_ProviderBundle_job_city",DoPartTimeConstant.PROVIDER_JOBS_CITY);
        browser.type("tinywall_ProviderBundle_job_state",DoPartTimeConstant.PROVIDER_JOBS_STATE);
        browser.type("tinywall_ProviderBundle_job_country",DoPartTimeConstant.PROVIDER_JOBS_COUNTRY);
        browser.type("tinywall_ProviderBundle_job_pincode",DoPartTimeConstant.PROVIDER_JOBS_PINCODE);
        browser.type("tinywall_ProviderBundle_job_location",DoPartTimeConstant.PROVIDER_JOBS_LOCATION);
        browser.click("tinywall_ProviderBundle_job_submit");
        browser.waitForPageToLoad("70000");
        System.out.println("providerJobs end.");
        return true;
    }
    
    boolean adminJobApproval() throws Exception{
        System.out.println("adminJobApproval start.");
        browser.open(DoPartTimeConstant.BASE_PATH+"/admin/job/"+DoPartTimeConstant.ADMINJOBAPPROVAL+"/edit/activate");
        /*browser.waitForPageToLoad("50000");
        browser.select("tinywall_AdminBundle_job_status",DoPartTimeConstant.ADMINJOB_STATUS);
        browser.click("tinywall_AdminBundle_job_submit");*/
        browser.waitForPageToLoad("70000");
        System.out.println("providerJobs end.");
        return true;
    }
    
    boolean seekerRegister() throws Exception{
        System.out.println("seekerRegister start.");
        browser.open(DoPartTimeConstant.BASE_PATH+"/register");
        browser.waitForPageToLoad("50000");
        browser.type("tinywall_CommonBundle_user_name",DoPartTimeConstant.SEEKER_REGISTER_FULL_NAME );
        browser.type("tinywall_CommonBundle_user_email",DoPartTimeConstant.SEEKER_REGISTER_MAIL_ID );
        browser.type("tinywall_CommonBundle_user_password",DoPartTimeConstant.SEEKER_REGISTER_PASSWORD);
        browser.type("tinywall_CommonBundle_user_mobile",DoPartTimeConstant.SEEKER_REGISTER_MOBILE);
        //browser.click("tinywall_CommonBundle_user_acceptTerms");        
        browser.click("tinywall_CommonBundle_user_submit");
        browser.waitForPageToLoad("70000");
        System.out.println("seekerRegister end.");
        return true;
    }
    boolean fillPersonalDetails() throws Exception{
        System.out.println("PersonalDetails start.");
        browser.waitForPageToLoad("50000");
        browser.type("tinywall_SeekerBundle_profile_dob",DoPartTimeConstant.SEEKER_PERSONALDETAILS_DOB);
        browser.click("tinywall_SeekerBundle_profile_gender_0");
        browser.type("tinywall_SeekerBundle_profile_location",DoPartTimeConstant.SEEKER_PERSONALDETAILS_LOCATION);
        browser.type("tinywall_SeekerBundle_profile_pincode",DoPartTimeConstant.SEEKER_PERSONALDETAILS_PINCODE);
        browser.click("tinywall_SeekerBundle_profile_submit");
        browser.waitForPageToLoad("70000");
        System.out.println("PersonalDetails end.");
        return true;
    }
    boolean submitProfessionalDetails() throws Exception{
        System.out.println("submitProfessionalDetails start.");
        browser.waitForPageToLoad("50000");
        browser.select("tinywall_SeekerBundle_profile_education",DoPartTimeConstant.SEEKER_PROFESSIONALDETAILS_EDUCATION);
        browser.select("tinywall_SeekerBundle_profile_occupation",DoPartTimeConstant.SEEKER_PROFESSIONALDETAILS_OCCUPATION);
        browser.type("tinywall_SeekerBundle_profile_salaryExpected",DoPartTimeConstant.SEEKER_PROFESSIONALDETAILS_SALARY_EXPECTED);
        browser.type("tinywall_SeekerBundle_profile_userSkillTags",DoPartTimeConstant.SEEKER_PROFESSIONALDETAILS_USERSKILL_TAGS);
        browser.type("tinywall_SeekerBundle_profile_summary",DoPartTimeConstant.SEEKER_PROFESSIONALDETAILS_SUMMARY);
        browser.click("tinywall_SeekerBundle_profile_submit");
        browser.waitForPageToLoad("70000");
        browser.open(DoPartTimeConstant.BASE_PATH+"/seeker/registration_step3_submit/?action=skip");
        browser.waitForPageToLoad("50000");    
        System.out.println("submitProfessionalDetails end.");
        return true;
    }
    //boolean seekerVerification() throws Exception{
     //   System.out.println("seekerVerification start.");
      //  browser.open(DoPartTimeConstant.BASE_PATH+"/seeker/registration_step3_submit/?action=skip");
      //  browser.waitForPageToLoad("50000");
      //  System.out.println("seekerVerification end.");
       // return true;
    //}
    boolean seekerProfile() throws Exception{
        System.out.println("seekerProfile start.");
        browser.open(DoPartTimeConstant.BASE_PATH+"/seeker/profile/edit");
        browser.waitForPageToLoad("50000");
        browser.type("tinywall_SeekerBundle_profile_name",DoPartTimeConstant.SEEKER_PROFILE_FULL_NAME );
        browser.click("tinywall_SeekerBundle_profile_gender_0");
        browser.type("tinywall_SeekerBundle_profile_dob",DoPartTimeConstant.SEEKER_PROFILE_DOB);
        browser.select("tinywall_SeekerBundle_profile_education",DoPartTimeConstant.SEEKER_PROFILE_EDUCATION);
        browser.select("tinywall_SeekerBundle_profile_occupation",DoPartTimeConstant.SEEKER_PROFILE_OCCUPATION);
        browser.type("tinywall_SeekerBundle_profile_salaryExpected",DoPartTimeConstant.SEEKER_PROFILE_SALARY_EXPECTED);
        browser.type("tinywall_SeekerBundle_profile_location",DoPartTimeConstant.SEEKER_PROFILE_LOCATION);
        browser.type("tinywall_SeekerBundle_profile_pincode",DoPartTimeConstant.SEEKER_PROFILE_PINCODE);
        browser.type("tinywall_SeekerBundle_profile_summary",DoPartTimeConstant.SEEKER_PROFILE_SUMMARY);
        browser.type("tinywall_SeekerBundle_profile_userSkillTags",DoPartTimeConstant.SEEKER_PROFILE_USERSKILL_TAGS);        
        browser.click("tinywall_SeekerBundle_profile_submit");
        browser.waitForPageToLoad("70000");
        browser.open(DoPartTimeConstant.BASE_PATH+"/seeker/profile/view");
        browser.waitForPageToLoad("50000");
        System.out.println("seekerProfile end.");
        return true;
    }
    boolean seekerApply() throws Exception{
        System.out.println("seekerApply start.");
        browser.open(DoPartTimeConstant.BASE_PATH+"/view-job/"+DoPartTimeConstant.SEEKER_APPLY_VIEW_JOBS_PAGE);
        browser.waitForPageToLoad("50000");
        browser.click("form_submit");
        browser.waitForPageToLoad("70000");
        System.out.println("seekerApply end.");
        return true;
    }
    boolean providerQuickPostJobs() throws Exception{
        System.out.println("providerQuickPostJobs start.");
        browser.open(DoPartTimeConstant.BASE_PATH+"/post-job");
        browser.waitForPageToLoad("50000");
        browser.type("tinywall_ProviderBundle_jobstemp_jobTitle",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_TITLE);
        browser.type("tinywall_ProviderBundle_jobstemp_jobDescription",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_DESCRIPTION);
        browser.click("tinywall_ProviderBundle_jobstemp_jobType_2");
        browser.type("tinywall_ProviderBundle_jobstemp_openingCount",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_OPENING_COUNT);
        browser.type("tinywall_ProviderBundle_jobstemp_startTime",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_STARTTIME);
        browser.type("tinywall_ProviderBundle_jobstemp_endTime_hour",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_ENDTIME);
        browser.select("tinywall_ProviderBundle_jobstemp_salaryRange",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_SALARYPERIOD);
        browser.type("tinywall_ProviderBundle_jobstemp_startSalary",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_START_SALARY);
        browser.type("tinywall_ProviderBundle_jobstemp_endSalary",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_END_SALARY);
        browser.type("tinywall_ProviderBundle_jobstemp_startDate",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_START_DATE);
        browser.type("tinywall_ProviderBundle_jobstemp_endDate",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_END_DATE);
        browser.type("tinywall_ProviderBundle_jobstemp_jobArea",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_AREA);
        browser.type("tinywall_ProviderBundle_jobstemp_jobCity",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_CITY);
        browser.type("tinywall_ProviderBundle_jobstemp_jobState",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_STATE);
        browser.type("tinywall_ProviderBundle_jobstemp_jobCountry",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_COUNTRY);
        browser.type("tinywall_ProviderBundle_jobstemp_jobLocation",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_LOCATION);
        browser.type("tinywall_ProviderBundle_jobstemp_companyName",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_COMPANY_NAME);
        browser.type("tinywall_ProviderBundle_jobstemp_companyDescription",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_COMPANY_DESCRIPTION);
        browser.type("tinywall_ProviderBundle_jobstemp_companyLocation",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_COMPANY_LOCATION);
        browser.type("tinywall_ProviderBundle_jobstemp_userName",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_FULL_NAME);
        browser.type("tinywall_ProviderBundle_jobstemp_userEmail",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_MAIL_ID);
        browser.type("tinywall_ProviderBundle_jobstemp_userMobile",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_MOBILE);
        browser.type("tinywall_ProviderBundle_jobstemp_password",DoPartTimeConstant.PROVIDER_QUICKPOSTJOBS_PASSWORD);
        browser.click("tinywall_ProviderBundle_jobstemp_submit");
        browser.waitForPageToLoad("70000");
        browser.open(DoPartTimeConstant.BASE_PATH+"/provider/registration_step3_submit/?action=skip");
        browser.waitForPageToLoad("50000"); 
        System.out.println("providerquickPostJobs end.");
        return true;
    }
    boolean adminQuickJobRequest() throws Exception{
        System.out.println("adminQuickJobRequest start.");
        browser.open(DoPartTimeConstant.BASE_PATH+"/admin/jobstemp/new");
        browser.waitForPageToLoad("50000");
        browser.type("tinywall_AdminBundle_jobstemp_jobTitle",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_TITLE);
        browser.type("tinywall_AdminBundle_jobstemp_jobDescription",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_DESCRIPTION);
        browser.type("tinywall_AdminBundle_jobstemp_companyName",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_COMPANY_NAME);
        browser.type("tinywall_AdminBundle_jobstemp_companyDescription",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_COMPANY_DESCRIPTION);
        browser.type("tinywall_AdminBundle_jobstemp_companyLocation",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_COMPANY_LOCATION);
        browser.type("tinywall_AdminBundle_jobstemp_companyPincode",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_COMPANY_PINCODE);
        browser.type("tinywall_AdminBundle_jobstemp_userEmail",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_USER_MAIL_ID);
        browser.type("tinywall_AdminBundle_jobstemp_userName",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_USER_FULL_NAME);
        browser.type("tinywall_AdminBundle_jobstemp_userMobile",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_USER_MOBILE);
        browser.click("tinywall_AdminBundle_jobstemp_jobType_2");
        browser.type("tinywall_AdminBundle_jobstemp_startTime_hour",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_STARTTIME);
        browser.type("tinywall_AdminBundle_jobstemp_endTime_hour",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_ENDTIME);
        browser.type("tinywall_AdminBundle_jobstemp_startSalary",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_START_SALARY);
        browser.type("tinywall_AdminBundle_jobstemp_endSalary",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_END_SALARY);
        browser.select("tinywall_AdminBundle_jobstemp_salaryRange",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_SALARYPERIOD);
        browser.type("tinywall_AdminBundle_jobstemp_openingCount",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_OPENING_COUNT);
        browser.type("tinywall_AdminBundle_jobstemp_companyLatitude",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_COMPANY_LATITUDE);
        browser.type("tinywall_AdminBundle_jobstemp_companyLongitude",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_COMPANY_LONGITUDE);
        browser.type("tinywall_AdminBundle_jobstemp_jobLatitude",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_LATITUDE);
        browser.type("tinywall_AdminBundle_jobstemp_jobLongitude",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_LONGITUDE);
        browser.type("tinywall_AdminBundle_jobstemp_jobCity",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_CITY);
        browser.type("tinywall_AdminBundle_jobstemp_jobArea",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_AREA);
        browser.type("tinywall_AdminBundle_jobstemp_jobState",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_STATE);
        browser.type("tinywall_AdminBundle_jobstemp_jobCountry",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_COUNTRY);
        browser.type("tinywall_AdminBundle_jobstemp_startDate",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_START_DAY);
        browser.type("tinywall_AdminBundle_jobstemp_endDate",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_END_DATE);
        browser.select("tinywall_AdminBundle_jobstemp_status",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_STATUS);
        browser.type("tinywall_AdminBundle_jobstemp_sourceUrl",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_SOURCE_URL);
        browser.type("tinywall_AdminBundle_jobstemp_benefits",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_BENEFITS);
        browser.click("tinywall_AdminBundle_jobstemp_education_0");
        browser.type("tinywall_AdminBundle_jobstemp_eligibility",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_ELIGIBILITY);
        browser.click("tinywall_AdminBundle_jobstemp_gender_0");
        browser.type("tinywall_AdminBundle_jobstemp_dob",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_DOB);
        browser.type("tinywall_AdminBundle_jobstemp_address",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_ADDRESS);
        browser.type("tinywall_AdminBundle_jobstemp_pincode",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_COMPANY_PINCODE);
        browser.type("tinywall_AdminBundle_jobstemp_endAge",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_COMPANY_END_AGE);
        browser.select("tinywall_AdminBundle_jobstemp_experience",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_EXPERIENCE);   
        browser.type("tinywall_AdminBundle_jobstemp_adminNotes",DoPartTimeConstant.ADMIN_QUICKJOBREQUEST_JOB_ADMIN_NOTES);
        browser.click("tinywall_AdminBundle_jobstemp_submit");
        browser.waitForPageToLoad("70000");
        System.out.println("adminQuickJobRequest end.");
        return true;
    }
    
}