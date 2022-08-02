package org.csci132.summer.week6.lecture2;

import org.csci132.summer.week5.lecture1.LinkedQueue;
import org.csci132.summer.week5.lecture1.Queue;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author : Adiesha
 * @created : 7/30/2022, Saturday
 **/
public class Sort {

    /**
     * Insertion-sort of an array of characters into nondecreasing order
     */
    public static void insertionSort(char[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) { // begin with second character
            char cur = data[k]; // time to insert cur=data[k]
            int j = k; // find correct index j for cur
            while (j > 0 && data[j - 1] > cur) { // thus, data[j-1] must go after cur
                data[j] = data[j - 1]; // slide data[j-1] rightward
                j--; // and consider previous j for cur
            }
            data[j] = cur; // this is the proper place for cur
        }
    }


    /**
     * Merge contents of arrays S1 and S2 into properly sized array S.
     */
    private static <K> void merge(K[] S1, K[] S2, K[] S, Comparator<K> comp) {
        int i = 0, j = 0;
        while (i + j < S.length) {
            if (j == S2.length || (i < S1.length && comp.compare(S1[i], S2[j]) < 0))
                S[i + j] = S1[i++]; // copy ith element of S1 and increment i
            else
                S[i + j] = S2[j++]; // copy jth element of S2 and increment j
        }
    }


    /**
     * Merge-sort contents of array S.
     */
    public static <K> void mergeSort(K[] S, Comparator<K> comp) {
        int n = S.length;
        if (n < 2) return; // array is trivially sorted
        // divide
        int mid = n / 2;
        K[] S1 = Arrays.copyOfRange(S, 0, mid); // copy of first half
        K[] S2 = Arrays.copyOfRange(S, mid, n); // copy of second half
        // conquer (with recursion)
        mergeSort(S1, comp); // sort copy of first half
        mergeSort(S2, comp); // sort copy of second half
        // merge results
        merge(S1, S2, S, comp); // merge sorted halves back into original
    }


    /**
     * Quick-sort contents of a queue.
     */
    public static <K> void quickSort(Queue<K> S, Comparator<K> comp) {
        int n = S.size();
        if (n < 2) return; // queue is trivially sorted
        // divide
        K pivot = S.first(); // using first as arbitrary pivot
        Queue<K> L = new LinkedQueue<>();
        Queue<K> E = new LinkedQueue<>();
        Queue<K> G = new LinkedQueue<>();
        while (!S.isEmpty()) { // divide original into L, E, and G
            K element = S.dequeue();
            int c = comp.compare(element, pivot);
            if (c < 0) // element is less than pivot
                L.enqueue(element);
            else if (c == 0) // element is equal to pivot
                E.enqueue(element);
            else // element is greater than pivot
                G.enqueue(element);
        }  // conquer
        quickSort(L, comp); // sort elements less than pivot
        quickSort(G, comp); // sort elements greater than pivot
        // concatenate results
        while (!L.isEmpty())
            S.enqueue(L.dequeue());
        while (!E.isEmpty())
            S.enqueue(E.dequeue());
        while (!G.isEmpty())
            S.enqueue(G.dequeue());
    }


    /**
     * Sort the subarray S[a..b] inclusive.
     */
    private static <K> void quickSortInPlace(K[] S, Comparator<K> comp,
                                             int a, int b) {
        if (a >= b) return; // subarray is trivially sorted
        int left = a;
        int right = b - 1;
        K pivot = S[b];
        K temp; // temp object used for swapping
        while (left <= right) {  // scan until reaching value equal or larger than pivot (or right marker)
            while (left <= right && comp.compare(S[left], pivot) < 0) left++;
            // scan until reaching value equal or smaller than pivot (or left marker)
            while (left <= right && comp.compare(S[right], pivot) > 0) right--;
            if (left <= right) { // indices did not strictly cross
                // so swap values and shrink range
                temp = S[left];
                S[left] = S[right];
                S[right] = temp;
                left++;
                right--;
            }
        }  // put pivot into its final place (currently marked by left index)
        temp = S[left];
        S[left] = S[b];
        S[b] = temp;
        // make recursive calls
        quickSortInPlace(S, comp, a, left - 1);
        quickSortInPlace(S, comp, left + 1, b);
    }
}
