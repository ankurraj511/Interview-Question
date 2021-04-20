class Solution{
    // Return a integer of integers having all the nodes in both the BSTs in a sorted order.
    public List<Integer> merge(Node root1,Node root2)
    {
        List<Integer> res = new ArrayList<>();
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        Node temp = root1;
        while (temp != null) {
            stack1.push(temp);
            temp = temp.left;
        }
        temp = root2;
        while (temp != null) {
            stack2.push(temp);
            temp = temp.left;
        }
        while(stack1.size() > 0 && stack2.size() > 0) {
            if (stack1.peek().data <= stack2.peek().data) {
                temp = stack1.pop();
                // System.out.println(temp.data);
                res.add(temp.data);
                temp = temp.right;
                while (temp != null) {
                    stack1.push(temp);
                    temp = temp.left;
                }
            } else {
                temp = stack2.pop();
                // System.out.println(temp.data);
                res.add(temp.data);
                temp = temp.right;
                while (temp != null) {
                    stack2.push(temp);
                    temp = temp.left;
                }
            }
        }
        while(stack1.size() > 0) {
            temp = stack1.pop();
            res.add(temp.data);
            temp = temp.right;
            while (temp != null) {
                stack1.push(temp);
                temp = temp.left;
            }
        }
        while(stack2.size() > 0) {
            temp = stack2.pop();
            res.add(temp.data);
            temp = temp.right;
            while (temp != null) {
                stack2.push(temp);
                temp = temp.left;
            }
        }
        return res;
    }
}
