package myProject;

import java.util.LinkedList;
import java.util.Queue;

public class checkSibilings {
	Node root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkSibilings tree = new checkSibilings(); 
		   
        /* Let us construct the tree shown in above diagram */
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
        
        System.out.println(checkSibling(tree.root , 4 , 5));
	}
	
	public static boolean checkSibling(Node root , int a , int b){
		
		if(root==null)
			return false;
		Queue<Node> que = new LinkedList();
		
		que.add(root);
		
		Node tmp;
		
		while(!que.isEmpty()){
			tmp = que.poll();
			
			if(tmp.left!=null ){
				que.add(tmp.left);
			}
			if(tmp.right!=null){
				que.add(tmp.right);
			}
			if(tmp.left!=null && tmp.right!=null){
				if(tmp.left.data==a || tmp.right.data==b){
					return true;
				}
			}
			
		}
		
		return false;
	}

}
