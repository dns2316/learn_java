package patch;

import java.util.Scanner;

/**
 * Created by DNS2316 on 08.06.2016.
 */
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Какой объект создать Earth, Sun, Moon?    ");
		String name = sc.next();
		if (name == "Earth"){
			Earth earth = new Earth();
		}
		if (name == "Sun"){
			Sun sun = new Sun();
		}
		if (name == "Moon"){
			Moon moon = new Moon();
		}
	}

}
