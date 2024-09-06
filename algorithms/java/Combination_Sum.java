class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> solutions = new LinkedList<List<Integer>>();
        List<List<Integer>> tempSolutions;
        LinkedList<Integer> temp = new LinkedList<Integer>();
        int i;

        for (int c: candidates) {
            if (c == target) {
                temp = new LinkedList<Integer>();
                temp.add(c);
                solutions.add(temp);
            } else if (c < target) {
                tempSolutions = combinationSum(candidates, target - c);
                while (tempSolutions.size() > 0) {
                    temp = new LinkedList<Integer>();
                    temp = (LinkedList<Integer>)tempSolutions.removeFirst();
                    for (i = 0; i < temp.size(); i++) {
                        if (temp.get(i) >= c) {
                            temp.add(i, c);
                            break;
                        }
                    }
                    if (i == temp.size()) {
                        temp.offerLast(c);
                    }
                    if (!solutions.contains(temp)) {
                        solutions.add(temp);
                    }
                }
            }
        }
        return solutions;
    }
}