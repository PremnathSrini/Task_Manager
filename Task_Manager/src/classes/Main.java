package classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskManager tm = new TaskManager();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Add Task");
			System.out.println("2. Update Task");
			System.out.println("3. Delete Task");
			System.out.println("4. List Tasks");
			System.out.println("5. Exit");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter task Description");
				String description = sc.nextLine();
				tm.addTask(description);
				break;
			case 2:
				System.out.println("Enter the task ID to update");
				int idToUpdate = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the task Description");
				String newDescription = sc.nextLine();
				System.out.println("Enter the task status");
				String newStatus = sc.nextLine();
				tm.updateTask(idToUpdate, newDescription,newStatus);
				break;
			case 3:
				System.out.println("Enter the task ID to delete");
				int idTodelete = sc.nextInt();
				tm.deleteTask(idTodelete);
				break;
			case 4:
				tm.listTasks();
				break;
			case 5:
				System.exit(0);
			}
			//sc.close();
		}
	}
}
