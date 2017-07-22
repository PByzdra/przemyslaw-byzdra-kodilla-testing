package com.kodilla.testing.forum.statistics;

public class StatsCalculator {

    Statistics statistics;

    public StatsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }
    public StatsCalculator() {

    }

    private double numberOfUsers;
    private double numberOfPosts;
    private double numberOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;



    public StatsCalculator(double numberOfUsers, double numberOfPosts, double numberOfComments ,
                           double avgPostsPerUser, double avgCommentsPerUser,
                           double avgCommentsPerPost) {
        this.numberOfUsers = numberOfUsers;
        this.numberOfPosts = numberOfPosts;
        this.numberOfComments = numberOfComments;
        this.avgPostsPerUser = avgPostsPerUser;
        this.avgCommentsPerUser = avgCommentsPerUser;
        this.avgCommentsPerPost = avgCommentsPerPost;

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
        return  numberOfComments / numberOfUsers;
    }

    public double getAvgCommentsPerPost() {
        return numberOfComments / numberOfPosts;
    }

    public void calculateAdvStatistics() {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
       // return statistics;
    }
}


