public class Judge {
    /**
     * Constructor
     */
    public Judge(){
    }

    /**
     * find the judge who
     * 1. The town judge trusts nobody.
     * 2. Everybody (except for the town judge) trusts the town judge.
     * 3. There is exactly one person that satisfies properties 1 and 2.
     * @param N int = number of people in the town
     * @param trust int [] [] = the trust array, in the form provided above
     * @return the ID of the judge or -1 if no judge is found.
     */
    public int findJudge (int N, int[][] trust){
        int[] trust_count = new int[N];
        boolean[] have_trust = new boolean[N];
        if(N < 1 || N > 1000 || trust.length > 10000)
            throw new IndexOutOfBoundsException();
        for(int[] entry: trust) {
            int src = entry[0] - 1;
            int dest = entry[1] - 1;
            trust_count[dest]++;
            if(!have_trust[src])
                have_trust[src] = true;
        }
        for(int i = 0; i < N; i++)
            if(trust_count[i] == N - 1)
                if(!have_trust[i])
                    return i + 1;
        return -1;
    }
}
