/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;


import java.util.Scanner;
import java.util.Random;


public class Array {
    Scanner sc=new Scanner(System.in);
      static int lb = 0;
    static int mainchoice, choice1, choice2,searchchoice;
    static int size;
    static int n = 0;
    static int[] ar = new int[size];
  
    
    
  

    // Traverses the array from lb to n
   static void Treverse(int a[], int lb, int n) {
    System.out.print("(");
    for (int i = lb; i <= n + lb - 1; i++) {
        System.out.print(a[i]);
        if (i < n + lb - 1) {
            System.out.print(", ");
        }
    }
    System.out.println(")");
   }

static void Insertion(int a[], int lb, int n, int size, int k, int item) {
    if (n == size) 
        System.out.println("overflow (Array is full)");
        
    if (k < lb || k > n + lb) {
        System.out.println("Invalid Position for Range");
    }

    for (int i=n+lb-1;i>=k;i--)
    {  a[i+1]=a[i];
    a[k]=item;
    }
}
    static void Deletion(int a[], int lb, int n, int k) {
       if (n == 0)
        System.out.println("Underflow Condition");
    if (k < lb || k > n + lb - 1) {
        System.out.println("Deletion position is not valid");
    }

    // Print array before deletion
    System.out.print("Before Deletion: ");
    Treverse(a, lb, n);

    for (int i = k + 1; i <= n + lb - 1; i++) {
        a[i - 1] = a[i];
    }

    // Print array after deletion
    System.out.print("After Deletion: ");
    Treverse(a, lb, n);
}

    // Performs linear search for a single occurrence of an item in the array
    static void LinearSearchSingle(int a[], int lb, int n, int item) {
        for (int i = lb; i <= n + lb - 1; i++) {
            if (a[i] == item) {
                System.out.println("Item Found at index " + i);
                return;
            }
        }
        System.out.println("Item not found!");
    }

    // Performs linear search for multiple occurrences of an item in the array
    static void LinearSearchMulti(int a[], int lb, int n, int item) {
        int count = 0;
        for (int i = lb; i <= n + lb - 1; i++) {
            if (a[i] == item)
                count = count + 1;
        }
        if (count == 0)
            System.out.println("Item not found");
        else
            System.out.println(item + " found " + count + " times.");
    }

