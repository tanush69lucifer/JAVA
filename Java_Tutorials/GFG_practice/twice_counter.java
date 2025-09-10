class Solution {
    public int countWords(String list[], int n) {
        // code here
        HashMap<String,Integer>map=new HashMap<>();
        for(String s:list){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int count=0;
        for(Map.Entry<String,Integer>entry:map.entrySet()){     
                if(entry.getValue()==2){
                    count++;
                }
        }
        return count;
    }
}
