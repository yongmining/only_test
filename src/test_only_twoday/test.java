package test_only_twoday;

import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		employeeDTO employee1 = new employeeDTO();
		System.out.println("적어주세용");
		
		employee1.setNumber(sc.nextInt());
		sc.nextLine();
		employee1.setName(sc.nextLine());
		System.out.println("적어주세용");
		employee1.setDept(sc.nextLine());
		System.out.println("적어주세용");
		employee1.setJob(sc.nextLine());
		System.out.println("적어주세용");
		employee1.setAge(sc.nextInt());
		System.out.println("적어주세용");
		employee1.setGender(sc.next().charAt(0));
		System.out.println("적어주세용");
		employee1.setSalary(sc.nextInt());
		System.out.println("적어주세용");
		employee1.setBonusPoint(sc.nextDouble());
		System.out.println("적어주세용");
		sc.nextLine();
		employee1.setPhone(sc.nextLine());
		System.out.println("적어주세용");
		employee1.setAddress(sc.nextLine());

		System.out.println(employee1.getNumber());
		System.out.println(employee1.getName());
		System.out.println(employee1.getDept());
		System.out.println(employee1.getJob());
		System.out.println(employee1.getAge());
		System.out.println(employee1.getGender());
		System.out.println(employee1.getSalary());
		System.out.println(employee1.getBonusPoint());
		System.out.println(employee1.getPhone());
		System.out.println(employee1.getAddress());

	}


}

