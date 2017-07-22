package com.kodilla.testing.forum.statistics;

public class StatsCalculator {

    private Statistics statistics;
    private double numberOfUsers;
    private double numberOfPosts;
    private double numberOfComments;

    public StatsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public double getNumberOfUsers() {
        return numberOfUsers;
    }

    public double getNumberOfPosts() {
        return numberOfPosts;
    }

    public double getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvgPostsPerUser() {
        return numberOfPosts / numberOfUsers;
    }

    public double getAvgCommentsPerUser() {
        return numberOfComments / numberOfUsers;
    }

    public double getAvgCommentsPerPost() {

        return numberOfComments /numberOfPosts;
    }

    public void calculateAdvStatistics() {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
    }
}


