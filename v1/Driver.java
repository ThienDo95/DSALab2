package v1;
import java.io.*;

public class Driver
{
	static BufferedReader stdin = new BufferedReader ( new  InputStreamReader (System.in));
	
	public static void main(String[] args) throws IOException
	{
		int i;
		ListArrayBasedPlus labp = new ListArrayBasedPlus();
		ListArrayListBasedPlus lalbp = new ListArrayListBasedPlus();
		
		do
		{
			System.out.println("\n"+"Application's Options: ");
			System.out.println("                       ");
			System.out.println("1. Insert item to list");
			System.out.println("2. Remove item from list");
			System.out.println("3. Get item from list");
			System.out.println("4. Clear list");
			System.out.println("5. Print size and content of list");
			System.out.println("6. Reverse list");
			System.out.println("7. Exit Program");
			System.out.println("                       ");
			System.out.println("Choose your option: " + "\n");
			String input = stdin.readLine().trim();
			i = Integer.parseInt(input);
			
			if (i > 0 && i < 7)
			{
				switch(i)
				{
					case 1:
						System.out.println("You are now inserting an item into the list.");
						System.out.println("Enter item:");
						String item = stdin.readLine().trim();
						System.out.println("Enter position to insert item in:");
						String position = stdin.readLine().trim();
						int p = Integer.parseInt(position);
						if (labp.numItems == labp.items.length)
						{
							labp.add(p, item);
							System.out.println("Item " + item + " inserted in position " + p + " in the list");
						}
						else if ((p >= 0 && p <= labp.numItems) && (labp.numItems != labp.items.length))
						{
							labp.add(p, item);
							System.out.println("Item " + item + " inserted in position " + p + " in the list");
						}
						else
						{
							System.out.println("Input of position is out of bound");
						}
					break;
					case 2:
						System.out.println("Select the index of an item you want to remove: ");
						String c2 = stdin.readLine().trim();
						int p2  = Integer.parseInt(c2);
						if (p2 > labp.items.length -1 || p2 < 0)
						{
							System.out.println("Your input is out of bound");
						}
						else
						{
							labp.remove(p2);
						}
						break;
					case 3:
						System.out.println("Select the index of an item you want to get: ");
						String c3 = stdin.readLine().trim();
						int p3  = Integer.parseInt(c3);
						if (p3 > labp.items.length -1 || p3 < 0)
						{
							System.out.println("Your input is out of bound");
						}
						else
						{
							System.out.println( p3 + ". "+labp.get(p3));
						}
						break;
					case 4:
						labp.removeAll();
						System.out.println("List has been cleared");
						break;
					case 5:
						if(labp.isEmpty())
						{	
							System.out.println("List is empty");
						}
						else
						{
							System.out.println("Your list has: " + labp.size() +" item(s)");
							System.out.println(labp.toString());
						}
						break;
					case 6:
						labp.reverse();
						break;
				}
			}
			else if ( i == 7)
			{
				System.out.println("You are now exited the application");
				break;
			}
			else 
			{
				System.out.println("No such option exists for " + i );
			}
		}while(i < 7 || i > 7);
	}
}
