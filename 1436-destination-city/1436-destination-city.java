class Solution {
    public String destCity(List<List<String>> paths) {
        
        Map<String, String> cityMap = new HashMap<>();

        for (List<String> path : paths) {
            cityMap.put(path.get(0), path.get(1));
        }

        
        String destination = paths.get(0).get(1); 
        while (cityMap.get(destination) != null) {
            destination = cityMap.get(destination);
        }
        
        return destination;
        
    }
}