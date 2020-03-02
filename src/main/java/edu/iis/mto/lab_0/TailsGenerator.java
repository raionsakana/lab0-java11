package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

class TailsGenerator {

    static List<String> tails(String value) {

        ArrayList<String> list = new ArrayList<>();
        int SIZE = value.length();

        for (int i = 0; i < SIZE + 1; i++)
            list.add(value.substring(i, SIZE));

        return list;
    }

}
