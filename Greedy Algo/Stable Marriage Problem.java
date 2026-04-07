class Solution {
    public int[] stableMarriage(int[][] men, int[][] women) {
        int n = men.length;
        int[] partnerOfWoman = new int[n];
        int[] partnerOfMan = new int[n];
        int[] nextProposal = new int[n];
        
        Arrays.fill(partnerOfWoman, -1);
        Arrays.fill(partnerOfMan, -1);
        
        int[][] ranking = new int[n][n];
        for (int w = 0; w < n; w++) {
            for (int i = 0; i < n; i++) {
                ranking[w][women[w][i]] = i;
            }
        }
        Queue<Integer> freeMen = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            freeMen.add(i);
        }
        while(!freeMen.isEmpty()) {
            int man = freeMen.poll();
            int woman = men[man][nextProposal[man]++];
            if (partnerOfWoman[woman] == -1) {
                // woman is free
                partnerOfWoman[woman] = man;
                partnerOfMan[man] = woman;
            } else {
                int currentMan = partnerOfWoman[woman];
                //check preference
                if (ranking[woman][man] < ranking[woman][currentMan]) {
                    //she prefers new man
                    partnerOfWoman[woman] = man;
                    partnerOfMan[man] = woman;
                    freeMen.add(currentMan); //previous becomes free
                } else {
                    freeMen.add(man); //rejected
                }
            }
        }
        return partnerOfMan;
    }
}
