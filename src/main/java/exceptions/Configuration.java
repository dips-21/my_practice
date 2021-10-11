package exceptions;

import java.util.*;

//[]
// addPermission("Dipali","Rina")
//Dipali--> rina
//Dipali--> rina,ron   addPermission("Dipali","Ron")
//Dipali--> rina,ron,jack   addPermission("Dipali","jack")
//Ron --jack
//assert  hasPermission("Dipali","jack")
public class Configuration {
    private Map<String, Set<String>> userPermissionsMap = new HashMap<>();   //graph structure is same.


    void addPermission(String forUser, String ofUser) {
        userPermissionsMap.putIfAbsent(forUser, new HashSet<>());
        Set<String> userSet = userPermissionsMap.get(forUser);
        userSet.add(ofUser);
    }


    boolean hasPermission(String user, String ofUser) {
        Set<String> sc = userPermissionsMap.get(user);
        return sc != null && sc.contains(ofUser);
    }
}
