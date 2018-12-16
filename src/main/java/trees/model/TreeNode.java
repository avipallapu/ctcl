package trees.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class TreeNode {
    private Object val;
    private List<TreeNode> children;

    public TreeNode(int i) {
        this.val = i;
        this.children = new ArrayList<TreeNode>();
    }
}
