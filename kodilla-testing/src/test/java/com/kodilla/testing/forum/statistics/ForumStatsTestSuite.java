package com.kodilla.testing.forum.statistics;

import org.junit.*;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatsTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testForZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatsCalculator statsCalculator = new StatsCalculator(statisticsMock);
        final int NUMBER_OF_COMMENTS = 10;
        final int NUMBER_OF_POSTS = 10;

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
        if (NUMBER_OF_POSTS == 0) {
            double zero = 0;
            zero = statsCalculator.getNumberOfPosts();
            Assert.assertEquals(statsCalculator.getNumberOfPosts(), NUMBER_OF_POSTS, 1);
            Assert.assertEquals(statsCalculator.getNumberOfComments(), NUMBER_OF_COMMENTS, 1);
            Assert.assertEquals(statsCalculator.getNumberOfUsers(), users.size(), 1);
            Assert.assertEquals(zero, 0, 1);
            Assert.assertEquals(statsCalculator.getAvgCommentsPerUser(), NUMBER_OF_COMMENTS / users.size(), 1);
            Assert.assertEquals(statsCalculator.getAvgPostsPerUser(), NUMBER_OF_POSTS / users.size(), 1);

        } else {
            Assert.assertEquals(statsCalculator.getNumberOfPosts(), NUMBER_OF_POSTS, 1);
            Assert.assertEquals(statsCalculator.getNumberOfComments(), NUMBER_OF_COMMENTS, 1);
            Assert.assertEquals(statsCalculator.getNumberOfUsers(), users.size(), 1);
            Assert.assertEquals(statsCalculator.getAvgCommentsPerPost(), NUMBER_OF_COMMENTS / NUMBER_OF_POSTS, 1);
            Assert.assertEquals(statsCalculator.getAvgCommentsPerUser(), NUMBER_OF_COMMENTS / users.size(), 1);
            Assert.assertEquals(statsCalculator.getAvgPostsPerUser(), NUMBER_OF_POSTS / users.size(), 1);
        }
    }
}
