package com.kodilla.testing.forum.statistics;

public class StatsCalculator {
    Statistics statistics;
    public StatsCalculator(Statistics statistics) {
        this.statistics = statistics;

    }

    public Statistics calculateAdvStatistics() {
        double numberOfUsers = statistics.usersNames().size();
        double numberOfPosts = statistics.postsCount();
        double numberOfComments = statistics.commentsCount();
        double avgPostsPerUser = numberOfPosts/numberOfUsers;
        double avgCommentsPerUser = numberOfComments/numberOfUsers;
        double avgCommentsPerPost = numberOfComments/numberOfPosts;

        return statistics;
    }
}


