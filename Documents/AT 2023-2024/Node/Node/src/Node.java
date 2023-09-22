public class Node<T> {

    // Instance Data

    private Node parentNode;
    private Node childNode;
    private T value;

    // CONSTRUCTORS :D

    // Default "Empty" Constructor
    public Node(){
    }

    // 1 Input Constructor
    public Node(T value){
        this.value = value;
    }

    // 3 Input Constructor
    public Node(T value, Node parentNodeInput, Node childNodeInput){
        this.value = value;
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

    //
}
