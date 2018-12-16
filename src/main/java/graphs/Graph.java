package graphs;

import lombok.*;
import node.GraphNode;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
class Graph {
    private List<GraphNode> graphNodes;
}
