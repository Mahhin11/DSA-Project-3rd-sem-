package DSA_Project;

import java.util.Scanner;

public class Double_LinkedList {

    static Scanner sc = new Scanner(System.in);
    static int choice;
    static int count = 0;

    static class Node {
        int info;
        Node next;
        Node prev;
        

        Node(int info) {
            this.info = info;
            this.next = null;
            this.prev = null;
        }
    }
    

    static Node start = null;
    static Node tail = null;

     Double_LinkedList() {
        while (true) {
            System.out.println("Which type of Operation you want to operate in Double Linked List: \n1: Traverse \n2: Insertion \n3: Deletion \n4: Exit");
            int menuSelect = sc.nextInt();

            switch (menuSelect) {
                case 1:
                    traverse_dll();
                    break;
                case 2:
                    handleInsertionMenu();
                    break;
                case 3:
                    handleDeletionMenu();
                    break;
                case 4:
                    System.out.println("Exit Successfully....");
                    return;
                default:
                    System.out.println("Please enter a valid number from the menu");
                    break;
            }
        }
    }

    void handleInsertionMenu() {
 System.out.println("Which Type of Insertion you want to Operate in LinkedList: \n1: Insertion at First \n2: Insertion at Middle \n3: Insertion at Last \n4: Insertion in DLL Asscending \n5: Insertion in DLL Descending \n6: Exit");
        int insertionSelect = sc.nextInt();
        int item;

        switch (insertionSelect) {
            case 1:
                System.out.println("Enter the item you went to insert: ");
		  item = sc.nextInt(); 
                Insertion_AtFirst_DLL( item);
                break;
            case 2:
                handleMiddleInsertionMenu();
                break;
            case 3:
                   System.out.println("Enter the item you went to insert: ");
		 item = sc.nextInt(); 
                Insertion_at_last_DLL(item);
                break;
            case 4:
                    System.out.println("Enter the item you went to insert: ");
		 item = sc.nextInt(); 
                 Insertion_InSortedList_Ascending_DLL(item);
                 break;
            case 5:
                    System.out.println("Enter the item you went to insert: ");
		 item = sc.nextInt(); 
                     Insertion_InSortedList_Descending_DLL(item);
                     break;
         
            case 6:
                System.out.println("Exit Successfully....");
                return;
            default:
                System.out.println("Please Select a valid number from the menu");
                break;
        }
    }

    void handleMiddleInsertionMenu() {
        System.out.println("In DLL middle where You want to Insert: \n1: Insertion Before Given Node(BGN) \n2: Insertion After Given Node(AGN) \n3: Insertion Before Exact Middle Node (BMID_N) \n4: Insertion After Exact Middle Node (AMID_N) \n5: Exit");
        int midSelect = sc.nextInt();
        int item;int SItem;

        switch (midSelect) {
            case 1:
                System.out.println("Enter the item you went to insert: ");
		 item = sc.nextInt();  
                System.out.println("Enter the item before which you want to insert  ");
                 SItem = sc.nextInt();
                Insertion_inmid_BGN_DLL11(SItem,item);
                break;
            case 2:
                System.out.println("Enter the item you went to insert: ");
		item = sc.nextInt(); 
                System.out.println("Enter the item After  which you want to insert  ");
                SItem = sc.nextInt();
                Insertion_inmid_AGN_DLL(SItem,item);
                break;
            case 3:
                System.out.println("Enter the item you went to insert: ");
		item = sc.nextInt();
                
                Insertion_inmid_B_MIDN_DLL112(item);
                break;
            case 4:
                System.out.println("Enter the item you went to insert: ");
		item = sc.nextInt();
               Insertion_inmid_A_MIDN_DLL1(item);
                break;
            case 5:
                System.out.println("Exit Successfully....");
                break;
            default:
                System.out.println("Please Select a valid number from the menu");
                break;
        }
    } 
    
    
     void handleDeletionMenu() {
        System.out.println("Which type of Deletion you want IN DLL: \n1: Deletion from first \n2: Deletion from last \n3: Deletion from Exact Middle \n4: Deletion from Given Item value \n5: Exit");
        int deleteSelect = sc.nextInt();

        switch (deleteSelect) {
            case 1:
                Deletion_from_first_DLL();
                break;
            case 2:
                Deletion_from_Last_DLL();
                break;
            case 3:
                Deletion_Exact_mid_DLL();
                break;
            case 4:
                int item1 = 5;
                Deletion_inmid_Givenitem_DLL(item1);
                break;
            case 5:
                System.out.println("Exit Successfully....");
                return;
            default:
                System.out.println("Selected Number is not valid. Please Select from the menu");
                break;
        }
     }

    static void traverse_dll() {
        Node ptr = start;

        if (start == null)
            System.out.println("Linkedlist doesn't exist");
        else {
            while (ptr != null) {
                System.out.println(ptr.info + " ");
                ptr = ptr.next;
            }
        }
    }

static void Insertion_AtFirst_DLL(int item) {
					Node ptr = new Node(item);
					ptr.info = item;
					ptr.next = start;
					ptr.prev = null;
					start = ptr;
				}

