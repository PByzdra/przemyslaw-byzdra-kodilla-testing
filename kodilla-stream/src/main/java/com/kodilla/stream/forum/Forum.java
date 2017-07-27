package com.kodilla.stream.forum;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser>theUsersList = new ArrayList<>();

        public List<ForumUser> getUsersList() {
            return new ArrayList<>(theUsersList);
        }


    public void addForumUser(ForumUser forumUser) {
            theUsersList.add(forumUser);
        }

}
