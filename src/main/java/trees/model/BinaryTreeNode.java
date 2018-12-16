package trees.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
class BinaryTreeNode {
    private Object val;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    BinaryTreeNode(int i) {
        this.val = i;
        this.left = null;
        this.right = null;
    }
}
