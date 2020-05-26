package com.springboot.part4.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class GitApiServiceImpl implements GitApiService {
    RestTemplate restTemplate = new RestTemplate();
    String userResourceUrl = "https://api.github.com/";

    @Override
    public String getGitApiVersion() {
        ResponseEntity<String> response = restTemplate.getForEntity(userResourceUrl + "users/kagisorka", String.class);
        return response.toString();
    }

    @Override
    public String getAllGitRepos() {
        ResponseEntity<String> response = restTemplate.getForEntity(userResourceUrl + "users/kagisorka/repos", String.class);
        return response.toString();
    }

    @Override
    public String getCommits() {
        ResponseEntity<String> response = restTemplate.getForEntity(userResourceUrl + "repos/kagisorka/Dice/commits", String.class);
        return response.toString();
    }
}
