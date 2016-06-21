
public class Node<T> {
	private Node<T> leftChild;
	private Node<T> rightChild;
	private T item;

	
	public Node(T item)
	{
		this.item = item;
		leftChild = null;
		rightChild = null;
	}
	
	public Node(T item, Node left, Node right)
	{
		this.item = item;
		leftChild = left;
		rightChild = right;
	}


	public Node getLeftChild() {
		return leftChild;
	}


	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}


	public Node getRightChild() {
		return rightChild;
	}


	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}


	public T getItem() {
		return item;
	}


	public void setItem(T item) {
		this.item = item;
	}
	
	

}
