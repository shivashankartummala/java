package com.sstummala.codingproblems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class MovieRecomendation {
	public static void main(String[] args){
		Movie m1 = new Movie(1,1.2);
		Movie m2 = new Movie(2,2.4);
		Movie m3 = new Movie(3,3.6);
		Movie m4 = new Movie(4,4.5);
		Movie m5 = new Movie(5,2.8);
		
		m1.related.add(m2);		
		m1.related.add(m3);
		m2.related.add(m4);
		m3.related.add(m4);
		m4.related.add(m5);
		
		List<Movie> r = getRecomendaation(m1,2);
		for(Movie m:r){
			System.out.println("movie " + m.id +" of "+ m.rating + " rating");
		}
		
		
	}
	
	// Breadth First Search to get the list of N top rated movies in the movie graph. this excludes the input movie.
	public static List<Movie> getRecomendaation(Movie movie, int N){
		List<Movie> result = new ArrayList<Movie>();
		Queue<Movie> tovisit = new LinkedList<Movie>();
		HashSet<Movie> visisted = new HashSet<Movie>();
		
		PriorityQueue<Movie> pq = new PriorityQueue<Movie>(new Comparator<Movie>(){
			public int compare(Movie a , Movie b){
				return b.compareTo(a);
			}});
		tovisit.add(movie);
		
		while(!tovisit.isEmpty()){
			Movie cur = tovisit.remove();
			if(!visisted.contains(cur)){
				visisted.add(cur);
				System.out.println("processing" + cur.id);
				for(Movie m:cur.related){
					if(!tovisit.contains(m)){
						tovisit.add(m);
						pq.add(m);
						//System.out.println("current top :" + pq.peek().rating);

					}
				}
			}
		}
		for(int i=0;i<N;i++){
			result.add(pq.poll());
		}
		
		
		return result;
	}

}

class Movie{
	int id;
	double rating;
	List<Movie> related;
	
	public Movie(int id, double rating){
		this.id = id;
		this.rating = rating;
		this.related = new ArrayList<Movie>();
	}
	public int compareTo(Movie movie){
		if(this.rating>movie.rating)return 1;
		if(this.rating<movie.rating)return -11;
		else return 0;
	}
	
}