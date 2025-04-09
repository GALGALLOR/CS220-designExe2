
import java.util.*;

public class phoneBook{
    private TreeMap<String,Set<Integer>> householdInfoByName = new TreeMap<>();
    //householdName, householdNumber
    
    //I dont think we need a constructor

    //Have a new Phonebook object case and everything as objects Including modified TreeMap Object with Back and fort sorting functionalities
    

    public void addDetails(String houseName, Integer houseNumber){
        //if name alrdy exists, put it in the other category
        householdInfoByName.computeIfAbsent(houseName, k -> new HashSet<>()).add(houseNumber);
        householdInfoByName.get(houseName).add(houseNumber);
    }

    //getting Numbers provided Names
    public Set<Integer> getNumbers(String houseName){
        Set<Integer> numbers = householdInfoByName.getOrDefault(houseName, Collections.emptySet());
        return numbers;
    }
    
    public LinkedList<String> getNames(Integer houseNumber){
        LinkedList<String> matchingNames = new LinkedList<>();

        for (Map.Entry<String, Set<Integer>> entry : householdInfoByName.entrySet()) {
            if (entry.getValue().contains(houseNumber)) {
                matchingNames.add(entry.getKey());
            }
        }
        return matchingNames;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Phone Book Entries : {\n");

        for (Map.Entry<String, Set<Integer>> entry : householdInfoByName.entrySet()) {
            sb.append("     { HouseHoldName : ").append(entry.getKey()).append(" , PhoneNumbers : ").append(entry.getValue()).append(" },\n ");
        }
        sb.append(" } ");

        return sb.toString();
    }

    public Set<Integer> getNumbersDesc(String houseName){
        Set<Integer> numbers = householdInfoByName.getOrDefault(houseName, Collections.emptySet());
        Set<Integer> sortedDesc = new TreeSet<>(Comparator.reverseOrder());
        sortedDesc.addAll(numbers);
        return sortedDesc;
    }

    public Set<Integer> getNumbersAsc(String houseName){
        Set<Integer> numbers = householdInfoByName.getOrDefault(houseName, Collections.emptySet());
        Set<Integer> sortedAsc = new TreeSet<>(Comparator.naturalOrder());
        sortedAsc.addAll(numbers);
        return sortedAsc;
    }

    public TreeSet<String> getNamesAsc(Integer houseNumber){
        TreeSet<String> matchingNames = new TreeSet<>(Comparator.naturalOrder());
        for (Map.Entry<String, Set<Integer>> entry : householdInfoByName.entrySet()) {
            if (entry.getValue().contains(houseNumber)) {
                matchingNames.add(entry.getKey());
            }
        }
        return matchingNames;
    }

    public TreeSet<String> getNamesDesc(Integer houseNumber){
        TreeSet<String> matchingNames = new TreeSet<>(Comparator.reverseOrder());
        for (Map.Entry<String, Set<Integer>> entry : householdInfoByName.entrySet()) {
            if (entry.getValue().contains(houseNumber)) {
                matchingNames.add(entry.getKey());
            }
        }
        return matchingNames;
    }

}