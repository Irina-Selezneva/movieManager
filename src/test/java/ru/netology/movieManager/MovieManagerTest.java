package ru.netology.movieManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    MovieManager manager = new MovieManager();

    @Test
    public void addMoviesBelowLimit() {

        manager.add("Name1");
        manager.add("Name2");
        manager.add("Name3");

        String[] expected = {"Name1", "Name2", "Name3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addMoviesEqualLimit() {
        manager.add("Name1");
        manager.add("Name2");
        manager.add("Name3");
        manager.add("Name4");
        manager.add("Name5");
        manager.add("Name6");
        manager.add("Name7");
        manager.add("Name8");
        manager.add("Name9");
        manager.add("Name10");

        String[] expected = {"Name1", "Name2", "Name3", "Name4", "Name5", "Name6", "Name7", "Name8", "Name9", "Name10"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addMoviesOverLimit() {
        manager.add("Name1");
        manager.add("Name2");
        manager.add("Name3");
        manager.add("Name4");
        manager.add("Name5");
        manager.add("Name6");
        manager.add("Name7");
        manager.add("Name8");
        manager.add("Name9");
        manager.add("Name10");
        manager.add("Name11");


        String[] expected = {"Name1", "Name2", "Name3", "Name4", "Name5", "Name6", "Name7", "Name8", "Name9", "Name10", "Name11"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShowMoviesQuantityBelowLimitReverseOrder() {
        manager.add("Name1");
        manager.add("Name2");
        manager.add("Name3");

        String[] expected = {"Name3", "Name2", "Name1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShowMoviesQuantityEqualLimitReverseOrder() {
        manager.add("Name1");
        manager.add("Name2");
        manager.add("Name3");
        manager.add("Name4");
        manager.add("Name5");
        manager.add("Name6");
        manager.add("Name7");
        manager.add("Name8");
        manager.add("Name9");
        manager.add("Name10");

        String[] expected = {"Name10", "Name9", "Name8", "Name7", "Name6", "Name5", "Name4", "Name3", "Name2", "Name1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShowMoviesQuantityOverLimitReverseOrder() {
        manager.add("Name1");
        manager.add("Name2");
        manager.add("Name3");
        manager.add("Name4");
        manager.add("Name5");
        manager.add("Name6");
        manager.add("Name7");
        manager.add("Name8");
        manager.add("Name9");
        manager.add("Name10");
        manager.add("Name11");

        String[] expected = {"Name11", "Name10", "Name9", "Name8", "Name7", "Name6", "Name5", "Name4", "Name3", "Name2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShowMoviesQuantityBelowChangedLimitReverseOrder() {
        MovieManager manager = new MovieManager(5);
        manager.add("Name1");
        manager.add("Name2");
        manager.add("Name3");

        String[] expected = {"Name3", "Name2", "Name1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void ShowMoviesQuantityEqualChangedLimitReverseOrder() {
        MovieManager manager = new MovieManager(5);
        manager.add("Name1");
        manager.add("Name2");
        manager.add("Name3");
        manager.add("Name4");
        manager.add("Name5");

        String[] expected = {"Name5", "Name4", "Name3", "Name2", "Name1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShowMoviesQuantityOverChangedLimitReverseOrder() {
        MovieManager manager = new MovieManager(5);
        manager.add("Name1");
        manager.add("Name2");
        manager.add("Name3");
        manager.add("Name4");
        manager.add("Name5");
        manager.add("Name6");
        manager.add("Name7");
        manager.add("Name8");
        manager.add("Name9");
        manager.add("Name10");
        manager.add("Name11");

        String[] expected = {"Name11", "Name10", "Name9", "Name8", "Name7"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    }

