package DSA_Project;

import java.util.Scanner;


public class Queue_Linked_list {
    static Scanner sc = new Scanner(System.in);
     static class Node {
        int info;
        Node next;
       

        Node(int info) {
            this.info = info;
            this.next = null;
            
        }
     
    }
         static Node F = null;
         static Node R = null;
    
    Queue_Linked_list(){
                 while (true) {
            System.out.println("Which type of Operation you want to operate in Queue (SLL) : \nPress 1 for Insertion \nPress 2 for Deletion \nPress 3 for Display\npress 4 for Exit");
            int choiceQ = sc.nextInt();
				switch(choiceQ) {
				case 1:
					System.out.println("Enter the Item you went to insert: ");
					int item  = sc.nextInt();
					EnQueue_sll(item);
					break;
				case 2:
					DQueue_sll();
                                                  
					break;
					case 3:
					Display_sll();
					break;
                                        
                                 case 4:{
                                     System.out.println("\nExit Successfully......\n");
                                     return;}
                                default: {
                                    System.out.println("Please Select a valid number from the menu...");
                                    return;
				}
			}
    }
    }
    
       static void Display_sll(){
      if(F==null) {
				System.out.println("queue  is Empty.");
				return;
			}
			Node ptr = F;
			while(ptr!=null) {
				System.out.print(ptr.info +"\n");
				ptr = ptr.next;
			}
		}
		     
       
           
   static void EnQueue_sll(int item){
        Node ptr=new Node(item);
        ptr.info=item;
        ptr.next=null;
        if(R==null){
            R=ptr;F=ptr;}
        else 
        R.next=ptr;
        R=ptr;
        
        
    }
   
  static void DQueue_sll(){
      if (F==null){
          System.out.println("queue  is Empty.");
				return;}
      Node ptr=F;
      if(F.next==null){
          F=null;R=null;}
      else 
          F=F.next;
      System.out.println("Item Deleted succesfully\n Use Display too see the Queue");
  }
                  
                  
      
      
          
      
      
       
        
    }
    
    

class Queue_Double1 {
    
static Scanner sc = new Scanner(System.in);
     static class Node {
        int info;
        Node next;
        Node prev;

        Node(int info) {
            this.info = info;
            this.next = null;
            this.prev=null;
        }
     
    }
         static Node F = null;
         static Node R = null;
    
    Queue_Double1(){
                while (true) {
            System.out.println("Which type of Operation you want to operate in Queue (DLL) : \nPress 1 for Insertion \nPress 2 for Deletion \nPress 3 For Display \nPress 4 For Exit");
            int choiceQ = sc.nextInt();
				switch(choiceQ) {
				case 1:
					System.out.println("Enter the Item you went to insert: ");
					int item  = sc.nextInt();
					EnQueue_dll(item);
					break;
				case 2:
					DQueue_dll();
                                              
					break;
				case 3:
					Display_dll();
					break;
                                        
                                 case 4:{
                                     System.out.println("\nExit Successfully......\n");}
                                     return;
                                default: {
                                    System.out.println("Please Select a valid number from the menu...");
                                    return;
				}
                               
                                
			}
    
                }
    }

           static void Display_dll(){
      if(F==null) {
				System.out.println("queue  is Empty.");
				return;
			}
			Node ptr = F;
			while(ptr!=null) {
				System.out.print(ptr.info +"\n");
				ptr = ptr.next;
			}
		}
		     
       
           
   static void EnQueue_dll(int item){
        Node ptr=new Node(item);
        ptr.info=item;
        ptr.next=null;
        ptr.prev=R;
        if(R==null){
            R=ptr;F=ptr;}
        else 
        R.next=ptr;
        R=ptr;
        
        
    }
   
  static void DQueue_dll(){
      if (F==null){
          System.out.println("queue  is Empty.");
				return;}
      Node ptr=F;
      if(F.next==null){
          F=null;R=null;}
      else 
          F=F.next;
          F.prev=null;
              System.out.println("Item Deleted succesfully\n Use Display too see the Queue");

      
  }
   

    
    
}