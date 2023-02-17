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

        for (Integer neighbours:adj.get(src)) {
            if(!visited.contains(src)){
                visited.add(neighbours);
                recursiveDFS(visited,neighbours,adj);
            }

        }
    }

    public static boolean checkPathDFSRecursive(List<Integer>visited,Integer src,Integer dest,Map<Integer,List<Integer>>adj){
        if(src==dest) return true;
        visited.add(src);
        for (Integer naghber:adj.get(src)) {
            if (!visited.contains(naghber)){
                boolean check= checkPathDFSRecursive(visited,naghber,dest,adj);
                if (check==true) return true;
            }

        }
        return false;

    }
    public  static  void allPathsFromSourceToDestinationDFS(List<Integer>path,Map<Integer,List<Integer>>adj,
                                                            List<Integer>visited,Integer currentNod,Integer dest){
        path.add(currentNod);
        if (currentNod==dest){
            for (Integer neighbour:adj.get(currentNod)){
                System.out.println(neighbour);
            }
            // clean up and return
            path.remove(path.size()-1);
            return;
        }
        visited.add(currentNod);

        for (Integer neighbour:adj.get(currentNod)){
            if(!visited.contains(neighbour)){
                allPathsFromSourceToDestinationDFS(path,adj,
                        visited, currentNod, dest);
            }
        }
        // clean up and return
        visited.remove(currentNod);
        path.remove(path.size() - 1);
        return;


    }


}