    // Performs binary search for a single occurrence of an item in the sorted array
    static void BinarySearchSingle(int a[], int lb, int n, int item) {
        int low = lb;
        int high = n + lb - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == item) {
                System.out.println("Item Found at index: " + mid);
                return;
            } else if (item < a[mid]) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
    }

    // Performs binary search for multiple occurrences of an item in the sorted array
    static void BinarySearchMulti(int a[], int lb, int n, int item) {
        int low = lb;
        int high = n + lb - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == item) {
                int count = 1;
                int i = mid + 1;
                while (i <= high && a[i] == item) {
                    count++;
                    i++;
                }
                i = mid - 1;
                while (i >= low && a[i] == item) {
                    count++;
                    i--;
                }
                System.out.println("Item found " + count + " times.");
                return;
            } else if (item < a[mid]) {
                high = mid - 1;
            } else
                low = mid + 1;
        }
    }

    // Performs Bubble Sort in ascending order
    static void BubbleSortAsc(int a[], int lb, int n) {
         System.out.println("Before Sort:");
    Treverse(a, lb, n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
          System.out.println("After  Sort:");
    Treverse(a, lb, n);
        System.out.println("********Done******");
      
        
    }

    // Performs Bubble Sort in descending order
    static void BubbleSortDec(int a[], int lb, int n) {
        System.out.println("Before Sort:");
    Treverse(a, lb, n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
         System.out.println("After  Sort:");
    Treverse(a, lb, n);
        System.out.println("********Done******");
    }
    

    // Performs Selection Sort in ascending order
    static void SelectionSortAsc(int a[], int lb, int n) {
         System.out.println("Before Sort:");
    Treverse(a, lb, n);
        for (int i = 0; i < n - 1; i++) {
            int loc = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[loc]) {
                    loc = j;
                }
            }
            int temp = a[i];
            a[i] = a[loc];
            a[loc] = temp;
        }
        System.out.println("After  Sort:");
    Treverse(a, lb, n);
        System.out.println("********Done******");
    }

    // Performs Selection Sort in descending order
    static void SelectionSortDec(int a[], int lb, int n) {
          System.out.println("Before Sort:");
    Treverse(a, lb, n);
        for (int i = 0; i < n - 1; i++) {
            int loc = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[loc]) {
                    loc = j;
                }
            }
            int temp = a[i];
            a[i] = a[loc];
            a[loc] = temp;
        }
            System.out.println("After  Sort:");
    Treverse(a, lb, n);
        System.out.println("********Done******");
    }

    // Performs Insertion Sort in ascending order
   static void InsertionSortAsc(int a[], int lb, int n) {
    System.out.println("Before Sort:");
    Treverse(a, lb, n);

    for (int i = lb + 1; i < n + lb; i++) {
        int key = a[i];
        int j = i - 1;
        while (j >= lb && a[j] > key) {
            a[j + 1] = a[j];
            j = j - 1;
        }
        a[j + 1] = key;
    }

    System.out.println("After Sort:");
    Treverse(a, lb, n);
    System.out.println("********Done******");
}

    // Performs Insertion Sort in descending order
  static void InsertionSortDec(int a[], int lb, int n) {
    System.out.println("Before Sort:");
    Treverse(a, lb, n);

    for (int i = lb + 1; i < n + lb; i++) {
        int key = a[i];
        int j = i - 1;
        while (j >= lb && a[j] < key) {
            a[j + 1] = a[j];
            j = j - 1;
        }
        a[j + 1] = key;
    }

    System.out.println("After Sort:");
    Treverse(a, lb, n);
    System.out.println("********Done******");
}
    
    
    
 static void ShellSortAsc(int a[], int lb, int n) {
    int gap = n / 2;
    while (gap != 0) {
        System.out.println("Before Sort:");
        Treverse(a, lb, n);

        for (int last = lb + gap; last < n + lb; last++) {
            int min = a[last];
            int i = last - gap;
            while (i >= lb && a[i] > min) {
                a[i + gap] = a[i];
                i = i - gap;
            }
            a[i + gap] = min;
        }

        System.out.println("After Sort:");
        Treverse(a, lb, n);
        System.out.println("********Done******");
        gap = gap / 2;
    }
}
    
    
    
    
static void shellSortDes(int a[], int lb, int n) {
    int gap = n / 2;
    while (gap != 0) {
        System.out.println("Before Sort:");
        Treverse(a, lb, n);

        for (int last = lb + gap; last < n + lb; last++) {
            int max = a[last];
            int i = last - gap;
            while (i >= lb && a[i] < max) {
                a[i + gap] = a[i];
                i = i - gap;
            }
            a[i + gap] = max;
        }

        System.out.println("After Sort:");
        Treverse(a, lb, n);
        System.out.println("********Done******");
        gap = gap / 2;
    }
}


static void MergeSort(int a[], int lb, int n) {
    
    int low = lb;
    int high = n + lb - 1;
    MergeSort_sub(a, low, high);
    System.out.println("**************Done******************");
}

static void MergeSort_sub(int a[], int low, int high) {
    if (low < high) {
        int mid = (low + high) / 2;
        MergeSort_sub(a, low, mid);
        MergeSort_sub(a, mid + 1, high);
        Merge(a, low, mid, high);
    }
}

static void Merge(int a[], int low, int mid, int high) {
    int lb = 0;
    int nL = mid - low + 1;
    int nR = high - mid;
    int k = 0;
    int left[] = new int[nL];
    int right[] = new int[nR];

    for (int i = low; i <= mid; i++) {
        left[k] = a[i];
        k = k + 1;
    }
    int j = 0;
    for (int i = mid + 1; i <= high; i++) {
        right[j] = a[i];
        j = j + 1;
    }

    int ptrL = lb;
    int ptrR = lb;
    int ptrA = low;

    while (ptrL < nL && ptrR < nR) {
        if (left[ptrL] < right[ptrR]) {
            a[ptrA] = left[ptrL];
            ptrL = ptrL + 1;
            ptrA++;
        } else {
            a[ptrA] = right[ptrR];
            ptrR = ptrR + 1;
            ptrA++;
        }
    }

    if (ptrL > (nL)) {
        while (ptrR < (nR)) {
            a[ptrA] = right[ptrR];
            ptrR++;
            ptrA++;
        }
    } else {
        while (ptrL < (nL)) {
            a[ptrA] = left[ptrL];
            ptrL++;
            ptrA++;
        }
    }
}



