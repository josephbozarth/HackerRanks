   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
      Queue<Node> queue = new LinkedList<>();
       queue.add(root);
       Node child;
       while((child = queue.poll()) != null){
           if(child.left != null){
               queue.add(child.left);
           }
           if(child.right != null){
               queue.add(child.right);
           }
           System.out.print(child.data + " ");
       }
      
    }
