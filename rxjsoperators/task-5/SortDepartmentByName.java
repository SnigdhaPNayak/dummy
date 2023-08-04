import java.util.*;

public class SortDepartmentByName {
    private static HashMap sortValues(HashMap data) {
        LinkedList list = new LinkedList(data.entrySet());
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

    public void sortDepartment(HashMap<Employee, Department> data) {
        ArrayList<String> employeeDepartment = new ArrayList<String>();
        ArrayList<String> departmentName = new ArrayList<String>();

        for (Map.Entry m : data.entrySet()) {
            employeeDepartment.add(m.getKey().toString() + m.getValue().toString());
            departmentName.add(((Department) m.getValue()).getDepartmentName());

        }

        HashMap<String, String> details = new HashMap<String, String>();
        for (int i = 0; i < data.size(); i++) {
            details.put(employeeDepartment.get(i), departmentName.get(i));
        }

        HashMap<String, String> sort = sortValues(details);
        System.out.println("\n\nEmployee and Department Data, sorted by Department name:");
        Set sortedMap = sort.entrySet();
        Iterator iterator = sortedMap.iterator();
        while (iterator.hasNext()) {
            Map.Entry m = (Map.Entry) iterator.next();
            System.out.println(m.getKey());
        }
    }
}
