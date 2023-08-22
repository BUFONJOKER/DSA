public class BinaryTree_Implementation {

    // BINARY TREE IMPLEMENTATION
    static class Node {
        
        int data;
        
        Node left;

        Node right;

        Node(int data) {
            
            this.data = data;
            
            left = null;
            
            right = null;
        }
    }

    static class BinaryTree {

        public static int index = -1;

        public static Node buildTree(int nodes[]) {

            index++;

            if (nodes[index] == -1) {
                return null;
            }

            
            Node newNode = new Node(nodes[index]);
            
            newNode.left = buildTree(nodes);
            
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
    }

    // PRE-ORDER TRAVERSAL
    public static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");

        preOrderTraversal(root.left);
        
        preOrderTraversal(root.right);
    
    }

    // IN-ORDER TRAVERSAL
    public static void inOrderTraversal(Node root){

        if(root == null){
            return;
        }

        inOrderTraversal(root.left);

        System.out.print(root.data + " ");

        inOrderTraversal(root.right);
    }

    // POST-ORDER TRAVERSAL

    public static void postOrderTraversal(Node root){

        if(root == null){
            return;
        }

        postOrderTraversal(root.left);

        postOrderTraversal(root.right);

        System.out.print(root.data + " ");

        
    }


    public static void main(String[] args) {

        System.out.println();

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node root = BinaryTree.buildTree(nodes);

        // System.out.println(root.data);

        // preOrderTraversal(root);

        // System.out.println();

        // inOrderTraversal(root);

        postOrderTraversal(root);

        System.out.println();

        System.out.println();
    }
}