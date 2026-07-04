package dev.engripaye.software.auth;

import org.springframework.stereotype.Service;

@Service
public class JwtService {

    private static final String SECRET = "this-is-a-very-long-secret-key-for-projecthub-authentication";

    private static final long EXPIRATION = 1000 * 60 * 60 * 24;

    
}
