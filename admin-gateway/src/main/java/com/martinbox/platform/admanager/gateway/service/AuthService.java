package com.martinbox.platform.admanager.gateway.service;


public interface AuthService {
    String login(String clientId, String secret);
    String refresh(String oldToken);
    Boolean validate(String token, String resource);
}
