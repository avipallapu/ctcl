package graphs;

import lombok.extern.java.Log;
import node.GraphNode;

import java.util.ArrayList;
import java.util.List;

@Log(topic = "FortyOne.class")
class FortyOne {
    private static boolean ifPath(Graph graph, GraphNode n1, GraphNode n2) {
        for (GraphNode n : graph.getGraphNodes()) {
            if (n.getVal().equals(n1.getVal())) {
                return ifPath(n, n2);
            }
        }
        return false;
    }

    private static boolean ifPath(GraphNode n, GraphNode n2) {
        if (n == null) {
            return false;
        }
        n.setVisited(true);
        if (n.getVal().equals(n2.getVal())) {
            return true;
        }

        for (GraphNode cur : n.getNeighbors()) {
            if (!cur.isVisited() && ifPath(cur, n2)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        GraphNode gn1 = new GraphNode(1);
        GraphNode gn2 = new GraphNode(2);
        GraphNode gn3 = new GraphNode(3);
        GraphNode gn4 = new GraphNode(4);
        GraphNode gn5 = new GraphNode(5);
        GraphNode gn6 = new GraphNode(6);
        GraphNode gn7 = new GraphNode(7);

        List<GraphNode> graphNodeList = new ArrayList<GraphNode>();
        graphNodeList.add(gn1);
        graphNodeList.add(gn2);
        graphNodeList.add(gn3);
        graphNodeList.add(gn4);
        graphNodeList.add(gn5);
        graphNodeList.add(gn6);

        gn1.getNeighbors().add(gn2);
        gn1.getNeighbors().add(gn5);
        gn2.getNeighbors().add(gn1);
        gn2.getNeighbors().add(gn3);
        gn3.getNeighbors().add(gn2);
        gn3.getNeighbors().add(gn4);
        gn4.getNeighbors().add(gn3);
        gn4.getNeighbors().add(gn5);
        gn5.getNeighbors().add(gn1);
        gn5.getNeighbors().add(gn4);

        Graph graph = new Graph();
        graph.setGraphNodes(graphNodeList);

        boolean ifPath = ifPath(graph, gn7, gn6);
        log.info(String.valueOf(ifPath));

    }
}
