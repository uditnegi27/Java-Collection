// Map is used to store the Key-Value type of data, Where key is uses a set and value uses a ArrayList to store data

package Java_Map_Collection;

import java.util.HashMap;
import java.util.Map;

public class Java_HashMap {
    public static void main(String args[]) {

//    	Creating a HashMap from HashMap class where Map is instance
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Udit");
        map.put(2, "Renu");
        map.put(3, "Prachi");
        map.put(4, "Gaurav");

//        Printing a HashMap data
        System.out.println(map);

    }
}
