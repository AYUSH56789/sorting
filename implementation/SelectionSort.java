// Selection Sort= Select Min + Swap
public class SelectionSort{
    // select min from unsorted array
    public static int select(int arr[],int i){
        int min=i;
        for (int j = i; j <= arr.length-1; j++) {
            // this condition sort array in ascending order,[for descending order arr[j]>arr[min] ].

            if(arr[j]<arr[min]){
                min=j;
            }
        }
        return min;
    }

    // selection sort algorithm :
    public static void selectionSort(int arr[]){
        for (int i = 0; i <= arr.length-2; i++) {
            // select min
            int min=select(arr, i);
            // swap arr[min] with arr[i]
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,2,13};
        // call selection sort;
        selectionSort(arr);
        // print array 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

// input:1 2 3 1 3 2 13
// output:1 1 2 2 3 3 13 
// time complexity: O(N^2) -> for best case, average case, worst case time complexity
