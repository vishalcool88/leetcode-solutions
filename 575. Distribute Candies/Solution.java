//Simple solution using Set to determine uniquness
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int candy:candyType){
            map.put(candy, map.getOrDefault(candy, 0) + 1);
            set.add(candy);
        }
        return Math.min(set.size(), candyType.length / 2);
    }
}
