public class Main {
    public static class Node
{       
        int choice; //1 is player chose yes (left), and 0 is player chose no (right)
        String question;
        Node left;
        Node right;
        public Node(String question, int choice)
        {
            this.question = question;
            this.left = null;
            this.right = null;
        }
    }
    public Node insert(Node node, String value, int chosen){
        if(node==null){
        //root question
            return new Node(value, 1);
        }
        if(chosen >= node.choice){
            //
            node.left = insert(node.left, value, 1);
        }
        else if(chosen <= node.choice){
            node.right=insert(node.right, value, 1);
        }
        return node;
    }
    public void ask(Node node){

    }
    public static void main(String[] args){

    Main tree = new Main();
    tree.insert(null, "Is your animal a mammal?", 1);
    tree.insert(null,"I guess a bird!", 0);
    tree.insert(null, "Is your animal a pet?", 1);
    tree.insert(null, "I guess an elephant!", 0);
    tree.insert(null, "", chosen: 1);
    }  

}
