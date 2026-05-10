public class Experiment {

    public void runTraversals(Graph g, int start) {
        long startTime = System.nanoTime();
        g.bfs(start);
        long endTime = System.nanoTime();
        System.out.println("BFS Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        g.dfs(start);
        endTime = System.nanoTime();
        System.out.println("DFS Time: " + (endTime - startTime) + " ns");
    }

    public void runMultipleTests() {
        testGraph(10);
        testGraph(30);
        testGraph(100);
    }

    private void testGraph(int size) {
        Graph g = new Graph();
        for (int i = 0; i < size; i++) {
            g.addVertex(new Vertex(i));
        }
        for (int i = 0; i < size - 1; i++) {
            g.addEdge(i, i + 1);
        }

        System.out.println("\nGraph with " + size + " vertices:");
        runTraversals(g, 0);
    }

    public void printResults() {
        System.out.println("Results printed in README.md with screenshots.");
    }
}