    static void Insertion_at_last_DLL(int item) {
       Node ptr = new Node(item);
					ptr.info = item;
					ptr.next = null;
					
					if(start==null) {
						ptr.prev = null;
						start = ptr;
						return;
					}
					
					Node ptr1 = start;
					while(ptr1.next!=null) {
						ptr1 = ptr1.next;
					}
					ptr1.next = ptr;
					ptr.prev = ptr1;
				}

     void Insertion_inmid_BGN_DLL (int SItem,int item) {
        
                                      			Node ptr = start;
					while((ptr!=null) && (ptr.info!=SItem))
						ptr = ptr.next;
					if(ptr==null) {
						System.out.println("Required item not found.");
						return;
					}
					Node ptr1 = new Node(item);
					ptr1.info = item;
					ptr1.next = ptr;
					ptr1.prev = ptr.prev;
					ptr.prev = ptr1;
					if(ptr1.prev==null) 
			        	start = ptr1;
					else
						ptr1.prev.next = ptr1;
					
				}

     void Insertion_inmid_AGN_DLL(int SItem,int item) {
                                        Node ptr = start;
					while((ptr!=null) && (ptr.info!=SItem))
						ptr = ptr.next;
					if(ptr==null) {
						System.out.println("Required item not found.");
						return;
					}
					Node ptr1 = new Node(item);
					ptr1.info = item;
					
					ptr1.next = ptr.next;
					if(ptr.next!=null)
						ptr.next.prev = ptr1;
					ptr1.prev = ptr;
					ptr.next = ptr1;
				}
    
       void  Insertion_inmid_B_MIDN_DLL(int item){
                                       int count = 0;
					Node ptr1 = start;
					while(ptr1!=null) {
						count = count+1;
						ptr1 = ptr1.next;
					}
					int mid = (count/2)+1;
					Node ptr = new Node(item);
					ptr.info = item;
					
					if(count==0) {
						ptr.next = null;
						ptr.prev = null;
						start = ptr;
						return;
					}
					if(count==1) {
						ptr.next = start;
						start.prev = ptr;
						ptr.prev = null;
						start = ptr;
						return;
					}
					Node ptr2 = start;
					for(int i=1;i<mid-1;i++) {
						ptr2 = ptr2.next;
					}
					ptr.next = ptr2;
					ptr.prev = ptr2.prev;
					ptr.prev.next = ptr;
					ptr2.prev = ptr;
				}
      
       void  Insertion_inmid_A_MIDN_DLL(int item){
                                         int count = 0;
					Node ptr1 = start;
					while(ptr1!=null) {
						count = count+1;
						ptr1 = ptr1.next;
					}
					int mid = (count/2);
					Node ptr = new Node(item);
					ptr.info = item;
					
					if(count==0) {
						ptr.next = null;
						ptr.prev = null;
						start = ptr;
						return;
					}
					ptr1 = start;
					for(int i=1;i<mid;i++) {
						ptr1 = ptr1.next;
					}
					ptr.next = ptr1.next;
					if(ptr.next!=null)
						ptr.next.prev = ptr;
					ptr1.next = ptr;
					ptr.prev = ptr1;
				}
          
      

     void Deletion_from_first_DLL() {
                                              if(start==null) {
						System.out.println("Empty Linkedlist");
						return;
					}
					Node ptr = start;
					start = start.next;
					if(start!=null)
						start.prev = null;
					System.out.println("******Item Deleted Successfully**********");
				}

     void Deletion_from_Last_DLL() {
 					if(start==null) {
						System.out.println("Double linkedlist is empty.");
						return;
					}
					Node ptr = start;
					if(ptr.next==null) {
						start = null;
						System.out.println("******Item Deleted Successfully**********");
						return;
					}
					while(ptr.next.next!=null)
						ptr = ptr.next;
					ptr.next = null;
					System.out.println("******Item Deleted Successfully**********");
				}
    static void Deletion_Exact_mid_DLL() {
                                        int count = 0;
					Node ptr = start;
					while(ptr!=null) {
						count = count+1;
						ptr = ptr.next;
					}
					int mid = (count/2)+1;
					
					if(count==0) {
						System.out.println("DLL is Empty");
						return;
					}
					if(count==1) {
						start = null;
						System.out.println("******Item Deleted Successfully**********");
						return;
					}
					ptr = start;
					for(int i=1;i<=(mid-2);i++) {
						ptr = ptr.next;
					}
					Node ptr1 = ptr.next;
					ptr.next = ptr1.next;
					 if (ptr1.next != null) {
					        ptr1.next.prev = ptr;
					}
					System.out.println("******Item Deleted Successfully**********");
				}	

