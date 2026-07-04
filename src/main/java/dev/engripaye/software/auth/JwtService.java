package dev.engripaye.software.auth;

import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.Key;

@Service
public class JwtService {

    private static final String SECRET = "this-is-a-very-long-secret-key-for-projecthub-authentication";

    private static final long EXPIRATION = 1000 * 60 * 60 * 24; // 24hours

    private Key getSigningKey(){
        return Keys.hmacShaKeyFor(
                SECRET.getBytes(StandardCharsets.UTF_8)
        );
    }






}
