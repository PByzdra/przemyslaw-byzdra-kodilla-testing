package com.kodilla.stream.immutable;


public class Forum {
    private final String username;
    private final String realName;

    public Forum(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
