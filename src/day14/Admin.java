package day14;

import java.util.*;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        //implement
        HashMap<Key, Student> ks = new HashMap<>();
        for (Student s : students) {
            Key key = new Key(s.getFirstName(), s.getLastName());
            ks.put(key, s);
        }
        return ks;
    }

    public static double computeAverageGPA(HashMap<Key, Student> maps) {
        //implements
        double totalGpr = 0;
        Set<Map.Entry<Key, Student>> set = maps.entrySet();
        for (Map.Entry<Key, Student> entry : set) {
            totalGpr += entry.getValue().getGpa();
        }
        double average = totalGpr / set.size();
        return average;
    }
}
