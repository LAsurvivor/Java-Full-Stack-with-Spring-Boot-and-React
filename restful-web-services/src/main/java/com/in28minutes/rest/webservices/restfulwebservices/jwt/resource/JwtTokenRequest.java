package com.in28minutes.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    
//    "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTY1OTQ1MjkxMiwiaWF0IjoxNjU4ODQ4MTEyfQ.7zfksUHMMI-CToxdj1E3r79DWTrOOYvvqcWqYroHdiskDIu4zq6xn8WzwVLdxztiasGAXFdZx7biCjjuJ6HlZg"

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