/*****************MergeSortDescending******************/

static void MergeSort_Dec(int a[], int lb, int n) {
    int low = lb;
    int high = n + lb - 1;
    MergeSort_sub_Dec(a, low, high);
    System.out.println("**************Done******************");
}

static void MergeSort_sub_Dec(int a[], int low, int high) {
    if (low < high) {
        int mid = (low + high) / 2;
        MergeSort_sub_Dec(a, low, mid);
        MergeSort_sub_Dec(a, mid + 1, high);
        Merge_Dec(a, low, mid, high);
    }
}

static void Merge_Dec(int a[], int low, int mid, int high) {
    int lb = 0;
    int nL = mid - low + 1;
    int nR = high - mid;
    int k = 0;
    int left[] = new int[nL];
    int right[] = new int[nR];

    for (int i = low; i <= mid; i++) {
        left[k] = a[i];
        k = k + 1;
    }
    int j = 0;
    for (int i = mid + 1; i <= high; i++) {
        right[j] = a[i];
        j = j + 1;
    }

    int ptrL = lb;
    int ptrR = lb;
    int ptrA = low;

    while (ptrL < nL && ptrR < nR) {
        if (left[ptrL] > right[ptrR]) {
            a[ptrA] = left[ptrL];
            ptrL = ptrL + 1;
            ptrA++;
        } else {
            a[ptrA] = right[ptrR];
            ptrR = ptrR + 1;
            ptrA++;
        }
    }

    if (ptrL > (nL)) {
        while (ptrR < (nR)) {
            a[ptrA] = right[ptrR];
            ptrR++;
            ptrA++;
        }
    } else {
        while (ptrL < (nL)) {
            a[ptrA] = left[ptrL];
            ptrL++;
            ptrA++;
        }
    }
}


/*******************QuickSort Ascending****************/

static void QuickSort_Asc(int lb, int n) {
    int low = lb;
    int high = n + lb - 1;
    QuickSort_Asc_sub(low, high);
    System.out.println("**************Done******************");
}

static void QuickSort_Asc_sub(int low, int high) {
    if (low < high) {
        int idx = Partition(low, high);
        QuickSort_Asc_sub(low, idx - 1);
        QuickSort_Asc_sub(idx + 1, high);
    }
}

static int Partition(int low, int high) {
    int pivot = ar[low];
    int i = low + 1;
    int j = high;

    while (i < j) {
        while ((i <= high) && (ar[i] <= pivot))
            i++;
        while (ar[j] > pivot)
            j--;
        if (i < j) {
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        } else {
            int temp = ar[low];
            ar[low] = ar[j];
            ar[j] = temp;
        }
    }
    return j;
}

// *******************QuickSort Descending****************

static void QuickSort_Dec(int lb, int n) {
    int low = lb;
    int high = n + lb - 1;
    QuickSort_Dec_sub(low, high);
    System.out.println("**************Done******************");
}

static void QuickSort_Dec_sub(int low, int high) {
    if (low < high) {
        int idx = PartitionDec(low, high);
        QuickSort_Dec_sub(low, idx - 1);
        QuickSort_Dec_sub(idx + 1, high);
    }
}

