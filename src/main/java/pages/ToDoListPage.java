package pages;

import genericPages.CommonMethod;

public class ToDoListPage extends CommonMethod{

	public ToDoListPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void clickManagaTask() throws Exception {
		click("taskListPageClick");
	}
	
	public void clickTaskListPage() throws Exception {
		click("taskListPageClick");
	}
	
	public void addTaskPlusBtn() throws Exception {
		click("addTaskPlusBtn");
	}
	
	public void addTaskName() throws Exception {
		enterData("addTaskName", "TaskName");
	}
	
	public void DueDateClick() throws Exception {
		click("DueDateClick");
	}
	
	public void dueDateOKButton() throws Exception {
		click("dueDateOKButton");
	}
	
	public void addTaskCancelBtn() throws Exception {
		click("addTaskCancelBtn");
	}
	
	public void ClickAddTaskButton() throws Exception {
		click("addTaskButton");
	}
	
	public void ClickCompleteButton() throws Exception {
		click("ClickCompleteButton");
	}
	
	public void ClickDeleteButton() throws Exception {
		click("ClickDeleteButton");
	}
	
	public void ClickDeleteYesButton() throws Exception {
		click("ClickDeleteYesBtn");
	}
	
	public void ClickViewCompletedTask() throws Exception {
		click("ClickViewCompletedTask");
	}
	
	public void ClickOpenTask() throws Exception {
		click("ClickOpenTask");
	}
	
	

}
