package alg.sort;
/**
 * 冒泡排序
 *  @author: xujian
 *  @Date: 2019-09-11
 *  @Description:
 */
public class BubbleSort {
    public int[] sort(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            boolean flag = true;
            for (int j=0; j<arr.length-1; j++) {
                if (arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                    flag = false;
                }
            }
            if (flag) {
                break;
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
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = new int[]{2,1,4,3,2,5,8,6};
        int[] arr1 = bubbleSort.sort(arr);
        System.out.println(arr1);
    }
}
