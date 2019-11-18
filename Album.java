//Iterator Assignment by Jay-Rads Villanueva
public class Album 
{
	public Song[] songs= new Song[20];
	public String name;
	private int count=0;
	
	public Album(String name)
	{
	}
	
	public void addSong(String name, String artist, double length, String genre)
	{
		if(count<20)
		{
			songs[count]=new Song(name, artist, length, genre);
			count++;
		}
	}
	public AlbumIterator createIterator()
	{
		return new AlbumIterator(songs);
	}
}
