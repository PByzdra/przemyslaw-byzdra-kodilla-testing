package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatsTestSuite {


    @Test
    public void testForZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
        final int NUMBER_OF_COMMENTS = 10;
        final int NUMBER_OF_POSTS = 0;

        List<String> users = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            users.add("User_" + i);
        }


        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(NUMBER_OF_POSTS);
        when(statisticsMock.commentsCount()).thenReturn(NUMBER_OF_COMMENTS);

        //When

        statsCalculator.calculateAdvStatistics();

        //Then

        Assert.assertEquals(statsCalculator.getNumberOfPosts(), NUMBER_OF_POSTS, 1);
        Assert.assertEquals(statsCalculator.getNumberOfComments(), NUMBER_OF_COMMENTS, 1);
        Assert.assertEquals(statsCalculator.getNumberOfUsers(), users.size(), 1);
        Assert.assertEquals(statsCalculator.getAvgCommentsPerPost(), 0, 1);
        Assert.assertEquals(statsCalculator.getAvgCommentsPerUser(), NUMBER_OF_COMMENTS / users.size(), 1);
        Assert.assertEquals(statsCalculator.getAvgPostsPerUser(), NUMBER_OF_POSTS / users.size(), 1);
    }

    @Test
    public void testForThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
        final int NUMBER_OF_COMMENTS = 10;
        final int NUMBER_OF_POSTS = 1000;

        List<String> users = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            users.add("User_" + i);
        }


        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(NUMBER_OF_POSTS);
        when(statisticsMock.commentsCount()).thenReturn(NUMBER_OF_COMMENTS);

        //When

        statsCalculator.calculateAdvStatistics();

        //Then

        Assert.assertEquals(statsCalculator.getNumberOfPosts(), NUMBER_OF_POSTS, 1);
        Assert.assertEquals(statsCalculator.getNumberOfComments(), NUMBER_OF_COMMENTS, 1);
        Assert.assertEquals(statsCalculator.getNumberOfUsers(), users.size(), 1);
        Assert.assertEquals(statsCalculator.getAvgCommentsPerPost(), NUMBER_OF_COMMENTS / NUMBER_OF_POSTS, 1);
        Assert.assertEquals(statsCalculator.getAvgCommentsPerUser(), NUMBER_OF_COMMENTS / users.size(), 1);
        Assert.assertEquals(statsCalculator.getAvgPostsPerUser(), NUMBER_OF_POSTS / users.size(), 1);
    }

    @Test
    public void testForZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
        final int NUMBER_OF_COMMENTS = 0;
        final int NUMBER_OF_POSTS = 1000;

        List<String> users = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            users.add("User_" + i);
        }


        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(NUMBER_OF_POSTS);
        when(statisticsMock.commentsCount()).thenReturn(NUMBER_OF_COMMENTS);

        //When

        statsCalculator.calculateAdvStatistics();

        //Then

        Assert.assertEquals(statsCalculator.getNumberOfPosts(), NUMBER_OF_POSTS, 1);
        Assert.assertEquals(statsCalculator.getNumberOfComments(), NUMBER_OF_COMMENTS, 1);
        Assert.assertEquals(statsCalculator.getNumberOfUsers(), users.size(), 1);
        Assert.assertEquals(statsCalculator.getAvgCommentsPerPost(), NUMBER_OF_COMMENTS / NUMBER_OF_POSTS, 1);
        Assert.assertEquals(statsCalculator.getAvgCommentsPerUser(), NUMBER_OF_COMMENTS / users.size(), 1);
        Assert.assertEquals(statsCalculator.getAvgPostsPerUser(), NUMBER_OF_POSTS / users.size(), 1);
    }

    @Test
    public void testForNumberOfCommentsLessThanNumberOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
        final int NUMBER_OF_COMMENTS = 100;
        final int NUMBER_OF_POSTS = 500;

        List<String> users = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            users.add("User_" + i);
        }


        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(NUMBER_OF_POSTS);
        when(statisticsMock.commentsCount()).thenReturn(NUMBER_OF_COMMENTS);

        //When

        statsCalculator.calculateAdvStatistics();

        //Then

        Assert.assertEquals(statsCalculator.getNumberOfPosts(), NUMBER_OF_POSTS, 1);
        Assert.assertEquals(statsCalculator.getNumberOfComments(), NUMBER_OF_COMMENTS, 1);
        Assert.assertEquals(statsCalculator.getNumberOfUsers(), users.size(), 1);
        Assert.assertEquals(statsCalculator.getAvgCommentsPerPost(), NUMBER_OF_COMMENTS / NUMBER_OF_POSTS, 1);
        Assert.assertEquals(statsCalculator.getAvgCommentsPerUser(), NUMBER_OF_COMMENTS / users.size(), 1);
        Assert.assertEquals(statsCalculator.getAvgPostsPerUser(), NUMBER_OF_POSTS / users.size(), 1);
    }

    @Test
    public void testForNumberOfCommentsGreaterThanNumberOfPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
        final int NUMBER_OF_COMMENTS = 100;
        final int NUMBER_OF_POSTS = 50;

        List<String> users = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            users.add("User_" + i);
        }


        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(NUMBER_OF_POSTS);
        when(statisticsMock.commentsCount()).thenReturn(NUMBER_OF_COMMENTS);

        //When

        statsCalculator.calculateAdvStatistics();

        //Then

        Assert.assertEquals(statsCalculator.getNumberOfPosts(), NUMBER_OF_POSTS, 1);
        Assert.assertEquals(statsCalculator.getNumberOfComments(), NUMBER_OF_COMMENTS, 1);
        Assert.assertEquals(statsCalculator.getNumberOfUsers(), users.size(), 1);
        Assert.assertEquals(statsCalculator.getAvgCommentsPerPost(), NUMBER_OF_COMMENTS / NUMBER_OF_POSTS, 1);
        Assert.assertEquals(statsCalculator.getAvgCommentsPerUser(), NUMBER_OF_COMMENTS / users.size(), 1);
        Assert.assertEquals(statsCalculator.getAvgPostsPerUser(), NUMBER_OF_POSTS / users.size(), 1);
    }

    @Test
    public void testForZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
        final int NUMBER_OF_COMMENTS = 100;
        final int NUMBER_OF_POSTS = 50;

        List<String> users = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(NUMBER_OF_POSTS);
        when(statisticsMock.commentsCount()).thenReturn(NUMBER_OF_COMMENTS);

        //When

        statsCalculator.calculateAdvStatistics();

        //Then

        Assert.assertEquals(statsCalculator.getNumberOfPosts(), NUMBER_OF_POSTS, 1);
        Assert.assertEquals(statsCalculator.getNumberOfComments(), NUMBER_OF_COMMENTS, 1);
        Assert.assertEquals(statsCalculator.getNumberOfUsers(), users.size(), 1);
        Assert.assertEquals(statsCalculator.getAvgCommentsPerPost(), NUMBER_OF_COMMENTS / NUMBER_OF_POSTS, 1);
        Assert.assertEquals(statsCalculator.getAvgCommentsPerUser(), 0, 1);
        Assert.assertEquals(statsCalculator.getAvgPostsPerUser(), 0, 1);
    }

    @Test
    public void testForHundredUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
        final int NUMBER_OF_COMMENTS = 100;
        final int NUMBER_OF_POSTS = 50;

        List<String> users = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            users.add("User_" + i);
        }


        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(NUMBER_OF_POSTS);
        when(statisticsMock.commentsCount()).thenReturn(NUMBER_OF_COMMENTS);

        //When

        statsCalculator.calculateAdvStatistics();

        //Then

        Assert.assertEquals(statsCalculator.getNumberOfPosts(), NUMBER_OF_POSTS, 1);
        Assert.assertEquals(statsCalculator.getNumberOfComments(), NUMBER_OF_COMMENTS, 1);
        Assert.assertEquals(statsCalculator.getNumberOfUsers(), users.size(), 1);
        Assert.assertEquals(statsCalculator.getAvgCommentsPerPost(), NUMBER_OF_COMMENTS / NUMBER_OF_POSTS, 1);
        Assert.assertEquals(statsCalculator.getAvgCommentsPerUser(), NUMBER_OF_COMMENTS / users.size(), 1);
        Assert.assertEquals(statsCalculator.getAvgPostsPerUser(), NUMBER_OF_POSTS / users.size(), 1);
    }
}

