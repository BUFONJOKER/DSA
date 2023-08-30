import java.util.*;
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

    // LEVEL-ORDER TRAVERSAL
    public static void levelOrderTraversal(Node root){
        
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        
        q.add(null);

        while(!q.isEmpty()){
            
            Node currentNode = q.remove();

            if( currentNode == null){
                
                System.out.println();

                if(q.isEmpty()){

                    break;
                }

                else{
                    q.add(null);
                }
                
            }

            else{

                System.out.print(currentNode.data + " ");

                if(currentNode.left != null){
                    q.add(currentNode.left);
                }

                if(currentNode.right != null){
                    q.add(currentNode.right);
                }
            }
        }
    }

    // COUNT OF NODES
    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;

    }


    public static void main(String[] args) {

        System.out.println();

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Node root = BinaryTree.buildTree(nodes);

        // System.out.println(root.data);

        // preOrderTraversal(root);

        // System.out.println();

        // inOrderTraversal(root);

        // postOrderTraversal(root);

        // levelOrderTraversal(root);

        System.out.println(countOfNodes(root));

        System.out.println();

        System.out.println();
    }
}