package abstraction;

public class ImageSearch extends Google {

	public void search()
	{
		System.out.println("In Image Search");
	}
	public static void main(String[] args)
	{
		ImageSearch img = new ImageSearch();
		img.display();
		img.search();
			
	}
}

