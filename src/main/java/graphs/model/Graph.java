package graphs.model;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Graph {
    private List<GraphNode> graphNodes;
}
