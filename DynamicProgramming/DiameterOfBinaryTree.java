public class DiameterOfBinaryTree {
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

    static int diameter(Node root){
        if(root == null){
            return 0;
        }
        MinValue res = new MinValue();
        int hight = solve(root,res);
        return res.ans;
    }

    static int solve(Node root, MinValue min ){
        if(root == null){
            return 0;
        }

        int left = solve(root.left, min);
        int right = solve(root.right,min);

        int temp = Math.max(left,right) + 1;
        int res = Math.max(temp,left+right+1);
        
        min.ans = Math.max(res,min.ans);

        return temp;
    }

    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
       

        System.out.println("Diameter is " + diameter(root));
    }
}