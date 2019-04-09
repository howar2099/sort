package sort;

/**
 * @Author 赵金浩
 * @Date 2019-4-9
 **/
public class QuickSort {
    private static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }


    public static void main(String[] args){
        long total = 0;
        for (int i = 0; i < 100; i++) {
            int[] arr = new int[100000];
            for (int j = 0; j < 100000; j++) {
                arr[j] = (int) (Math.random() * 1000000);
            }

            System.out.print("1--"+arr[0]);
            System.out.println();
            long a = System.currentTimeMillis();
            quickSort(arr, 0, arr.length-1);
            long b = System.currentTimeMillis();
            System.out.print("2--"+arr[0]);

            System.out.println();
            System.out.print("耗时:" + (b - a));
            total += (b-a);
        }

        System.out.print("平均耗时："+total/100);
    }
}
