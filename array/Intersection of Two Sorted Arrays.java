class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
    /*  logic building -->
        initialization --->
        i =0, j = 0
        result = []
        
        while both pointers are valid --->
        - if a[i] < b[j] --> i++
        - if a[i] > b[j] --> j++
        - if a[i] == b[j] 
            - check duplicate ==> add if new
            - move both  
    */
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]){ 
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                if (result.size() == 0 || result.get(result.size() - 1 ) != a[i]) {
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }
        return result;
    }
}
