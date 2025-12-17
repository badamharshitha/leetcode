class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
       HashMap<String,ArrayList<String>> map=new HashMap<>();
       map.put("electronics",new ArrayList<>());
       map.put("grocery",new ArrayList<>());
       map.put("pharmacy",new ArrayList<>());
       map.put("restaurant",new ArrayList<>());
       for(int i=0;i<isActive.length;i++)
       {
        if(isActive[i]
        &&map.containsKey(businessLine[i])
        &&code[i].matches("^[A-Za-z0-9_]+$")
        )map.get(businessLine[i]).add(code[i]);
       }

List<String> list=new ArrayList<>();
for(String key:List.of("electronics", "grocery", "pharmacy", "restaurant")){
    Collections.sort(map.get(key));
list.addAll(map.get(key));
}


        return list;
    }
}