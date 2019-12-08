import java.util.*;

public class AnagramSolution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        LinkedHashMap<String, ArrayList<Integer>> globalMap = new LinkedHashMap<>();
       
        for(int i = 0; i < A.size(); i++){
            String currStr = sortedString(A.get(i));
           
            //new entry
            if(!globalMap.containsKey(currStr)){
                ArrayList<Integer> data = new ArrayList<>();
                data.add(i+1);
                globalMap.put(currStr, data);
            } else { //already existing
                ArrayList<Integer> data = globalMap.get(currStr);
                data.add(i+1);
            }
        }
       
        //collect result
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
       
        for(String key : globalMap.keySet()){
            ArrayList<Integer> groupData = globalMap.get(key);
            Collections.sort(groupData);
            result.add(groupData);
        }
       
        return result;
       
    }
   
    private String sortedString(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
