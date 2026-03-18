// 2 points
// Company Tags
// Flipkart, Accolite, Amazon, FactSet, Hike, MakeMyTrip, Goldman Sachs, Adobe, Salesforce

// Topic Tags
// Arrays, Sorting, Two-Pointer-Algorithm


class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == 0) {
                result.add(new ArrayList<>(Arrays.asList(arr[left], arr[right])));
                
                int lVal = arr[left];
                int rVal = arr[right];
                
                while (left < right && arr[left] == lVal) left++;
                while (left < right && arr[right] == rVal) right--;
            }
            else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        
        return result;
    }
}
 
