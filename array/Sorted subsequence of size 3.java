class Solution {
    public ArrayList<Integer> find3Numbers(int[] arr) {
        /*
        1. create smaller[]
        - smaller[i] stores index of smaller element before i
        - if none exists --> -1
        travel from left to right
        
        2. create greater[]
        - greater[i] stores index of greater element after i
        - if none exists -> -1
        traverse from right to left
        
        3. find valid triplet
        if for any i ->
        smaller[i] != -1 AND greater[i] != -1
        we found -> 
        arr[smaller[i]] < arr[i] < arr[greater[i]]
        */ 
        int n = arr.length;
        int[] smaller = new int[n];
        int[] greater = new int[n];
        int minIndex = 0;
        smaller[0] = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[minIndex]) {
                minIndex = i;
                smaller[i] = -1;
            } else {
                smaller[i] = minIndex;
            }
        }
        int maxIndex = n - 1;
        greater[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= arr[maxIndex]) {
                maxIndex = i;
                greater[i] = -1;
            } else {
                greater[i] = maxIndex;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (smaller[i] != -1 && greater[i] != -1) {
                result.add(arr[smaller[i]]);
                result.add(arr[i]);
                result.add(arr[greater[i]]);
                return result;
            }
        }
        return result;
    }
}
