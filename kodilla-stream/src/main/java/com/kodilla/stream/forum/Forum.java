package com.kodilla.stream.forum;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser>theUsersList = new ArrayList<>();
        public Forum() {
            theUsersList.add(new ForumUser(001,"JohnnyD", 'm',
                    1990, 10, 4, 23));
            theUsersList.add(new ForumUser(002,"MickeyMouse", 'm',
                    1977, 5, 11, 10));
            theUsersList.add(new ForumUser(003,"Dangerous", 'f',
                    2000, 3, 23, 0));
            theUsersList.add(new ForumUser(004,"IronMan", 'm',
                    1989, 11, 3, 5));
            theUsersList.add(new ForumUser(005,"SuperWoman", 'f',
                    2001, 2, 9, 142));
            theUsersList.add(new ForumUser(006,"MadameB", 'f',
                    1996, 7, 5, 15));
            theUsersList.add(new ForumUser(007,"Rambo8", 'm',
                    2001, 7, 14, 0));

        }
        public List<ForumUser> getUsersList() {
            return new ArrayList<>(theUsersList);
        }
}
