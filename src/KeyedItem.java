
public abstract class KeyedItem<KT extends Comparable<? super KT>> 
{
	private KT searchKey;
	
	public KeyedItem(KT item)
	{
		searchKey = item;
	}
	
	public KT getItem()
	{
		return searchKey;
	}
	
	
}
