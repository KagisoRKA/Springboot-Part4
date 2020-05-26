package com.springboot.part4.service;

public interface GitApiService {
    String getGitApiVersion();
    String getAllGitRepos();
    String getCommits();
}
