import java.util.*;

public class CountriesAndCapitals {

    private static HashMap sortValues(HashMap countryAndCapital) {
        LinkedList list = new LinkedList(countryAndCapital.entrySet());

        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
            }
        });

        HashMap sortedMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, String> countryAndCapital = new HashMap<String, String>();
        System.out.println("Enter names of 5 countries, with their respective capitals");
        for (int i = 0; i < 5; i++) {
            countryAndCapital.put(sc.nextLine(), sc.nextLine());
        }

        HashMap<String, String> capitalSort = sortValues(countryAndCapital);
        System.out.println("\nCapitals, sorted in ascending order...:");
        Set sortedMap = capitalSort.entrySet();
        Iterator iterator = sortedMap.iterator();
        while (iterator.hasNext()) {
            Map.Entry m = (Map.Entry) iterator.next();
            System.out.println("Country:  " + m.getKey() + "     Capital:   " + m.getValue());
        }
        sc.close();

    }
}
