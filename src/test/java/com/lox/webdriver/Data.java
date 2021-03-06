package com.lox.webdriver;

public class Data {

    public static final String BASE_URL                     = "http://sl-dev-intersect-01.dev.test";
    public static final String NOW                          = "_" + System.currentTimeMillis();
    public static final int DEFAULT_WAIT_SECONDS            = 3;

    //Browser
    public static final String BROWSER_MOZILLA              = "Mozilla";
    public static final String BROWSER_IE                   = "IE";
    public static final String BROWSER_CHROME               = "Chrome";
    public static final String BROWSER_HTML_UNIT            = "HtmlUnit";

    //User
    public static final String TEST_USER_NAME              = "testuser";
    public static final String TEST_USER_PASSWORD          = "testuser";
    public static final String TEST_USER_FULL_NAME         = "Test User";
    public static final String TEST_USER_EMAIL             = "testuser@test.com";

    public static final String TEST_USER1_NAME              = "testuser1" + NOW;
    public static final String TEST_USER1_PASSWORD          = "testuser1" + NOW;
    public static final String TEST_USER1_FULL_NAME         = "Test User1" + NOW;
    public static final String TEST_USER1_EMAIL             = "testuser1"+ NOW +"@test.com";

    public static final String TEST_ADMIN_USER_NAME         = "sysadmin";
    public static final String TEST_ADMIN_USER_PASSWORD     = "sysadmin";
    public static final String TEST_ADMIN_USER_FULL_NAME    = "sysadmin";
    public static final String TEST_ADMIN_USER_EMAIL        = "testadminuser@test.com";

    //Org
    public static final String TEST_ORG1                    = "TestOrg1";
    public static final String TEST_ORG1_DESCRIPTION        = "TestOrg1 Description";

    //Group
    public static final String TEST_GROUP1                  = "TestGroup1";
    public static final String TEST_GROUP1_DESCRIPTION      = "TestGroup1 Description";

    //Dataset
    public static final String TEST_DATASET1                = "TestDataset1" + NOW;
    public static final String TEST_DATASET1_DESCRIPTION    = "TestDataset1 Description";
    public static final String TEST_DATASET1_TAGS          = "tag1";


    //License
    public static final String LICENSE_OTHER                = "Other (Open)";
}
