package developer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * 
 * Amazon Written Test Program
 * @author Madhulika
 *
 */

public class Movie {
	
	private int movieId;
	private float rating;
	private List<Movie> similarMovies;
	
	public Movie(int movieId, float rating){
		this.movieId = movieId;
		this.rating = rating;
		similarMovies  = new ArrayList<Movie>();
	}
	
	public int getId(){
		return movieId;
	}

	public float getRating(){
		return rating;
	}
	
	public void addSimilarMovie(Movie movie){
		similarMovies.add(movie);
		movie.similarMovies.add(this);
	}
	
	public List<Movie> getSimilarMovies(){
		return similarMovies;
	}
	
	public  List<Movie> getMovieRecommendations(Movie movie, int numTopRatedSimilarMovies ){
		
		List<Movie> similarMovies= getSimilarMovies();
		Movie[] highestTopRatedMovie = new Movie[numTopRatedSimilarMovies];
		highestTopRatedMovie[0].rating = similarMovies.get(0).rating;
		highestTopRatedMovie[0].movieId = similarMovies.get(0).movieId;
		
		
		//loop each movie
		for(Movie eachMovie:similarMovies){
			if(eachMovie.getRating()>highestTopRatedMovie[numTopRatedSimilarMovies-1].rating){
				for(int i =highestTopRatedMovie.length;i>=0;  i--){
					if(eachMovie.getRating()>highestTopRatedMovie[i].rating&&eachMovie.getRating()<highestTopRatedMovie[i-1].rating ){
						highestTopRatedMovie[i] = eachMovie;
					}
					else if(eachMovie.getRating()>highestTopRatedMovie[i].rating&& i-1<0 ){
						highestTopRatedMovie[0] = eachMovie;
					}
						
				}
				
				highestTopRatedMovie[0]= eachMovie;
			}
			
			
		}
		return Arrays.asList(highestTopRatedMovie);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter MovieId");
		int c = input.nextInt();
		System.out.println("Enter number top rated similar movies");
		int n = input.nextInt();
		Movie bestMovie = new Movie(1,2);
		Movie bestMovie1 = new Movie(2,4);
		Movie bestMovie2 = new Movie(3,6);
		Movie bestMovie3 = new Movie(4,8);
		bestMovie.addSimilarMovie(bestMovie1);
		bestMovie.addSimilarMovie(bestMovie2);
		bestMovie.addSimilarMovie(bestMovie3);
		bestMovie.getMovieRecommendations(bestMovie, n);
	}

}
