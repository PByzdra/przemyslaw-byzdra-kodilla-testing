package com.kodilla.testing.forum.statistics;

import org.junit.*;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatsTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
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
//        //Given
//        Statistics statisticsMock = mock(Statistics.class);
//        StatsCalculator statsCalculator = new StatsCalculator();
//
//        when(statisticsMock.postsCount()).thenReturn((int) statsCalculator.getNumberOfPosts());
//
//        //When
//        statsCalculator.calculateAdvStatistics();
//
//        //Then
//        Assert.assertEquals(statsCalculator.getNumberOfPosts(),statisticsMock.postsCount(), 0);
    }
//    @Test
//    public void testForThousandPosts() {
//        //Given
//        Statistics statisticsMock = mock(Statistics.class);
//        StatsCalculator statsCalculator = new StatsCalculator(2);
//        when(statisticsMock.postsCount()).thenReturn(1000);
//
//        //When
//        statsCalculator.calculateAdvStatistics(statisticsMock);
//
//        //Then
//        Assert.assertEquals(0/1000, statsCalculator.getAvgPostsPerUser(), 0.0 );
//    }
}
