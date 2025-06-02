package STU04_Java数据结构.STU04_5_二叉树;


public class Maintest {
    public static void main(String[] args) {
        TreeNode<Character> a =new TreeNode<>('A');
        TreeNode<Character> b =new TreeNode<>('b');
        TreeNode<Character> c =new TreeNode<>('C');
        TreeNode<Character> d =new TreeNode<>('D');
        TreeNode<Character> e =new TreeNode<>('E');

        a.left=b;
        a.right=c;
        b.left=d;
        b.right=e;

        System.out.println(a.left.left.element);
    }
    public static class TreeNode<T>{
        public T element;
        public TreeNode<T> left,right;
        public TreeNode(T element) {
            this.element = element;
        }
    }
}
