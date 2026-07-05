package dev.engripaye.software.auth;

import dev.engripaye.software.user.User;
import dev.engripaye.software.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public AuthResponse login(LoginRequest loginRequest){
        User user = userRepository.findByEmail(loginRequest.email())
                .orElseThrow(() -> new RuntimeException("Invalid Email or password"));

        boolean passwordMatches = passwordEncoder.matches(
                loginRequest.password(),
                user.getPassword()
        );

        if(!passwordMatches) {
            throw new RuntimeException("Invalid email or Password ");
        }

        String token = jwtService.generateToken(user.getEmail());

        return new AuthResponse(token, "bearer");
    }
}
