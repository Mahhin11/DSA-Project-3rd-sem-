package DSA_Project;

import java.util.Scanner;

public class Main {
    static int choiceM;

    // *************Main Function***************
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Press 1 for Array");
            System.out.println("Press 2 for Stack");
            System.out.println("Press 3 for Queue");
            System.out.println("Press 4 for linked list");
            System.out.println("Press 5 for Exit");
            System.out.println("Enter your choice: ");
            choiceM = sc.nextInt();
            switch (choiceM) {
                case 1:
                    Array ar = new Array();
                    break;
                case 2:
                    System.out.println("Press 1 for implementing Stack on Array \nPress 2 for implementing on Linked list \nPress 3 For exit ");
                    int stackds = sc.nextInt();
                    switch (stackds) {
                        case 1: {
                            Stack st = new Stack();
                        }
                        break;
                        case 2: {
                            System.out.println("Press 1 for implementing Stack on Single Linked List  \nPress 2 for implementing Stack on Double Linked list \nPress 3 For exit ");
                            int stackds1 = sc.nextInt();
                            switch (stackds1) {
                                case 1: {
                                   Stack_linked_list sq = new  Stack_linked_list();
                                }
                                break;
                                case 2: {
                                    stack_dll dq = new stack_dll();
                                }
                                break;
                                case 3: {
                                    System.out.println("Exit Successfully......");
                                }
                                break;
                                default: {
                                    System.out.println("Please Select a valid number from the menu...");
                                    return;
                                }
                            }
                        }
                        break;
                        case 3: {
                            System.out.println("Exit Successfully......");
                        }
                        break;
                        default: {
                            System.out.println("Please Select a valid number from the menu...");
                            return;
                        }
                    }
                    break;

                case 3:
                      System.out.println("Press 1 for implementing Queue on Array \nPress 2 for implementing on Linked list \nPress 3 For exit ");
                        int queueds = sc.nextInt();
                        switch (queueds) {
                        case 1:{
                            System.out.println("1: For Simple Queue On Array  \n2: For Circular Queue on Array  \n3: Exit");
                            int choiceq= sc.nextInt();
                            switch (choiceq){
                                case 1:
                                    Queue Q = new Queue();
                                    break;
                                case 2:
                                    CircularQueue1 cq1 = new CircularQueue1();
                                case 3:
                                     System.out.println("Exit Successfully......"); break;
                                default:
                                     System.out.println("Invalid choice"); break;}
                        }     
                            
                            
                        case 2:{
                            handle_queueopt(sc);
                            break;}
                            
                        case 3:
                              System.out.println("Exit Successfully.......");
                              break;
                        }
                
                    break;
            

                case 4: {
                    System.out.println("1: Single Linked List \n2: Double linked List \n3: Exit");
                    int listSelect = sc.nextInt();
                    switch (listSelect) {
                        case 1: {
                            Single_LinkedList LL = new Single_LinkedList();
                        }
                        break;
                        case 2: {
                            Double_LinkedList DLL = new Double_LinkedList();
                        }
                        break;
                        case 3: {
                            System.out.println("Exit Successfully.......");
                        }
                        break;
                        default: {
                            System.out.println("Please Select a valid number from the menu...");
                            return;
                        }
                    }
                }
                break;
            }
        } while (choiceM != 5);
    }
        
    
    static void handle_queueopt(Scanner sc) {
        System.out.println("1: Single Linked List \n2: Double linked List \n3: Exit");
        int listSelect = sc.nextInt();
        switch (listSelect) {
            case 1:
                // Single Linked List
                Queue_Linked_list  qdl = new Queue_Linked_list();
                break;
            case 2:
                // Double Linked List
                Queue_Double1  qll = new Queue_Double1();
                break;
            case 3:
                System.out.println("Exit Successfully.......");
                break;
            default:
                System.out.println("Please Select a valid number from the menu...");
                break;
        }
    
    
    
    
}
}
