package graphs.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class GraphNode {
    private Object val;
    private boolean isVisited;
    private List<GraphNode> neighbors;

    public GraphNode(int i) {
        this.val = i;
        this.neighbors = new ArrayList<GraphNode>();
    }
}