    static void Deletion_inmid_Givenitem_DLL(int SItem) {
                                          Node ptr = start;
					while(ptr!=null && ptr.info!=SItem)
						ptr = ptr.next;
					if(ptr==null) {
						System.out.println("Required Item doesn't found");
						return;
					}
					if(ptr==start) {
						ptr = ptr.next;
						ptr.prev = null;
						start = ptr;
						System.out.println("******Item Deleted Successfully**********");
						return;
					}
					Node ptr1 = start;
					while(ptr1.next !=ptr) 
						ptr1 = ptr1.next;
					ptr1.next = ptr.next;
					ptr.next.prev = ptr1;
					System.out.println("******Item Deleted Successfully**********");
				}
   void Insertion_inmid_BGN_DLL11 (int SItem,int item) {
                                 int count1=0;
                               Node  ptr=start;
                                 while (ptr!=null && ptr.info!=SItem){
                                     ptr=ptr.next;}
   
                                 if(ptr==null){
                                     System.out.println("Requied item not Mahhin found ");
                                 return;}
                                 Node ptr1 =new Node(item);
                                 ptr1.info=item;
                                 ptr1.next=ptr;
                                 ptr1.prev=ptr.prev;
                                 ptr.prev=ptr1;
                                 if(ptr1.prev==null)
                                     start=ptr1;
                               
                                 else 
                                     ptr1.prev.next=ptr1;
                                 
                                 
                                         }
   
   static void Insertion_InSortedList_Ascending_DLL(int item) {
					Node ptr = start;
					while((ptr!=null) && (ptr.info<item))
						ptr = ptr.next;
					Node ptr1 = new Node(item);
					ptr1.info = item;
					if(ptr==null) {
						
						if(start==null) {
                                                        ptr1.next = null;
							ptr1.prev = null;
							start = ptr1;
							return;
						}
                                                ptr1.next=null;
						Node ptr2  = start;
						while(ptr2.next != null)
							ptr2 = ptr2.next;
						ptr2.next = ptr1;
						ptr1.prev = ptr2;
						return;
					}
					if(ptr==start) {
                                                ptr1.next=start;
						ptr.prev = null;
						start.prev=ptr1;
						start = ptr1;
						start=ptr1;
						return;
					}
					Node ptr2 = start;
					while(ptr2.next !=ptr) 
						ptr2 = ptr2.next;
					ptr2.next = ptr1;
                                        ptr1.prev = ptr2;
                                        ptr1.next = ptr;
                                        ptr.prev = ptr1;
					
					
					
				}
   
   static void Insertion_InSortedList_Descending_DLL(int item) {
					Node ptr = start;
					while((ptr!=null) && (ptr.info>item))
						ptr = ptr.next;
					Node ptr1 = new Node(item);
					ptr1.info = item;
					if(ptr==null) {
						
						if(start==null) {
                                                        ptr1.next = null;
							ptr1.prev = null;
							start = ptr1;
							return;
						}
                                                ptr1.next=null;
						Node ptr2  = start;
						while(ptr2.next != null)
							ptr2 = ptr2.next;
						ptr2.next = ptr1;
						ptr1.prev = ptr2;
						return;
					}
					if(ptr==start) {
                                                ptr1.next=start;
						ptr.prev = null;
						start.prev=ptr1;
						start = ptr1;
						start=ptr1;
						return;
					}
					Node ptr2 = start;
					while(ptr2.next !=ptr) 
						ptr2 = ptr2.next;
					ptr2.next = ptr1;
                                        ptr1.prev = ptr2;
                                        ptr1.next = ptr;
                                        ptr.prev = ptr1;
					
					
					
				}
   void Insertion_inmid_A_MIDN_DLL1(int item) {
    int count = 0;
    Node ptr1 = start;
    while (ptr1 != null) {
        count = count + 1;
        ptr1 = ptr1.next;
    }

    int mid = (count / 2);
    Node ptr = new Node(item);
    ptr.info = item;

    if (count == 0) {
        ptr.next = null;
        ptr.prev = null;
        start = ptr;
        return;
    }

    ptr1 = start;
    for (int i = 1; i <= mid; i++) {
        ptr1 = ptr1.next;
    }

    ptr.next = ptr1.next;
    if (ptr.next != null) {
        ptr.next.prev = ptr;
    }

    ptr.prev = ptr1;
    ptr1.next = ptr;
}
   
void Insertion_inmid_B_MIDN_DLL112(int item) {
    int count = 0;
    Node ptr1 = start;
    while (ptr1 != null) {
        count = count + 1;
        ptr1 = ptr1.next;
    }

    int mid = (count / 2) + 1;
    Node ptr = new Node(item);
    ptr.info = item;

    if (count == 0) {
        ptr.next = null;
        ptr.prev = null;
        start = ptr;
        return;
    }

    if (count == 1) {
        ptr.next = start;
        ptr.prev = null;
        start.prev = ptr;
        start = ptr;
        return;
    }

    ptr1 = start;
    for (int i = 1; i <= mid - 1; i++) {
        ptr1 = ptr1.next;
    }

    // Insert before the exact middle node
    ptr.prev = ptr1.prev;
    if (ptr1.prev != null) {
        ptr1.prev.next = ptr;
    } else {
        start = ptr;  // Update start if inserting at the beginning
    }

    ptr.next = ptr1;
    ptr1.prev = ptr;
}

   
   
                                           
       
       
                                         
       
   }
        
                           
		
   
   
   
   