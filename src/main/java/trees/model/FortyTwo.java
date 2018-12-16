package trees.model;

import lombok.extern.java.Log;

@Log
public class FortyTwo {

    public static void main(String[] args) {
        BinaryTreeNode bst = bst(new int[]{1, 2, 3, 4, 5, 6});
        print(bst);
    }

    private static BinaryTreeNode bst(int[] arr) {
        return bst(arr, 0, arr.length - 1);
    }

    private static BinaryTreeNode bst(int[] arr, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = low + (high - low) / 2;
        BinaryTreeNode root = new BinaryTreeNode(arr[mid]);
        root.setLeft(bst(arr, low, mid - 1));
        root.setRight(bst(arr, mid + 1, high));

        return root;
    }


    private static void print(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode == null) {
            return;
        }
        print(binaryTreeNode.getLeft());
        System.out.println(binaryTreeNode.getVal());
        print(binaryTreeNode.getRight());
    }
}