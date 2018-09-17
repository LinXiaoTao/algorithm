package com.leo.structure.tree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {

    private final BinaryTree<String> binaryTree = new BinaryTree<>();

    @Before
    public void fill() {
        binaryTree.addRootNode("M");
        binaryTree.addChildNode(0,"G","S");
        binaryTree.addChildNode(1,"D","J");
        binaryTree.addChildNode(2,"P","W");
        binaryTree.addChildNode(3,"B","F");
        binaryTree.addChildNode(4,"H","K");
        binaryTree.addChildNode(5,"O","Q");
        binaryTree.addChildNode(6,"U","X");
        binaryTree.addChildNode(7,"A","C");
        binaryTree.addLeftNode(8,"E");
        binaryTree.addRightNode(9,"I");
        binaryTree.addRightNode(10,"L");
        binaryTree.addLeftNode(11,"N");
        binaryTree.addRightNode(12,"R");
        binaryTree.addChildNode(13,"T","V");
        binaryTree.addRightNode(14,"Z");
        binaryTree.addLeftNode(30,"Y");
    }


    @Test
    public void testBasic() {
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.addRootNode(2);
        binaryTree.addChildNode(0,4,3);
        binaryTree.addChildNode(1,7,1);
        binaryTree.addChildNode(2,19,20);
        Assert.assertEquals(binaryTree.getNode(0), Integer.valueOf(2));
        Assert.assertEquals(binaryTree.getNode(3), Integer.valueOf(7));
        Assert.assertEquals(binaryTree.getNode(5), Integer.valueOf(19));
        Assert.assertNull(binaryTree.getNode(7));
        Assert.assertEquals(binaryTree.getLeftNode(0), Integer.valueOf(4));
        Assert.assertEquals(binaryTree.getRightNode(0), Integer.valueOf(3));
        Assert.assertEquals(binaryTree.getLeftNode(2), Integer.valueOf(19));
        Assert.assertEquals(binaryTree.getRightNode(2), Integer.valueOf(20));
        Assert.assertEquals(binaryTree.getParentNode(4), Integer.valueOf(4));
        Assert.assertEquals(binaryTree.getParentNode(5), Integer.valueOf(3));
        Assert.assertEquals(binaryTree.getParentNode(1), Integer.valueOf(2));
        Assert.assertTrue(binaryTree.hasLeftNode(2));
        Assert.assertFalse(binaryTree.hasLeftNode(5));
    }

    @Test
    public void testPreOrderVisit() {
        String[] expecteds = {"M","G","D","B","A","C","F","E","J","H","I","K","L","S","P","O","N","Q","R","W","U","T","V","X","Z","Y"};
        String[] actuals = new String[binaryTree.size()];
        binaryTree.preOrderVisit().toArray(actuals);
        Assert.assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testMediumOrderVisit() {
        String[] expecteds = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] actuals = new String[binaryTree.size()];
        binaryTree.mediumOrderVisit().toArray(actuals);
        Assert.assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testPostOrderVisit() {
        String[] expecteds = {"A","C","B","E","F","D","I","H","L","K","J","G","N","O","R","Q","P","T","V","U","Y","Z","X","W","S","M"};
        String[] actuals = new String[binaryTree.size()];
        binaryTree.postOrderVisit().toArray(actuals);
        Assert.assertArrayEquals(expecteds, actuals);
    }
}