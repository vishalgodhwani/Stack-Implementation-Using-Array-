package main;
import java.util.Scanner;

import stack_methods.Stack;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Stack");
		int size = sc.nextInt();
		Stack s = new Stack(size);
		s.push(15);
		s.push(20);
		s.push(35);
		s.push(40);
		s.push(50);
		System.out.println(s.search(20));
	}
}
