package Test_NG_Frame_Work_1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearnAnnotations {
  @Test
  public void enableAndAlwaysRunMehod() {
  System.out.println("enableAndAlwaysRunMehod");
  }
  
//  @Test
//  public void f1() {
//  System.out.println("@Test_1");
//  }

  @BeforeMethod
  public void beforeMethod() {
  System.out.println("@BeforeMethod");
  }
  
//  @BeforeMethod
//  public void beforeMethod1() {
//  System.out.println("@BeforeMethod_1");
//  }

  @AfterMethod
  public void afterMethod() {
  System.out.println("@AfterMethod");
  }
  
//  @AfterMethod
//  public void afterMethod1() {
//  System.out.println("@AfterMethod_1");
//  }

  @BeforeClass
  public void beforeClass() {
  System.out.println("@BeforeClass");
  }

//  @BeforeClass
//  public void beforeClass1() {
//  System.out.println("@BeforeClass_1");
//  }
  
  @AfterClass
  public void afterClass() {
  System.out.println("@AferClass");
  }
  
//  @AfterClass
//  public void afterClass1() {
//  System.out.println("@AferClass_1");
//  }


  @BeforeTest
  public void beforeTest() {
  System.out.println("@BeforeTest");
  }
  

  @BeforeTest
  public void beforeTest1() {
  System.out.println("@BeforeTest_1");
  }

  @AfterTest
  public void afterTest() {
  System.out.println("@AfterTest");
  }
  
  @AfterTest
  public void afterTest1() {
  System.out.println("@AfterTest_1");
  }

  @BeforeSuite
  public void beforeSuite() {
  System.out.println("@BEforeSuite");
  }
  
//  @BeforeSuite
//  public void beforeSuite1() {
//  System.out.println("@BEforeSuite_1");
//  }

  @AfterSuite
  public void afterSuite() {
  System.out.println("@AfterSuite");
  }
  
//  @AfterSuite
//  public void afterSuite1() {
//  System.out.println("@AfterSuite_1");
//  }

}
