import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main 
{	
	public static void main(String[] args) throws Exception
	{
		boolean running = true;
		String[] menuOptions = {"1","2","3"};
		File errorLog = new File("err");
		FileOutputStream fileOutStream = new FileOutputStream(errorLog,true);
		PrintStream errPrintStream = new PrintStream(fileOutStream,true);
		System.setErr(errPrintStream);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BinarySearchTree<Data,String> BST = new BinarySearchTree<Data,String>();

		System.out.println("Binary tree operations:");
		System.out.println("\t1: Add item to tree");
		System.out.println("\t2: Get tree height");
		System.out.println("\t3: Remove an item from tree");
		
		while(running){
			System.out.println("Select an operation: " );
			try{
			String in = br.readLine();
				
			
			if(!Arrays.stream(menuOptions).anyMatch(in::equals))
			{
				throw new Exception();
			}		
			switch(in)

			{				
			case "1": System.out.println("Enter a string to insert into the tree");
						BST.insert(new Data(br.readLine()));
						break;
			case "2": System.out.println("Height:" + BST.getHeight());
						break;
			case "3": System.out.println("Enter a tree item to remove.");
			default:  System.out.println("Something went wrong, try again.");
						errPrintStream.println("Something went wrong, try again.");
						errPrintStream.println(LocalDateTime.now().toString());
						errPrintStream.print(System.lineSeparator());
						System.out.println("ERROR");
						break;
			}
			}
			catch(Exception e)
			{
				System.out.println("You can only enter values that appear in the list");
				errPrintStream.println("You can only enter values that appear in the list");
				errPrintStream.print(System.lineSeparator());
			}
		
		}

	}			
}
