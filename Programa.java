import java.io.*;
import java.util.*;
public class Programa {
	public static void main(String[] args) {
		
		Student[] data = new Student[10];
		
		enterData(data);
		
	}
	
	
	public static void enterData(Student[] list) {
		Scanner sc = new Scanner(System.in);
		int cui, year, month, day;
		String email, name, lnamef, lnamem, gender; //birthdate
		boolean status;
		
		for(int i=0;i<list.length;i++) {
			System.out.println("Ingresar cui: ");
			cui = sc.nextInt();
			System.out.println("Ingresar email: ");
			email = sc.next();
			System.out.println("Ingresar nombres: ");
			name = sc.next();
			System.out.println("Ingresar apellido paterno: ");
			lnamef = sc.next();
			System.out.println("Ingresar apellido materno: ");
			lnamem = sc.next();
			System.out.println("ingresar año de nacimiento: ");
			year = sc.nextInt();
			System.out.println("Ingresar mes de nacimiento: ");
			month = sc.nextInt();
			System.out.println("Ingresar dia de nacimiento: ");
			day = sc.nextInt();
			
			//System.out.print("Ingresar la fecha de nacimiento:  ");
			//birthdate = sc.next();
			2005/94
			
			System.out.println("Ingresar genero: ");
			gender = sc.next();
			System.out.println("Ingresar estado");
			status = sc.nextBoolean();
		}
	}
	public static void showData(Student[] list) {
		
	}
	public static void sortbyCui(Student[] list) {
		
	}
	public static void sortbyEmail(Student[] list) {
		
	}
	public static void sortbyName(Student[] list) {
		
	}
	public static void sortbyLnamef(Student[] list) {
		
	}
	public static void sortbyLnamem(Student[] list) {
		
	}
	public static void sortbyBirthdate(Student[] list) {
		
	}
	public static void sortbyGender(Student[] list) {
		
	}
	public static void sortbyStatus(Student[] list) {
		
	}	
	
	
}

