class Solution
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        Node temp = null;
        while (queue.size() > 1) {
            Node ele = queue.remove();
            if (ele == null) {
                temp.nextRight = ele;
                queue.add(null);
            } else {
                if (ele.left != null) 
                    queue.add(ele.left);
                if (ele.right != null) 
                    queue.add(ele.right);
                if (temp != null)
                    temp.nextRight = ele;
            }
            temp = ele;
        }
    }
}
