package com.telusko.repo;

import org.springframework.stereotype.Repository;

@Repository
public class RepoLayer {

    public RepoLayer() {
        System.out.println("RepoLayer bean created");
    }
}
