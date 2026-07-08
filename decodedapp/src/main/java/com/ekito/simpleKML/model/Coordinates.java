package com.ekito.simpleKML.model;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Coordinates {
    private ArrayList<Coordinate> list = new ArrayList<>();

    public Coordinates() {
    }

    public ArrayList<Coordinate> getList() {
        return this.list;
    }

    public void setList(ArrayList<Coordinate> arrayList) {
        this.list = arrayList;
    }

    public String toString() {
        Iterator<Coordinate> it = this.list.iterator();
        String str = "";
        while (it.hasNext()) {
            str = str + it.next().toString();
        }
        return str;
    }

    public Coordinates(String str) {
        for (String str2 : str.replaceFirst("^\\s+", "").split("\\s+")) {
            String[] strArrSplit = str2.split("(?<!\\\\),");
            this.list.add(new Coordinate(Double.valueOf(Double.parseDouble(strArrSplit[0])), Double.valueOf(Double.parseDouble(strArrSplit[1])), strArrSplit.length > 2 ? Double.valueOf(Double.parseDouble(strArrSplit[2])) : null));
        }
    }
}
