/******************************************************************************************************************
* @Austin Dolan
* ICS 211
* CDBST.java
* 4/6/2023
******************************************************************************************************************/

public class CDBST implements CDBSTI{
   //-------------------------------------------------------------------------
   //  Variables
   //-------------------------------------------------------------------------  
   private BSTNode root = null;
   
   //-------------------------------------------------------------------------
   //  Constructor
   //------------------------------------------------------------------------- 
   public CDBST(){

   }
   
   //-------------------------------------------------------------------------
   //  Adds a CNode and returns true if added and false if not
   //------------------------------------------------------------------------- 
   public boolean addNode(CD cd){                              // Method takes cd as a parameter
      BSTNode node = new BSTNode(cd);                          // Create new node with cd
      if(root==null){                                          // If root is null set root to new node
         root = node;
         return true;
      }
      else                                                     // Else run Overloaded addNode(root, node)
         return addNode(root, node);
   }
   private boolean addNode(BSTNode root, BSTNode node){        // Overloaded method takes root and node as parameter
      if(node.getCD().compareTo(root.getCD())<0){              // If cd price is less than root cd price will return -1
         if(root.getLeftChild()==null){                        // Check if root's left child is null
            root.setLeftChild(node);
            return true;
         }
         else                                                  // Else run recursively on leftChild
            return addNode(root.getLeftChild(), node);
      }
      else if(node.getCD().compareTo(root.getCD())>0){         // If cd price is more than root cd price will return 1
         if(root.getRightChild()==null){                       // Check if root's right child is null
            root.setRightChild(node);
            return true;
         }
         else                                                  // Else run recursively on rightChild
            return addNode(root.getRightChild(), node);
      }
      else                                                     // Cd price is equal to root cd price returned 0 so its duplicate
         return false;
   }
   
   //-------------------------------------------------------------------------
   //  Finds a BSTNode and returns true if found false if not
   //-------------------------------------------------------------------------    
   public boolean findNode(CD cd){                             // Method searches for cd in BST
      return findNode(root, cd);                               // Run overloaded method with root and cd as parameters
   }
   private boolean findNode(BSTNode root, CD cd){              // Overloaded method looks for cd starting with root
      if(root == null){                                        // If root is null BST is empty/recursive call has reached a null node
         return false;                                         
      }
      else if(cd.equals(root.getCD())){                        // If cd artist is the same as root artist return true
         return true;
      }
      else if(cd.compareTo(root.getCD())<0){                   // If price is less than root look to the left
         return findNode(root.getLeftChild(), cd);             // Recursively check node to the left of root
      }
      else{                                                    // Else price is more than root look to the right
         return findNode(root.getRightChild(), cd);            // Recursively check node to the right of root
      }
   }
   
   //-------------------------------------------------------------------------
   //  Prints BST in inorder traversal using recursion
   //-------------------------------------------------------------------------   
   public void printBSTree(BSTNode root){                      // Overloaded method: Display all nodes recursively
      if(root != null){
         printBSTree(root.getLeftChild());
         System.out.println(root + "\n");
         printBSTree(root.getRightChild());
      }
   }
   public void printBSTree(){                                  // Method in driver to display all nodes
      printBSTree(root);
   }
}