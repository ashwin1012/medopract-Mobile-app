package tests;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import genericPages.CommonMethod;
import pages.LoginPage;
import pages.ToDoListPage;

public class ToDoListTest extends CommonMethod{
	
public ToDoListTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

Logger log = LogManager.getLogger(ToDoListTest.class.getName());
	
	@BeforeClass
	public void openAndroidApk() throws Exception {
		test=reports.startTest("Open Android Apk");
		initializeDriver();
		log.info("Opened Android Apk File");
		
		LoginPage l = new LoginPage();
		Thread.sleep(3000);
		l.enterUserName();
		log.info("Entered Username");
		l.enterPassword();
		log.info("Entered Password");
		l.clickSubmit();
		log.info("Clicked Submit Button");

		String actual = null;

		if (l.getWebElement("homePage").isDisplayed()) {
			actual = "success";
			log.info("HomePage is Displayed");
		} else {
			actual = "failure";
			log.info("HomePage is not Displayed");
		}

		Assert.assertTrue(actual.equals("success"));
		log.info("Assertion Passed");
	}
	
	@Test(priority=1)
	public void addTaskWithDueDate() throws Exception {
		test=reports.startTest("TC001 Add Task with Due Date");
		ToDoListPage td=new ToDoListPage();
		Thread.sleep(3000);
		td.clickManagaTask();
		log.info("Clicked Manage Task");
		td.addTaskPlusBtn();
		log.info("Clicked Task Plus Btn");
		td.addTaskName();
		log.info("Entered Task name");
		td.DueDateClick();
		log.info("Clicked Due Date Btn");
		td.dueDateOKButton();
		log.info("Clicked Due Date OK Btn");
		td.ClickAddTaskButton();
		log.info("Clicked Add Task Btn");
	}
	
	@Test(priority = 2)
	public void addTaskWithoutDueDate() throws Exception {
		test=reports.startTest("TC001 Add Task without Due Date");
		ToDoListPage td=new ToDoListPage();
		Thread.sleep(3000);
		td.addTaskPlusBtn();
		log.info("Clicked Task Plus Btn");
		td.addTaskName();
		log.info("Entered Task name");
		td.ClickAddTaskButton();
		log.info("Clicked Add Task Btn");
	}

	@Test(priority=3)
	public void addTaskWithoutTaskDetails() throws Exception{
		test=reports.startTest("TC003 Add Task without Task Details");
		ToDoListPage td=new ToDoListPage();
		td.addTaskPlusBtn();
		log.info("Clicked Task Plus Btn");
		td.ClickAddTaskButton();
		log.info("Clicked Add Task Btn");
	}
	
	@Test(priority=4)
	public void clickCompletedTask() throws Exception {
		test=reports.startTest("TC004 Click Completed Task");
		ToDoListPage td=new ToDoListPage();
		td.ClickViewCompletedTask();
		log.info("Clicked View Completed Task Btn");
	}
	
	@Test(priority=5)
	public void clickOpenTaskCompleteBtn() throws Exception {
		test=reports.startTest("TC004 Click Open Task Complete Button");
		ToDoListPage td=new ToDoListPage();
		td.ClickOpenTask();
		log.info("Clicked View Open Task Btn");
		td.ClickCompleteButton();
		log.info("Click Open Task Complete Btn");
	}
	
	@Test(priority=6)
	public void clickOpenTaskDeleteBtn() throws Exception {
		test=reports.startTest("TC006 Click Open Task Delete Btn");
		ToDoListPage td=new ToDoListPage();
		td.ClickDeleteButton();
		log.info("Clicked Delete Btn");
		td.ClickDeleteYesButton();
		log.info("Clicked Delete Yes Btn");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}

}
