
public class Data<KT extends Comparable<? super KT>>  extends KeyedItem 
{
	private KT item;
	
	public Data(KT item)
	{
		super(item);
	}

}
