/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

/**
 *
 * @author MERT
 */
public class Tree <E> {
	private class Node{
		private E info;
		private Node left, right;
		public Node(E info) {
			this.info = info;
			this.left = this.right = null;
		}
		public Node(E info , Node l, Node r) {
			this.info = info;
			this.left = l;
			this.right =r;
		}
		
	}
	public Node root= null;

	
}