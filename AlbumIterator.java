//Iterator Assignment by Jay-Rads Villanueva
import java.util.Iterator;
public class AlbumIterator implements Iterator
{
	public Song[] song;
	public int position;
	
	public AlbumIterator(Song[] songs)
	{
		song=songs;
	}
	public boolean hasNext()
	{
		if(position>=song.length||song[position]==null)
		{return false;}
		else {return true;}
	}
	public Song next()
	{
		if(this.hasNext()==true)
		{
			Song s= song[position];
			position++;
			return s;
		}
		else
		{
			return null;
		}
	}
}
