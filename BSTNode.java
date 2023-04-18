/******************************************************************************************************************
* @Austin Dolan
* ICS 211
* BSTNode.java
* 4/6/2023
******************************************************************************************************************/

public class BSTNode implements BSTNodeI{
   //-------------------------------------------------------------------------
   //  Variables
   //------------------------------------------------------------------------- 
   private CD cd;
   private BSTNode leftChild;
   private BSTNode rightChild;
   
   //-------------------------------------------------------------------------
   //  Constructor: Each node has: cd, leftChild, rightChild 
   //------------------------------------------------------------------------- 
   public BSTNode(CD cd){
      this.cd = cd;
   }
   
   //-----------------------------------------------------------------
   // Constructor methods: getLeftChild, getRightChild, getCD
   //-----------------------------------------------------------------
   public BSTNode getLeftChild(){                           // Returns leftChild node
      return leftChild;
   }
   public BSTNode getRightChild(){                          // Returns rightChild node
      return rightChild;
   }
   public CD getCD(){                                       // Returns cd object data
      return cd;
   }
   
   //-----------------------------------------------------------------
   // Mutator methods: setLeftChild, setRightChild
   //----------------------------------------------------------------- 
   public void setLeftChild(BSTNode leftChild){             // Set this nodes left child
      this.leftChild = leftChild;
   }
   public void setRightChild(BSTNode rightChild){           // Set this nodes right child
      this.rightChild = rightChild;
   }
   
   //-----------------------------------------------------------------
   // toString method
   //-----------------------------------------------------------------
   public String toString() {                               // Access cd and call cd's toString method
      String s = this.getCD().toString();
      return s;
   }
}