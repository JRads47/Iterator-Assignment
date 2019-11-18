//Iterator Assignment by Jay-Rads Villanueva
public class Song 
{
	public String name;
	public String artist;
	public double length;
	public String genre;
	public Song(String name, String artist, double length, String genre)
	{
		this.name=name;
		this.artist=artist;
		this.length=length;
		this.genre=genre;
	}
	public void print()
	{
		System.out.println(name+" by "+artist+" category: "+genre+" length: "+length+ " min");
	}
}
