package hw6.pkg2;


import java.util.Arrays;


public class Mergesort {

    //static int[] input = HW62.intArr;
    static int[] poop;
            
    	public static int[] mergeSort(int[] input){
		
		if(input.length == 1){
			return input;
		}
		
		int middle = (int) Math.ceil((double)input.length / 2);
		int[] left = new int[middle];
		
		int rightLength = 0;
		if(input.length % 2 == 0){
			rightLength = middle;
		}
		else{
			rightLength = middle - 1;
		}
		int[] right = new int[rightLength];
		
		int leftIndex = 0; 
		int rightIndex = 0;
		
		for (int i = 0; i < input.length; i++) {
			if(i < middle){
				left[leftIndex] = input[i];
				leftIndex++;
			}
			else{
				right[rightIndex] = input[i];
				rightIndex++;
			}
		}
		
		left = mergeSort(left);
		right = mergeSort(right);
        int[] poop;
		
		return poop = merge(left, right);
	}
        
        public static int[] merge(int[] left, int[] right){
		int[] result = new int[left.length + right.length];
		int leftIndex = 0;
		int rightIndex = 0;
		int resultIndex = 0;
		
		while(leftIndex < left.length || rightIndex < right.length){
			if(leftIndex < left.length && rightIndex < right.length){
				if(left[leftIndex] < right[rightIndex]){
					result[resultIndex] = left[leftIndex];
					leftIndex++;
					resultIndex++;
				}
				else{
					result[resultIndex] = right[rightIndex];
					rightIndex++;
					resultIndex++;
				}
			}
			else if(leftIndex < left.length){
				for (int i = resultIndex; i < result.length; i++) {
					result[i] = left[leftIndex];
					leftIndex++;
				}
			}
			else if(rightIndex < right.length){
				for (int i = resultIndex; i < result.length; i++) {
					result[i] = right[rightIndex];
					rightIndex++;
				}
			}
		}
		
		return result;
	}
    
    
    
    
    
    /*static void mergesort(int[] A) //breaks the array in half until length is 1
    {
        if (A.length > 1) {
            int q = A.length/2;

            //changed range of leftArray from 0-to-q to 0-to-(q-1)
            int[] leftArray = Arrays.copyOfRange(A, 0, q-1);
            //changed range of rightArray from q-to-A.length to q-to-(A.length-1)
            int[] rightArray = Arrays.copyOfRange(A,q,A.length-1);

            mergesort(leftArray);
            mergesort(rightArray);

            merge(A,leftArray,rightArray);
        }
    }*/
    
    static void mergesort(float[] A) //breaks the array in half until length is 1
    {
        if (A.length > 1) {
            int q = A.length/2;

            //changed range of leftArray from 0-to-q to 0-to-(q-1)
            float[] leftArray = Arrays.copyOfRange(A, 0, q-1);
            //changed range of rightArray from q-to-A.length to q-to-(A.length-1)
            float[] rightArray = Arrays.copyOfRange(A,q,A.length-1);

            mergesort(leftArray);
            mergesort(rightArray);

            //merge(A,leftArray,rightArray);
        }
    }
    
    static void mergesort(String[] A) //breaks the array in half until length is 1
    {
        if (A.length > 1) {
            int q = A.length/2;

            //changed range of leftArray from 0-to-q to 0-to-(q-1)
            String[] leftArray = Arrays.copyOfRange(A, 0, q-1);
            //changed range of rightArray from q-to-A.length to q-to-(A.length-1)
            String[] rightArray = Arrays.copyOfRange(A,q,A.length-1);

            mergesort(leftArray);
            mergesort(rightArray);

            //merge(A,leftArray,rightArray);
        }
    }

    /*static void merge(int[] a, int[] l, int[] r) //comparison and sorting of elements
    {
        int totElem = l.length + r.length;
        //int[] a = new int[totElem];
        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
        //return a;

    }*/
    
    static void merge(float[] a, float[] l, float[] r) //comparison and sorting of elements
    {
        int totElem = l.length + r.length;
        //int[] a = new int[totElem];
        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
        //return a;

    }
    
    static void merge(String[] a, String[] l, String[] r) //comparison and sorting of elements
    {
        int totElem = l.length + r.length;
        //int[] a = new int[totElem];
        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li].compareTo(r[ri]) < 0) {
                    a[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }
        //return a;

    }

}