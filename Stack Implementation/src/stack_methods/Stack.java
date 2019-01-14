package stack_methods;

public class Stack {
	int top;
	int stack_size;
	int stack[];
	public Stack(int size){
		top=0;
		stack_size=size;
		stack = new int[stack_size];
	}
	public boolean empty() {
		if(stack.length==0){
			return true;
		}
		else {
			return false;
		}
	}
	public int push(int a) {
		if(top==stack_size) {
			System.out.println("Stack is full");
		}
		else {
			stack[top++]=a;
		}
		return a;
	}
	public int pop() {
		int pop_element=0;
		if(top==0) {
			System.out.println("Stack is empty");
			return -1;
		}
		else {
			pop_element=stack[--top];
		}
		return pop_element;
	}
	public int peek() {
		int top_element ;
		top_element = stack[top-1];
		return top_element;
	}
	public int search(int element) {
		for(int i=0;i<stack.length;i++) {
			if(stack[i]==element) {
				return top-i;
			}
		}
		return -1;
	}
}
