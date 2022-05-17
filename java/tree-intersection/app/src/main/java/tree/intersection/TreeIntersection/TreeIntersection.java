package tree.intersection.TreeIntersection;

import tree.intersection.BineryTree;

import java.util.ArrayList;
import java.util.HashMap;

public class TreeIntersection <T> {
    public  static ArrayList tree_intersection(BineryTree one, BineryTree two){
        HashMap <Object,Integer> newHash=new HashMap<Object,Integer>();
        ArrayList<String> returnArray=new ArrayList<String>();
        for (Object value: one.fetchData()) {
            newHash.computeIfAbsent(value, v-> 1);
                    }

        for (Object value: two.fetchData()) {
           newHash.computeIfPresent(value, (k,v) -> v+1);
                  }

        for (Object V:newHash.keySet()) {
            if(newHash.get(V)>1){
                returnArray.add(V.toString());
                     }


        }
        return returnArray;
    }
}
