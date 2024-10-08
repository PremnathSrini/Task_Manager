package classes;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	private List<Task> tasks = new ArrayList<>();
	private int nextId=1;
	
	public void addTask(String description)
	{
		Task task = new Task(nextId++,description,"Pending");
		tasks.add(task);
	}
	
	public void updateTask(int id,String newDescription,String newStatus)
	{
		for(Task task : tasks)
		{
			if(task.getId() == id)
			{
				task.setDescription(newDescription);
				task.setStatus(newStatus);
				break;
			}
		}
	}
	
	public void deleteTask(int id)
	{
		tasks.removeIf(task -> task.getId()==id);
	}
	
	public void listTasks()
	{
		for(Task task : tasks)
		{
			System.out.println(task.getId()+ " " + task.getDescription() + " [ " + task.getStatus()+" ] ");
		}
	}
}