static int PartitionDec(int low, int high) {
    int pivot = ar[low];
    int i = low + 1;
    int j = high;

    while (i < j) {
        while (ar[i] >= pivot)
            i++;
        while ((j >= lb) && (ar[j] < pivot))
            j--;
        if (i < j) {
            int temp = ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
        } else {
            int temp = ar[low];
            ar[low] = ar[j];
            ar[j] = temp;
        }
    }
    return j;
}



    
    
    

          public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter Array size");
               size=sc.nextInt();
         
        do {
            System.out.println("Press 1 to Traverse");
            System.out.println("Press 2 to Insertion");
            System.out.println("Press 3 to Deletion");
            System.out.println("Press 4 to Searching");
            System.out.println("Press 5 to Sorting");
            System.out.println("Press 6 to Exit");
            System.out.println("Enter your choice: ");
            mainchoice = sc.nextInt();
           switch (mainchoice) {
    case 1:
        Treverse(ar, lb, n);
        break;
   case 2:
    System.out.println("Enter the Index where you want to Insert Data");
    int idx = sc.nextInt();
    System.out.println("Enter the value:");
    int val = sc.nextInt();
    try {
        Insertion(ar, lb, n, size, idx, val);
        n = n + 1;
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Index out of Range");
    }
    break;
    case 3:
        System.out.println("Enter the index value you want to delete");
        int item = sc.nextInt();
        Deletion(ar, lb, n, item);
        n = n - 1;
        break;
    case 4:
        System.out.println("Press 1 to Linear Search");
        System.out.println("Press 2 to Binary Search");
        System.out.println("Enter your choice");
        searchchoice = sc.nextInt();

        switch (searchchoice) {
            case 1:
                System.out.println("Press 1 for Linear Single Search");
                System.out.println("Press 2 for Linear Multi Search");
                System.out.println("Enter your choice");
                int z = sc.nextInt();

                switch (z) {
                    case 1:
                        System.out.println("Enter the value you want to Search");
                        item = sc.nextInt();
                        LinearSearchSingle(ar, lb, n, item);
                        break;
                    case 2:
                        System.out.println("Enter the value you want to Search");
                        item = sc.nextInt();
                        LinearSearchMulti(ar, lb, n, item);
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            case 2:
                System.out.println("Press 1 for Binary Single Search");
                System.out.println("Press 2 for Binary Multi Search");
                System.out.println("Enter your choice");
                z = sc.nextInt();

                switch (z) {
                    case 1:
                        System.out.println("Enter the value you want to Search");
                        item = sc.nextInt();
                        BinarySearchSingle(ar, lb, n, item);
                        break;
                    case 2:
                        System.out.println("Enter the value you want to Search");
                        item = sc.nextInt();
                        BinarySearchMulti(ar, lb, n, item);
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        break;
    case 5:
        System.out.println("Press 1 to Sort in Ascending Order.");
System.out.println("Press 2 to Sort in Descending Order.");
System.out.println("Enter your choice");
 int choice = sc.nextInt();
switch(choice) {
    case 1:
        System.out.println("Press 1 for Bubble Sort Ascending Order");
        System.out.println("Press 2 for Selection Sort Ascending zOrder");
        System.out.println("Press 3 for Insertion Sort Ascending Order");
          System.out.println("Press 4 for Shell Sort Ascending Order");
          System.out.println("Press 5 for Merge Sort Ascending Order");
           System.out.println("Press 6 for Quick Sort Ascending Order");
        System.out.println("Enter your choice");
        int z = sc.nextInt();
        switch(z) {
            case 1:
                BubbleSortAsc(ar, lb, n);
                break;
            case 2:
                SelectionSortAsc(ar, lb, n);
                break;
            case 3:
                InsertionSortAsc(ar, lb, n);
                break;
            case 4:
                 ShellSortAsc( ar,  lb,  n) ;
                break;
            case 5:
                  MergeSort(ar, lb, n);
                 break;
             case 6:
                   QuickSort_Asc(lb, n);
                   break;
            
            
            
            default:
                
                
                System.out.println("Invalid Input");
        }
        break;
    case 2:
        System.out.println("Press 1 for Bubble Descending Sort");
        System.out.println("Press 2 for Selection Descending Sort");
        System.out.println("Press 3 for Insertion Descending Sort");
        System.out.println("Press 4 for Shell Sort Descending  Order");
         System.out.println("Press 5 for Merge Descending Sort");
         System.out.println("Press 6 for Quick Descending Sort");
        System.out.println("Enter your choice");
        z = sc.nextInt();
        switch(z) {
            case 1:
                BubbleSortDec(ar, lb, n);
                break;
            case 2:
                SelectionSortDec(ar, lb, n);
                break;
            case 3:
                InsertionSortDec(ar, lb, n);
                break;
                
            case 4:
                shellSortDes(ar,lb,n);
                break;
              case 5:
                MergeSort_Dec(ar, lb, n);
                break;
                case 6:
                 QuickSort_Dec(lb, n);
                 break;  
                
                
                
                
                
                
            default:
                System.out.println("Invalid Input");
        }
        break;
}
    case 6:
                 
        
        
    default:
        System.out.println("Invalid Input");
        break;
}
              
        }
           while (mainchoice != 6);
        System.out.println("Exit Successfully");
    }
}




