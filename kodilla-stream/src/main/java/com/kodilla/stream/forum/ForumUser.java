package com.kodilla.stream.forum;

import java.time.LocalDate;
import java.time.Period;

public class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;


    public ForumUser(final int userId, final String userName, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int numberOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth,dayOfBirth);
        this.numberOfPosts = numberOfPosts;

    }
    LocalDate today = LocalDate.now();
    Period p = Period.between(getDateOfBirth(), today);

    public int getAge() {
        return p.getYears();
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {

        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }


    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }

    @Override
    public int hashCode() {
        return dateOfBirth.getYear() * 100 + dateOfBirth.getMonthValue();
    }

}
