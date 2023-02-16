package DFS;

import java.util.*;

public class Graph {
    public static void iterativeDFS (Integer src , Map<Integer, List<Integer>>adj){
        ArrayDeque<Integer>queue=new ArrayDeque<>();
        ArrayList<Integer>visited=new ArrayList<>();

        queue.push(src);
        while (!queue.isEmpty()){
            Integer currentNode=queue.poll();
            visited.add(currentNode);
            
            System.out.println(currentNode);

            for (Integer neighbour:adj.get(currentNode)) {
                
                if(!visited.contains(currentNode)){
                    queue.push(neighbour);
                }
            }
        }

    }



    public static void recursiveDFS(List<Integer>visited,Integer src,Map<Integer,List<Integer>>adj){
        visited.add(src);

        for (Integer nabers:adj.get(src)) {
            if(!visited.contains(src)){
                visited.add(nabers);
                recursiveDFS(visited,nabers,adj);
            }

        }
    }
}
