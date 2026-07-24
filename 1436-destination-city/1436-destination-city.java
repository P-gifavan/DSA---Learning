class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> startCities = new HashSet<>();
        for(List<String> path : paths) {
            startCities.add(path.get(0));
        }
        for(List<String> path: paths) {
            String destinationCity = path.get(1);
            if(!startCities.contains(destinationCity)){
                return destinationCity;
            }
        }
        return " ";
    }
}