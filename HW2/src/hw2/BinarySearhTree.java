package hw2;

import java.util.ArrayList;

/**
 *
 * @author MERT
 */
public class BinarySearhTree<T> {

    public static int count = 0;


    private class Node {

        private Comparable<T> info;
        private Node left, right;

        public Node() {

        }

        public Node(Comparable<T> info, BinarySearhTree<T>.Node left, BinarySearhTree<T>.Node right) {
            this.info = info;
            this.left = left;
            this.right = right;
        }

        public Node(Comparable<T> info) {
            this.left = null;
            this.right = null;
            this.info = info;
        }
    }

    private Node root = null;

    private Node add(Node r, Comparable<T> x) {

        if (r != null) {
            if (x.compareTo((T) r.info) < 0) {
                r.left = add(r.left, x);
            } else if (x.compareTo((T) r.info) > 0) {
                r.right = add(r.right, x);
            }
        } else {
            r = new Node(x);
        }
        return r;

    }

    public void add(Comparable<T> x) {

        root = add(root, x);
    }

  	public  T findMaxValue() {
		if(root == null ) {
			return null;
		}
		Node node = root;
		while (node.right != null) {
			node = node.right;
		}
		return (T) node.info;
	}
 

    public void inOrder(Node root) {
        if (root != null) {
            System.out.print(root.info + " ");
            inOrder(root.left);
            inOrder(root.right);
        }
    }

    public void inOrder() {
        inOrder(root);
    }
// Asallık kontrolü
    static boolean prime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int countOfValue(Node r) {
        int s = 0;
        if (r == null) {
            return 0;
        }
        if (prime((Integer) r.info)) {
            s = (Integer) r.info + countOfValue(r.right) + countOfValue(r.left);

            return s;
        } else if (s > countOfValue(r.right) && s > countOfValue(r.left)) {
            count++;
        }
        return countOfValue(r.right) + countOfValue(r.left);
    }



    public int sumPrime() {
        return countOfValue(root);
    }

    public static void main(String agrs[]) {
        BinarySearhTree<Integer> bts = new BinarySearhTree<Integer>();
        bts.add(3);
        bts.add(2);
        bts.add(0);
        bts.add(29);
        bts.add(13);
        bts.add(5);
        bts.add(56);
        System.out.println("Binary Search Tree(BST)");
        bts.inOrder();
        System.out.println("\nBST de bulunan asal sayıların toplamı : " + bts.sumPrime());
        System.out.println("BST deki maximum değere sahip olan sayı : " +bts.findMaxValue());
        System.out.print("BST de bulunan asal sayıların toplamından büyük sayıların adedi: ");
        System.out.println(bts.findMaxValue() - bts.sumPrime() );
    }
}
