public class TestNode {
    public static void main(String[] args) {

        // Making all these sample nodes for testing [confirms all constructors work]

        Node testParentNode = new Node('H');
        Node testChildNode = new Node('Q');
        Node testNodeOne = new Node(2);
        Node testNodeTwo = new Node(2);
        Node testNodeThree = new Node("Hello World", testParentNode, testChildNode);

        //Accessor Checks

        System.out.print("Check Accessor 'getValue' (should print 'Hello World'): ");
        System.out.println(testNodeThree.getValue());

        System.out.println();

        System.out.print("Check Accessor 'getParentNode' (should print 'Node: H'): ");
        System.out.println(testNodeThree.getParentNode());

        System.out.println();

        System.out.print("Check Accessor 'getChildNode' (should print 'Node: Q'): ");
        System.out.println(testNodeThree.getChildNode());

        System.out.println();

        //Mutator Checks

        System.out.print("Check Mutator 'setValue' (should print 'Goodbye World'): ");
        testNodeThree.setValue("Goodbye World");
        System.out.println(testNodeThree.getValue());

        System.out.println();

        System.out.print("Check Mutator 'setParentNode' (should print 'Node: 2'): ");
        testNodeThree.setParentNode(testNodeOne);
        System.out.println(testNodeThree.getParentNode());

        System.out.println();

        System.out.print("Check Mutator 'setChildNode' (should print 'Node: 2'): ");
        testNodeThree.setChildNode(testNodeOne);
        System.out.println(testNodeThree.getChildNode());

        System.out.println();

        //Method Override Checks

        System.out.println("toString method is IMPLIED to work based on the success of previous code");

        System.out.println();

        System.out.print("Check Equals Method (should print 'true'): ");
        System.out.println(testNodeOne.equals(testNodeTwo));
    }
}
