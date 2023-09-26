public class Node<T> {

    // Instance Data

    private Node parentNode;
    private Node childNode;
    private T value;

    // CONSTRUCTORS :D

    // Default "Empty" Constructor
    public Node(){
        parentNode = null;
        childNode = null;
        value = null;
    }

    // 1 Input Constructor
    public Node(T valueInput){
        this.value = valueInput;
        parentNode = null;
        childNode = null;
    }

    // 3 Input Constructor
    public Node(T valueInput, Node parentNodeInput, Node childNodeInput){
        this.value = valueInput;
        this.parentNode = parentNodeInput;
        this.childNode = childNodeInput;
    }

    // ACCESSORS :)

    public Node getParentNode(){
        return parentNode;
    }

    public Node getChildNode(){
        return childNode;
    }

    public T getValue(){
        return value;
    }

    // MUTATORS :/

    public void setParentNode(Node newParentNode){
        parentNode.equals(newParentNode);
    }

    public void setChildNode(Node newChildNode){
        childNode.equals(newChildNode);
    }

    public void setValue(T newValue){
        value.equals(newValue);
    }

    // Method Overrides

    public String toString(){
        return "Node: " + value;
    }

    public boolean equals(Node passingNode){
        if (this.getValue() == passingNode.getValue()){
            return true;
        } return false;
    }
}
