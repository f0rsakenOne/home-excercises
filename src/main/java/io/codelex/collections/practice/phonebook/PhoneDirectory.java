package io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<Integer, PhoneEntry> data;

    public PhoneDirectory() {
        data = new TreeMap<>();
    }

    private int find(String name) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String getNumber(String name) {
        int position = find(name);
        if (position == -1) {
            return null;
        } else {
            return data.get(position).number;
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        int i = find(name);
        if (i >= 0) {
            data.get(i).number = number;
        } else {
            PhoneEntry newEntry = new PhoneEntry();
            newEntry.name = name;
            newEntry.number = number;
            data.put(data.size(), newEntry);
        }
    }

}
