class Solution {
    public int longestCycle(int V, int[][] edges) {
        int[] next = new int[V];
        for (int i = 0; i < V; i++) next[i] = -1;
        for (int[] e : edges) {
            next[e[0]] = e[1];
        }
        
        boolean[] visited = new boolean[V];
        int[] time = new int[V]; //stores visit time
        int timer = 1;
        int maxCycle = -1;
        for (int i = 0; i < V; i++) {
            if (visited[i]) continue;
            int curr = i;
            int startTime = timer; 
            
            //start traversal
            while (curr != -1 && !visited[curr]) {
                visited[curr] = true;
                time[curr] = timer++;
                curr = next[curr];
            }
            
            if (curr != -1 && time[curr] >= startTime) {
                int cycleLength = timer - time[curr];
                maxCycle = Math.max(maxCycle, cycleLength);
            }
        }
        return maxCycle;
        
        // int[] next = new int[V];
        // for (int i = 0; i < V; i++) next[i] = -1;
        // for (int[] e : edges) {
        //     next[e[0]] = e[1];
        // }
        
        // boolean[] visited = new boolean[V];
        // int maxCycle = -1;
        
        // //traverse each node 
        // for (int i = 0; i < V; i++) {
        //     if (visited[i]) continue;
        //     int curr = i;
        //     int step = 0;
        //     java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        //     while (curr != -1) {
        //         if (visited[curr]) {
        //             if (map.containsKey(curr)) {
        //                 int cycleLength = step - map.get(curr);
        //                 maxCycle = Math.max(maxCycle, cycleLength);
        //             }
        //             break;
        //         }
                
        //         visited[curr] = true;
        //         map.put(curr, step);
        //         step++;
        //         curr = next[curr];
        //     }
        // }
        
        // return maxCycle;
        
    }
} 
