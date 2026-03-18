// find missing number
//
//public class missingNumber {
//
//    public static int missingNumber(int[] arr) {
//        int n = arr.length;
//        int s = (n*(n+1)/2);
//        int result = 0;
//
//        for(int x : arr) {
//            result = result + x;
//        }
//        return s - result;
//    }
//

// find missing number from array using XOR Bit manipulation approach

    public class missingNumber{
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int totalXORSum = 0;
        int totalXORArraySum = 0;

        for(int i=0;i<=n;i++) {
            totalXORSum = totalXORSum ^ i;
        }
        for(int x : arr) {
            totalXORArraySum = totalXORArraySum ^ x;
        }
        return totalXORSum = totalXORArraySum;
    }

        public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
}







