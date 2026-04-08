class Solution {
    void segregate0and1(int[] arr) {
        // int countZero = 0;
        // //count 0s
        // for (int num : arr) {
        //     if (num == 0) countZero++;
        // }
        // //fill 0s
        // for (int i = 0; i < countZero; i++) {
        //     arr[i] = 0;
        // }
        
        // //fill 1s
        // for (int i = countZero; i < arr.length; i++) {
        //     arr[i] = 1;
        // }
        
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] == 0) left++;
            while (left < right && arr[right] == 1) right--;
            
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                left++;
                right--;
            }
        }
    }
}
