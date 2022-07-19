package abstraction;

public class VideoSearch extends Google {

	public void search()
	{
		System.out.println("In Video Search");
	}
	public static void main(String[] args)
	{
		VideoSearch v = new VideoSearch();
		v.display();
		v.search();
		
	}
}
