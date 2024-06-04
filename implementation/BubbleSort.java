// bubble sort = Put the maximum to the last of the adjacent swap.
public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for (int i = arr.length-1; i >= 1; i--) {
            int didSwap=0; //this variable is used to count is swaping is perform or not.
            for (int j = 0; j < i; j++) {
                // this condition sort array in ascending order,[for descending order arr[j]<arr[j+1] ].
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    // increment didSwap variable by one .
                    didSwap++;
                }
            }
            // if no swaping is perform than the given array is already in sorted order and break loop after one iteration on full array -> time complexity : [ O(N) ]
            if(didSwap==0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,2,13};
        // call selection sort;
        bubbleSort(arr);
        // print array 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

// input:1 2 3 1 3 2 13
// output:1 1 2 2 3 3 13 
// time complexity: O(N^2) -> for average case, worst case time complexity.
//                  O(N) -> for average case, worst case time complexity.

