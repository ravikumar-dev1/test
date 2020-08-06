package interfacedemo2;


//interfaces define rules/contract
public interface IMovie {
	public String getMovieName();
	public String getCategory();
	public String getLanguage();
	
	public default void dubbingMovie(String language){
		System.out.println("Can not dubbed movie into language " + language);
	}
}
