class Solution {
    Set<String> set = new HashSet<>();
    int dupSub(Node root) {
        if (root == null)
            return 0;
        if (root.left != null && root.right != null && root.left.left == null && root.left.right == null && root.right.left == null && root.right.right == null) {
            String temp = root.left.data + "|" + root.data + "|" + root.right.data; 
            if (set.contains(temp))
                return 1;
            set.add(temp);
            return 0;
        }
        if (dupSub(root.left) == 1)
            return 1;
        return dupSub(root.right);
    }
}
