public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);
        tree.insert(4);
        tree.insert(7);
        tree.insert(9);

        tree.inOrder();

        tree.remove(3);
        tree.remove(5);
        System.out.println();
        tree.inOrder();
    }
}