import java.util.HashMap;
import java.util.HashSet;

public class Graph {

    HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Graph(int v) {

        for(int i = 1; i <=v ; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {

        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean hasEdge(int v1, int v2) {
        return map.get(v1).containsKey(v2);
    }

    public void removeEdge(int v1, int v2) {

        if (hasEdge(v1, v2)) {
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }

    public void Display() {

        for(int key : map.keySet()) {
            System.out.println(key + " -----> " + map.get(key));
        }
    }

    public int noOfEdges() {

        int ans = 0;

        for(int key : map.keySet()) {
            ans = ans + map.get(key).size();
        }

        return ans / 2;
    }

    public boolean hasPath(int src, int des, HashSet<Integer> set) {

        if(src == des) {
            return true;
        }

        set.add(src);

        for(int key : map.get(src).keySet()) {
            if (!set.contains(key)) {
                boolean ans = hasPath(key, des, set);

                if (ans) {
                    return true; 
                }
            }
        }

        set.remove(src);

        return false;
    }
}
