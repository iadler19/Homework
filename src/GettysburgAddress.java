import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class GettysburgAddress {
	public static void main(String[] args)
	{
		Scanner file = new Scanner(new File("GettsburgAddress.txt"));
        // assume filename stores the name of the file 
while (file.hasNext()) 
{
	ArrayList<String> words = new ArrayList<String>();
 words.add(file.next());
}


	}

}
