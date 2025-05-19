class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     ArrayList<Boolean> List=new ArrayList<>();
     int max=0;
     for(int i=0;i<candies.length;i++){
        max=Math.max(max,candies[i]);
     }
       Boolean a=true;
       Boolean b=false;
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                List.add(a);
            }else{
                List.add(b);
            }
        }
        return List;
    }
}