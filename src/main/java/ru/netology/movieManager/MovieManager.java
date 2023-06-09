package ru.netology.movieManager;

public class MovieManager {
    private int limit = 10;

    public MovieManager() {
    }
    public MovieManager(int limit) {
        this.limit = limit;
    }
    private String[] movies = new String[0];
    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }
    public String[] findAll() {
        return movies;
    }
    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;

    }

}

