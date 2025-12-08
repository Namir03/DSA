import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Graph g = new Graph(5);   // Create graph with 5 vertices

        // Add Edges
        g.addEdge(1, 2, 10);
        g.addEdge(1, 3, 20);
        g.addEdge(2, 4, 30);
        g.addEdge(3, 5, 40);
        g.addEdge(4, 5, 50);

        System.out.println("Displaying Graph:");
        g.Display();                           // Display all connections

        // Check if an edge exists
        System.out.println("\nEdge between 1 and 3? " + g.hasEdge(1, 3));
        System.out.println("Edge between 2 and 5? " + g.hasEdge(2, 5));

        // Number of edges
        System.out.println("\nTotal Edges: " + g.noOfEdges());

        // Check for path
        boolean path = g.hasPath(1, 5, new HashSet<>());
        System.out.println("\nPath exists between 1 and 5? " + path);

        // Remove an edge
        System.out.println("\nRemoving edge between 1 and 3...");
        g.removeEdge(1, 3);

        System.out.println("\nDisplaying Graph after removal:");
        g.Display();

        // Recheck path
        boolean path2 = g.hasPath(1, 5, new HashSet<>());
        System.out.println("\nNew Path between 1 and 5 after removal? " + path2);

    }
}