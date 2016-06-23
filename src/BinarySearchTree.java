import java.io.IOException;

public class BinarySearchTree<T extends KeyedItem<KT>, KT extends Comparable<? super KT>> 
			 extends BinarySearchTreeBase<T>
{
	public BinarySearchTree(T root)
	{
		super(root);
	}
	
	public BinarySearchTree()
	{
		
	}
	public void setRootItem(T rootItem)
	{
		this.setRootItem(rootItem);
	}
	
	public void insert(T newItem)
	{
		root = insertHelper(root, newItem);
	}
	
	private Node<T> insertHelper(Node<T> node, T newItem)
	{
		Node<T> temp;
		if(node==null)
		{
			temp = new Node<T>(newItem);
			return temp;
		}
		
		T item = node.getItem();
		if(newItem.getItem().compareTo(item.getItem())<0)
		{
			temp = insertHelper(node.getLeftChild(), newItem);
			node.setLeftChild(temp);
			return node;
		}
		else
		{
			temp = insertHelper(node.getRightChild(), newItem);
			node.setRightChild(temp);
			return node;
		}
	}
	
	public int getHeight() throws IOException
	{
		int leftHeight = 1;
		int rightHeight = 1;
		if(root==null)
		{
			throw new IOException();
		}
		else if(root.getLeftChild()==null && root.getRightChild()==null)
		{
			return 0;
		}
		else
		{
			if(root.getLeftChild()!=null)
			{leftHeight += heightHelper(root.getLeftChild());}
			if(root.getRightChild()!=null){rightHeight += heightHelper(root.getRightChild());}
		}
		return leftHeight>rightHeight?leftHeight:rightHeight;
	}
	
	public int heightHelper(Node<T> node)
	{
		if(node.getLeftChild()==null && node.getRightChild()==null)
		{
			return 0;
		}
		else if(node.getLeftChild()!=null)
		{
			heightHelper(node.getLeftChild());
		}
		else if(node.getRightChild()!=null)
		{
			heightHelper(node.getRightChild());
		}
		return 1;
	}	
}
