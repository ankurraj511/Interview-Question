/*Complete the function below.
Node is as follows:
class Tree
{
      int data;
      Tree left,right;
      Tree(int d){
          data=d;
          left=null;
          right=null;
}
}*/
class Tree1
{
	static long res;
	static void helper(Node root , long sum) {
	    if (root == null) 
	        return ;
	    sum = (sum * 10) + root.data;
	    if (root.left == null && root.right == null) {
	        res += sum;
	        return ;
	    }
	    helper(root.left , sum);
	    helper(root.right , sum);
	}
	public static long treePathsSum(Node root) {
         res = 0;
         helper(root , 0);
         return res;
	}
}
