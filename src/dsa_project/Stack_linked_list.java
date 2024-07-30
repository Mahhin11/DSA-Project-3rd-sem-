package DSA_Project;

import java.util.*;
public class Stack_linked_list {
     static Scanner sc = new Scanner(System.in);


    static class Node {
        int info;
        Node next;

        Node(int info) {
            this.info = info;
            this.next = null;
        }
      
    }
     static Node top = null;
    Stack_linked_list(){
           while (true) {
       System.out.println("Which type of Operation you want to perform in Stack (SLL) : \nPress 1 for Push \nPress 2 for Pop \nPress 3 for Display \npress 4 for Exit");
		
		System.out.println("Enter your choice");
		 int choice = sc.nextInt();
                 switch(choice) {
		case 1:
			System.out.println("Enter the item value you went to insert: ");
			int item = sc.nextInt();
			push(item);
			break;
		case 2:
			pop();
			break;
                        
                case 3:
                       System.out.println("The elemets in the stack are  ");
                       display();
                       break;
                case 4:{
                                     System.out.println("\nExit Succesfully......\n");}
                                     return;
                 default:{
                           System.out.println("Please Select a valid number from the menu...");
                           return;}
                 
		}
           }
    }
	/**************************************************************/			
/******************** Stack Insertion ****************/		
/**************************************************************/		

	static void push(int item) {
		Node ptr = new Node(item);
		ptr.info = item;
		ptr.next = top;
		top = ptr;
	}
        
        
    /**************************************************************/			
/******************** Stack deletion ****************/		
/**************************************************************/		

	static void pop() {
		if(top==null) {
			System.out.println("Stack is Empty.");
			return;
		}
		top = top.next;
		System.out.println("Item Deleted Successfully!");
	}
        
        	static void display() {
		Node ptr = top;
		while(ptr!=null) {
			System.out.println(ptr.info);
			ptr = ptr.next;
		}
	}
}
    
		
	
          
   
           
           
           
           
           
           
           
    

    
    
    
    
    
    
    


class stack_dll {
    static Scanner sc = new Scanner(System.in);

    static   class Node {
        int info;
        Node next;
        Node prev;

        Node(int info) {
            this.info = info;
            this.next = null;
            this.prev=null;
        }
     
    }
      
         static Node top = null;
     
     stack_dll(){
       
            while (true) {
                 System.out.println("Which type of Operation you want to perform in Stack (SLL) : \nPress 1 for Push \nPress 2 for Pop  \nPress 3 for Display \npress 4 for Exit");
                 System.out.println("Enter your choice");
		 int choice = sc.nextInt();
                 switch(choice) {
		case 1:
			System.out.println("Enter the item value you went to insert: ");
			int item = sc.nextInt();
			push_dll(item);
			break;
		case 2:
			pop_dll();
			break;
                case 3:
                       System.out.println("The elemets in the stack are  ");
                       display_dll();
                       break;
                case 4:{
                                     System.out.println("\nExit Succesfully......\n");}
                                     return;
                 default:{
                           System.out.println("Please Select a valid number from the menu...");
                           return;}
    
                        }
                    }
     }
     

/**************************************************************/			
/******************** Stack Insertion ****************/		
/**************************************************************/		

	static void push_dll(int item) {
		Node ptr = new Node(item);
		ptr.info = item;
		ptr.next = top;
		ptr.prev = null;
		if(top!=null)
			top.prev = ptr;
		top = ptr;
	}
	
/**************************************************************/			
/******************** Stack deletion ****************/		
/**************************************************************/		

	static void pop_dll() {
		if(top==null) {
			System.out.println("Stack is Empty.");
			return;
		}
		top = top.next;
		if(top!=null)
			top.prev = null;
		System.out.println("Item Deleted Successfully!");
	}
	
/**************************************************************/			
/******************** Stack Display ****************/		
/**************************************************************/		

	static void display_dll() {
		Node ptr = top;
		while(ptr!=null) {
			System.out.println(ptr.info);
			ptr = ptr.next;
		}
	}
}