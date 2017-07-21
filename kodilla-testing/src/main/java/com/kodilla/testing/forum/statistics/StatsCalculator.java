package com.kodilla.testing.forum.statistics;

public class StatsCalculator {
    private double numberOfUsers;
    private double numberOfPosts;
    private double numberOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

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
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public StatsCalculator(double numberOfUsers, double numberOfPosts, double numberOfComments,
                           double avgPostsPerUser, double avgCommentsPerUser,
                           double avgCommentsPerPost) {
        this.numberOfUsers = numberOfUsers;
        this.numberOfPosts = numberOfPosts;
        this.numberOfComments = numberOfComments;
        this.avgPostsPerUser = avgPostsPerUser;
        this.avgCommentsPerUser = avgCommentsPerUser;
        this.avgCommentsPerPost = avgCommentsPerPost;

    }

    Statistics statistics;

    public StatsCalculator() {
    }

    public void calculateAdvStatistics() {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        this.avgPostsPerUser = numberOfPosts / numberOfUsers;
        this.avgCommentsPerUser = numberOfComments / numberOfUsers;
        this.avgCommentsPerPost = numberOfComments / numberOfPosts;
    }
}


