class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for(String operation : operations){
            try{
                list.add(Integer.parseInt(operation));
            }catch(Exception e){
                if(operation.equals("+")){
                    list.add(list.get(list.size()-1) + list.get(list.size()-2));
                }else if(operation.equals("D")){
                    list.add(list.get(list.size()-1)*2);
                }else if(operation.equals("C")){
                    list.remove(list.size()-1);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}