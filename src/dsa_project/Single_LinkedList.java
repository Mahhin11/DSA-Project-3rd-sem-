package DSA_Project;

import java.util.Scanner;

public class Single_LinkedList {

    static Scanner sc = new Scanner(System.in);


    static class Node {
        int info;
        Node next;

        Node(int info) {
            this.info = info;
            this.next = null;
        }
    }

    static Node start = null;

    Single_LinkedList() {
        while (true) {
            System.out.println("Which type of Operation you want to operate in Single  Linked List: \n1: Traverse \n2: Insertion \n3: Deletion \n4: Exit");
            int menuSelect = sc.nextInt();

            switch (menuSelect) {
                case 1:
                    traverse_sll();
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
        System.out.println("Which Type of Insertion you want to Operate in LinkedList: \n1: Insertion at First \n2: Insertion at Middle \n3: Insertion at Last \n4: Insertion in SLL Asscending \n5: Insertion in SLL Descending \n6: Exit");
        int insertionSelect = sc.nextInt();
        int item;

        switch (insertionSelect) {
            case 1:
                    InsertionAtFirst();
                break;
            case 2:
                handleMiddleInsertionMenu();
                break;
            case 3:
                InsertionAtEnd();
                break;
            case 4:
                System.out.println("Enter the item you went to insert: ");
		 item = sc.nextInt();
                Insertion_SLL_Ascending(item);
                break;
            case 5:
                 System.out.println("Enter the item you went to insert: ");
		 item = sc.nextInt();
                Insertion_SLL_Ascending12(item);
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
        System.out.println("In SLL middle where You want to Insert: \n1: Insertion Before Given Node(BGN) \n2: Insertion After Given Node(AGN) \n3: Insertion Before Exact Middle Node (BMID_N) \n4: Insertion After Exact Middle Node (AMID_N) \n5: Exit");
        int midSelect = sc.nextInt();

        switch (midSelect) {
            case 1:
                System.out.println("Enter the item you went to insert: ");
		int item = sc.nextInt();            
                System.out.println("Enter the item before which you want to insert  ");
                int SItem = sc.nextInt();
               Insertion_inmid_BGN_SLL(SItem,item);
                break;
            case 2:
                System.out.println("Enter the item you went to insert: ");
		 item = sc.nextInt();            
                System.out.println("Enter the item After  which you want to insert  ");
                int AItem = sc.nextInt();
                Insertion_inmid_AGN_SLL(AItem,item);
                break;
            case 3:
                System.out.println("Enter the item you went to insert: ");
		item = sc.nextInt();   
                Insertion_inmid_B_MIDN_SLL(item);
                break;
            case 4:
                System.out.println("Enter the item you went to insert: ");
		item = sc.nextInt(); 
                Insertion_inmid_A_MIDN_SLL(item);
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
        System.out.println("Which type of Deletion you want: \n1: Deletion from first \n2: Deletion from last \n3: Deletion from Exact Middle \n4: Deletion from Given Item value \n5: Exit");
        int deleteSelect = sc.nextInt();

        switch (deleteSelect) {
            case 1:
                deletionAtFirst();
                break;
            case 2:
                deletionAtLast();
                break;
            case 3:

               deletionOfMiddleValue();
                break;
            case 4:
               System.out.println("Enter the SItem to delete: ");
               int SItem = sc.nextInt();
               deletionFromItemValue( SItem);
               break;
            case 5:
                System.out.println("Exit Successfully....");
                return;
            default:
                System.out.println("Selected Number is not valid. Please Select from the menu");
                break;
        }
    }
		
		
		
		
		static void traverse_sll() {
			if(start==null) {
				System.out.println("Sll is Empty.");
				return;
			}
			Node ptr = start;
			while(ptr!=null) {
				System.out.print(ptr.info +"\n");
				ptr = ptr.next;
			}
		}
		
		static void InsertionAtFirst() {
			System.out.println("Enter the item you went to insert: ");
			int item = sc.nextInt();
			Node ptr = new Node(item);
			ptr.info = item;
			ptr.next = start;
			start = ptr;
		}
		
		static void InsertionAtEnd() {
                          char ch;
              
			System.out.println("Enter the item you went to insert: ");
			int item = sc.nextInt();
			Node ptr = new Node(item);
			ptr.info = item;
			ptr.next = null;
			
			if(start==null) {
				start = ptr;
				return;
			}
			
			Node ptr1 = start;
			while(ptr1.next!=null) {
				ptr1 = ptr1.next;
			}
			ptr1.next = ptr;
                        System.out.println("Item Inserted Success use Traverse to see");
                        
    }
    
				
		static void Insertion_SLL_Descending(int item) {
			{
				Node ptr = start;
				while((ptr!=null) && (ptr.info>item))
					ptr = ptr.next;
				Node ptr1 = new Node(item);
				ptr1.info = item;
				if(ptr==null) {
					ptr1.next = null;
					if(start==null) {
						start = ptr1;
						return;
					}
					Node ptr2  = start;
					while(ptr2.next != null)
						ptr2 = ptr2.next;
					ptr2.next = ptr1;
					return;
				}
				if(ptr==start) {
					ptr1.next = start;
					start = ptr1;
					return;
				}
				Node ptr2 = start;
				while(ptr2.next !=ptr) 
					ptr2 = ptr2.next;
				ptr2.next = ptr1;
				ptr1.next = ptr;
			}
		
                }
		static void Insertion_SLL_Ascending(int item) {
			Node ptr = start;
				while((ptr!=null) && (ptr.info<item))
					ptr = ptr.next;
				Node ptr1 = new Node(item);
				ptr1.info = item;
				if(ptr==null) {
					ptr1.next = null;
					if(start==null) {
						start = ptr1;
						return;
					}
					Node ptr2  = start;
					while(ptr2.next != null)
						ptr2 = ptr2.next;
					ptr2.next = ptr1;
					return;
				}
				if(ptr==start) {
					ptr1.next = start;
					start = ptr1;
					return;
				}
				Node ptr2 = start;
				while(ptr2.next !=ptr) 
					ptr2 = ptr2.next;
				ptr2.next = ptr1;
				ptr1.next = ptr;
			}
                
                static void Insertion_SLL_Ascending12(int item) {
    Node ptr = start;

    // Check if the linked list is sorted
    while (ptr != null && ptr.next != null) {
        if (ptr.info >= ptr.next.info) {
            System.out.println("The linked list is not sorted in ascending order. Please sort the list first.");
            return;
        }
        ptr = ptr.next;
    }

    // If the linked list is sorted, proceed with insertion
    ptr = start;
    while (ptr != null && ptr.info < item) {
        ptr = ptr.next;
    }

    Node ptr1 = new Node(item);
    ptr1.info = item;

    if (ptr == null) {
        ptr1.next = null;
        if (start == null) {
            start = ptr1;
            return;
        }
        Node ptr2 = start;
        while (ptr2.next != null)
            ptr2 = ptr2.next;
        ptr2.next = ptr1;
    } else if (ptr == start) {
        ptr1.next = start;
        start = ptr1;
    } else {
        Node ptr2 = start;
        while (ptr2.next != ptr)
            ptr2 = ptr2.next;
        ptr2.next = ptr1;
        ptr1.next = ptr;
    }
}
                
                static void deletionAtFirst() {
                                        if(start==null) {
					System.out.println("Empty Linkedlist");
					return;
                                                    }
                                        Node ptr = start;
                                        start = start.next;
                                        System.out.println("******Item Deleted Successfully**********");
                            }

                static void deletionAtLast() {
                    if(start==null) {
					System.out.println("SLL is Empty");
					return;
				}
				if(start.next == null) {
					start = null;
					System.out.println("******Item Deleted Successfully**********");
					return;
				}
				Node ptr = start;
				while(ptr.next.next!=null) {
					ptr = ptr.next;
				}
				ptr.next = null;
				System.out.println("******Item Deleted Successfully**********");
			}

                static void deletionOfMiddleValue() {
                         int count = 0;
				Node ptr = start;
				while(ptr!=null) {
					count = count+1;
					ptr = ptr.next;
				}
				int mid = (count/2)+1;
				
				if(count==0) {
					System.out.println("SLL is Empty");
					return;
				}
				if(count==1) {
					start = null;
					System.out.println("******Item Deleted Successfully**********");
					return;
				}
				ptr = start;
				for(int i=1;i<=(mid-1);i++) {
					ptr = ptr.next;
				}
				Node ptr1 = ptr.next;
				ptr.next = ptr1.next;
			}	
                

                static void deletionFromItemValue(int SItem) {
                   Node ptr = start;
				while(ptr!=null && ptr.info!=SItem)
					ptr = ptr.next;
				if(ptr==null) {
					System.out.println("Required Item doesn't found");
					return;
				}
				if(ptr==start) {
					start = ptr.next;
					System.out.println("******Item Deleted Successfully**********");
					return;
				}
				Node ptr1 = start;
				while(ptr1.next !=ptr) 
					ptr1 = ptr1.next;
				ptr1.next = ptr.next;
				System.out.println("******Item Deleted Successfully**********");
			}
                
                
                 void Insertion_inmid_BGN_SLL(int SItem,int item){
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
				if(ptr==start) {
		        	start = ptr1;
		        	return;
		        }
				Node ptr2 = start;
				while(ptr2.next!=ptr)
					ptr2 = ptr2.next;
				ptr2.next = ptr1;
				
			}
                     
                     
        
                void Insertion_inmid_AGN_SLL(int SItem,int item){
                    
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
				ptr.next = ptr1;

                      }
                 void Insertion_inmid_B_MIDN_SLL(int item){
                     
                       int count = 0;
				Node ptr1 = start;
				while(ptr1!=null) {
					count = count+1;
					ptr1 = ptr1.next;
				}
				int mid = (count/2)+1;
				Node ptr = new Node(item);
				ptr.info = item;
				
				if((count==0) || (count==1)){
					ptr.next = start;
					start = ptr;
					return;
				}
				Node ptr2 = start;
				for(int i=1;i<=(mid-2);i++) {
					ptr2 = ptr2.next;
				}
				ptr.next = ptr2.next;
				ptr2.next = ptr;
			}
			
                 void Insertion_inmid_A_MIDN_SLL(int item) {
                     
                        int count = 0;
                        Node ptr1 = start;
                        while(ptr1 != null) {
                            count = count + 1;
                            ptr1 = ptr1.next;
                        }
                        int mid = (count / 2);
                        Node ptr = new Node(item);
                        ptr.info = item;

                        if(count == 0) {
                            ptr.next = null;
                            start = ptr;
                            return;
                        }

                        Node ptr2 = start;
                        for(int i = 1; i <= (mid - 1); i++) {
                            ptr2 = ptr2.next;
                        }

                        ptr.next = ptr2.next.next;  // Fix: Insert after the middle node
                        ptr2.next.next = ptr;
                    }
                 
                 static void algo11last(int item){
                     Node ptr =new Node(item);
                     ptr.info=item;
                     ptr.next=null;
                     if(start==null){
                         start=ptr;
                         return;
                     }
                     Node ptr1=start;
                     while(ptr1.next!=null){
                         ptr1=ptr1.next;
                     }
                     ptr1.next=ptr;
                 }
		
                 
                 
                 
                 
             static void travese156() {
                 if (start==null){
                     System.out.println("Link list is Empty ");return;}
                 Node ptr;
                 ptr=start;
                 while(ptr.next!=null){
                     System.out.println(ptr);
                     ptr=ptr.next;
                     
                 }
             }
                 
                 static void insertion142(int item) {
               int count=0;
               Node ptr=start;
               while(ptr!=null)
               {
                   count++;
                   ptr=ptr.next;
             }
               int mid=(count/2)+1;
               ptr=start;
               for(int i=0;i<mid-1;i++){
                   ptr=ptr.next;
               }
               Node ptr1= new Node(item);
             }   
                 
void insertionAtExactMidBGN23(int item)
        {
            int Count = 0;
            Node ptr = start;
            while (ptr != null)
            {
                Count++;
                ptr = ptr.next;
            }
            int Mid = (Count/2)+1;
            ptr = start;
            for (int i=0 ; i< Mid-1 ; i++)
            {
                ptr = ptr.next;
            }
            Node ptrNew = new Node(item);   
           
            ptrNew.next = ptr;
            Node  ptr1 = start;
            if ((ptr1 == null) || (ptr1.next == null))
            {
                start = ptrNew;
            } 
            else 
            {
                while (ptr1.next != ptr) 
                {
                    ptr1 = ptr1.next;
                }
                ptr1.next = ptr1;
            }
        }





        }
                 
                 
                 
                 
                 
                 
                
                 

        




		
	
