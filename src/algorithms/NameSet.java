package algorithms;

import java.util.HashSet;


public class NameSet {

    private HashSet<String> names;

    public NameSet() {
        names = new HashSet<>();
    }

    public boolean addName(String name) {
        return names.add(name);
    }

    public boolean removeName(String name) {
        return names.remove(name);
    }

    public boolean containsName(String name) {
        return names.contains(name);
    }

    public int getSize() {
        return names.size();
    }

}

