
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
	
	public Node(T item, Node<T> left, Node<T> right)
	{
		this.item = item;
		leftChild = left;
		rightChild = right;
	}


	public Node<T> getLeftChild() {
		return leftChild;
	}


	public void setLeftChild(Node<T> leftChild) {
		this.leftChild = leftChild;
	}


	public Node<T> getRightChild() {
		return rightChild;
	}


	public void setRightChild(Node<T> rightChild) {
		this.rightChild = rightChild;
	}


	public T getItem() {
		return item;
	}


	public void setItem(T item) {
		this.item = item;
	}
	
	

}
