public class MaxPathSumFromAnyNodeToAnyNode {
    static class Node{
        int data;
        Node left, right;
    }

    static Node newNode(int data){
        Node node = new Node();
        node.data = data;
        node.left = null;
        node.right = null;
        return node;
    }

    static class MinValue{
        int ans = Integer.MIN_VALUE;
    }

    static int maxPathSum(Node root){
        if(root == null){
            return 0;
        }
        MinValue res = new MinValue();
        int sum = maxPathSumAnTaN(root, res);
        return res.ans;
    }

    static int maxPathSumAnTaN(Node root, MinValue min){
        if(root == null){
            return 0;
        }
        int left = maxPathSumAnTaN(root.left,min);
        int right = maxPathSumAnTaN(root.right,min);

        int temp = Math.max(Math.max(left,right)+root.data, root.data);
        int res = Math.max(temp,left+right+root.data);
        min.ans = Math.max(res,min.ans);
        return temp;
    }

    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);

        System.out.println("Max Path sum = "+maxPathSum(root));
    }
}