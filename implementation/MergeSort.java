// merge sort = dividing an array and merge it in correct order for each part 
import java.util.ArrayList;

public class MergeSort {
    public static void mergeSort(int arr[],int low, int high){
        // base case -> for check only one element left at the last of the division
        if(low==high){
            return;
        }
        // find mid
        int mid=(low+high)/2;
        // calling mergeSort for left unsorted part
        mergeSort(arr, low, mid);
        // calling mergeSort for right unsorted part
        mergeSort(arr, mid+1, high);
        // calling merge() to merge left and right part
        merge(arr,low,mid,high);
    }

    // merge fundtion {HELPER FUNCTION}
    public static void merge(int arr[],int low,int mid,int high){
        // left pointer
        int left=low;
        // right pointer
        int right=mid+1;
        // create temperary array list
        ArrayList<Integer> temp=new ArrayList<>();
        // merge according to sorting order
        while (left<=mid && right<=high) {
            // merge according to ascending order [for descending order -{ arr[left]>=arr[right] }]
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        // rest element from the left part is add in temp array
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        // rest element from the right part is add in temp array
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        // assign temp array to original array 
        for (int j = low; j<=high; j++) { 
            arr[j]=temp.get(j-low);                
        }

    }
    public static void main(String[] args) {
        int arr[]={24 ,18 ,38 ,43 ,14 ,40 ,1 ,54};
        // call selection sort;
        mergeSort(arr,0,arr.length-1);
        // print array 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

// input:1 2 3 1 3 2 13
// output:1 1 2 2 3 3 13 
// time complexity: O(NlogN) -> for best case, average case, worst case time complexity