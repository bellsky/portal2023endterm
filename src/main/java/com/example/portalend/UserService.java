package com.example.portalend;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
@Slf4j
public class UserService{

    private final UserRepository userRepository;

    public String signup(UserRequest request){
        userRepository.save(User.builder()
                .userId(request.getUserId())
                .password(request.getPassword())
                .userName(request.getUserName())
                .build());
        return "Success";
    }

    public String login(String userId, String password) {
        Optional<User> user = userRepository.findByUserId(userId);
        log.info("db password = {}, input password = {}", user.get().getPassword(), password);
        if(user.get().getPassword().equals(password)) {
            return "Success";
        }
        return "Failed";
    }
}