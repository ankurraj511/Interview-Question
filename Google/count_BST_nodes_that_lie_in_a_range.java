// A Binary Search Tree node
/*

class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

*/
//Complete this function
class Tree{
    int getCount(Node root,int l, int h) {
        if (root == null)
            return 0;
        if (root.data < l) 
            return getCount(root.right , l , h);
        if (root.data > h) 
            return getCount(root.left , l , h);
        return getCount(root.left , l , h) + getCount(root.right , l , h) + 1;
    }
}
