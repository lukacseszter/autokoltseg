/*
* File: App.java
* Author: Lukács Eszter
* Copyright: 2022, Lukács Eszter
* Group: Szoft I N
* Date: 2022-02-22
* Github: https://github.com/lukacseszter/
* Licenc: GNU GPL
*/

import java.util.Scanner;
class App {
public static void main (String[] args) {
System.out.println("Lukacs Eszter, 2022-02-22");
Scanner sc = new Scanner(System.in);

	System.out.print("Ado: ");
	int a = sc.nextInt();

System.out.println("");

	System.out.print("Garazs: ");
	int b = sc.nextInt();

System.out.println("");

	System.out.print("Javitasi koltseg: ");
	int c = sc.nextInt();

System.out.println("");

	System.out.print("Benzin: ");
	int d = sc.nextInt();

System.out.println("");

	System.out.print("Megtett km: ");
	int e = sc.nextInt();
	
System.out.println("");

System.out.print("Koltseg: ");
System.out.print(a + b + c + d / e);	

	
	
}	
}
