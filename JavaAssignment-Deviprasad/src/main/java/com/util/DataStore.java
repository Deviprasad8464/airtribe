package com.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataStore<T> {
    private Map<Integer,T> map=new HashMap<>();

    public void add(int id,T obj){map.put(id,obj);}

    public T get(int id){ return map.get(id);}

    public List<T> getAll(){ return new ArrayList<>(map.values());}
}
