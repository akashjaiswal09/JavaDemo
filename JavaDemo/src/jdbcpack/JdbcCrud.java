package jdbcpack;

import java.util.Scanner;

public class JdbcCrud {

	public static void main(String[] args) {
		Employee e=new Employee();
		Scanner scr = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 for insert\n"
					+ "2 for select\n"
					+ "3 for update\n"
					+ "4 for delete");
			int opt=scr.nextInt();
			
			switch(opt) {
			case 1:
				System.out.println("Enter Employee Id");
				int empid=scr.nextInt();
				System.out.println("Enter Employee Name");
				String empname=scr.next();
				System.out.println("Enter Employee Salary");
				int salary=scr.nextInt();
				System.out.println("Enter Employee City");
				String city=scr.next();
				
				e.setEmpid(empid);
				e.setEmpname(empname);
				e.setSalary(salary);
				e.setCity(city);
				
				new JdbcCrudDemo().addEmployee(e);
				break;
			
			case 2:
				new JdbcCrudDemo().fetchEmployee();
				break;
			
			case 3:
				System.out.println("Enter Employee Id");
				int newempid=scr.nextInt();
				System.out.println("Enter Employee Name");
				String newempname=scr.next();
				System.out.println("Enter Employee Salary");
				int newsalary=scr.nextInt();
				System.out.println("Enter Employee City");
				String newcity=scr.next();
				
				e.setEmpid(newempid);
				e.setEmpname(newempname);
				e.setSalary(newsalary);
				e.setCity(newcity);
				
				new JdbcCrudDemo().updateEmployee(e);
				break;
				
			case 4:
				System.out.println("Enter Employee Id");
				int empid1=scr.nextInt();
				e.setEmpid(empid1);
				new JdbcCrudDemo().deleteEmployee(e);
				break;
			default:
				System.out.println("Insert between 1 to 4");
				
			}

		}
		
	}

}
