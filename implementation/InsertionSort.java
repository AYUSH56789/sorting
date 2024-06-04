// insertion sort : take element from the array and place on the correct position on the left
public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            // select element
            int j=i;
            // place on the correct place by swaping
            // this condition sort array in ascending order,[for descending order arr[j-1]<arr[j] ].
            while(j>0 && arr[j-1]>arr[j]){
                // swap
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                // decrement j by one;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,2,13};
        // call selection sort;
        insertionSort(arr);
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
