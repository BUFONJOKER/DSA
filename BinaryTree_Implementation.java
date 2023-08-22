public class BinaryTree_Implementation {
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

    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");

        preOrder(root.left);
        
        preOrder(root.right);
    
    }

    public static void main(String[] args) {

        System.out.println();

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node root = BinaryTree.buildTree(nodes);

        // System.out.println(root.data);

        preOrder(root);

        System.out.println();
    }
}