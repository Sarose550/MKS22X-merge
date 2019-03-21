
import java.util.*;

public class Merge{
    public static void insertionSort(int[] ary, int lo, int hi){ 
        for (int i = lo; i < hi; i++){ 
            int cur = ary[i]; 
            int j = i - 1; 
            while(j >= lo && ary[j] > cur){ 
                ary[j + 1] = ary[j]; 
                j--;
            } 
            ary[j + 1] = cur; 
        }
    } 

    // Places the elements of the given data into sorted order
    // using the merge sort algorithm.
    // post: data is in sorted (nondecreasing) order
    public static void mergesort(int[] data) {
    	if(data.length <= 20){
    		insertionSort(data, 0, data.length);
    	}
        if (data.length > 20) {
            // split data into two halves
            int[] left = leftHalf(data);
            int[] right = rightHalf(data);
            
            // recursively sort the two halves
            mergeSort(left);
            mergeSort(right);
            
            // merge the sorted halves into a sorted whole
            merge(data, left, right);
        }
    }
    
    // Returns the first half of the given data.
    public static int[] leftHalf(int[] data) {
        int size1 = data.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = data[i];
        }
        return left;
    }
    
    // Returns the second half of the given data.
    public static int[] rightHalf(int[] data) {
        int size1 = data.length / 2;
        int size2 = data.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = data[i + size1];
        }
        return right;
    }
    
    // Merges the given left and right datas into the given 
    // result data.  Second, working version.
    // pre : result is empty; left/right are sorted
    // post: result contains result of merging sorted lists;
    public static void merge(int[] result, 
                             int[] left, int[] right) {
        int i1 = 0;   // index into left data
        int i2 = 0;   // index into right data
        
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && 
                    left[i1] <= right[i2])) {
                result[i] = left[i1];    // take from left
                i1++;
            } else {
                result[i] = right[i2];   // take from right
                i2++;
            }
        }
    }
 }
