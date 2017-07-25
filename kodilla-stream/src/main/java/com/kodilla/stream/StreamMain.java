package com.kodilla.stream;

import com.kodilla.stream.forum.Forum;
import com.kodilla.stream.forum.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
//
        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUsersList().stream()
                .filter (forumUser -> forumUser.getSex() == 'm' && forumUser.getAge() >= 20 && forumUser.getNumberOfPosts() != 0)
//                .filter(forumUser -> forumUser.getAge() >= 20)
//                .filter(forumUser -> forumUser.getNumberOfPosts() != 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey()
                        + ": " + entry.getValue())
                .forEach(System.out::println);


    }

}