package com.kodilla.stream;

import com.kodilla.stream.forum.Forum;
import com.kodilla.stream.forum.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();

        ForumUser forumUser1 = new ForumUser(002,"MickeyMouse", 'm',
                    1977, 5, 11, 10);
        ForumUser forumUser2 = new ForumUser(003,"Dangerous", 'f',
                    2000, 3, 23, 0);
        ForumUser forumUser3 = new ForumUser(004,"IronMan", 'm',
                    1989, 11, 3, 5);
        ForumUser forumUser4 = new ForumUser(005,"SuperWoman", 'f',
                    2001, 2, 9, 142);
        ForumUser forumUser5 = new ForumUser(006,"MadameB", 'f',
                    1996, 7, 5, 15);
        ForumUser forumUser6 = new ForumUser(007,"Rambo8", 'm',
                    2001, 7, 14, 0);
        ForumUser forumUser7 = new ForumUser(001,"JohnnyD", 'm',
                1990, 10, 4, 23);

        forum.addForumUser(forumUser1);
        forum.addForumUser(forumUser2);
        forum.addForumUser(forumUser3);
        forum.addForumUser(forumUser4);
        forum.addForumUser(forumUser5);
        forum.addForumUser(forumUser6);
        forum.addForumUser(forumUser7);

        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUsersList().stream()
                .filter (forumUser -> forumUser.getSex() == 'm')
                .filter (forumUser -> LocalDate.now().getYear() - forumUser.getDateOfBirth().getYear() >= 20)
                .filter (forumUser -> forumUser.getNumberOfPosts() >  0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey()
                        + ": " + entry.getValue())
                .forEach(System.out::println);
    }

}