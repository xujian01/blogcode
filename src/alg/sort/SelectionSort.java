package alg.sort;
/**
 * 选择排序
 *  @author: xujian
 *  @Date: 2019-09-11
 *  @Description:
 */
public class SelectionSort {
    public int[] sort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            int min = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                swap(arr,i,min);
            }
        }
        return arr;
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = new int[]{2,1,4,3,2,5,8,6};
        int[] arr1 = selectionSort.sort(arr);
        System.out.println(arr1);
    }
}
