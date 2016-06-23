import java.io.IOException;

public abstract class BinarySearchTreeBase<T> {
	protected Node<T> root;

	public BinarySearchTreeBase(T rootItem)
	{
		this.root = new Node<T>(rootItem,null,null);
	}
	
	public BinarySearchTreeBase()
	{
		
	}
	
	public boolean isEmpty(){
		return root==null;
	}
	
	public void makeEmpty()
	{
		root=null;
	}

	public T getRootItem() throws IOException 
	{
		if(root==null)
		{
			System.err.println("Empty Tree");
			throw new IOException("Tree is Empty");
		}
		else
		{
			return root.getItem();
		}
		
	}

	public abstract void setRootItem(T item); 
		
	
	
}
