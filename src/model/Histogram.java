/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Entrar
 */
public class Histogram<T> {
    private final Map<T,Integer> map = new HashMap();
    
    public int get(T key) {
        return map.get(key);
    }
    
    public Set<T> keySet() {
       return map.keySet();
    }
    
    public void increment(T key) {
        Integer temp = map.containsKey(key)?map.get(key)+1:1;
        map.put(key,temp);
    }
}
