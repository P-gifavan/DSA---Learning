import java.util.*;

class Solution {

    public int findSecondMinimumValue(TreeNode root) {

        // TreeSet stores values in sorted order
        // and removes duplicate values automatically
        TreeSet<Integer> set = new TreeSet<>();

        // Queue for BFS traversal
        Queue<TreeNode> queue = new LinkedList<>();

        // Add root to the queue
        queue.add(root);

        // BFS traversal
        while (!queue.isEmpty()) {

            // Remove the current node
            TreeNode current = queue.poll();

            // Add current node's value to TreeSet
            set.add(current.val);

            // Add left child
            if (current.left != null) {
                queue.add(current.left);
            }

            // Add right child
            if (current.right != null) {
                queue.add(current.right);
            }
        }

        // Find the smallest value greater than the minimum
        Integer secondMinimum = set.higher(set.first());

        // If no second distinct minimum exists
        if (secondMinimum == null) {
            return -1;
        }

        return secondMinimum;
    }
}