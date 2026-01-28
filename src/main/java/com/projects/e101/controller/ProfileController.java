package com.projects.e101.controller;

import com.projects.e101.dto.CreateProfileRequest;
import com.projects.e101.dto.ProfileResponse;
import com.projects.e101.exception.UserNotFoundException;
import com.projects.e101.model.User;
import com.projects.e101.repository.UserRepository;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {
    private final UserRepository userRepository;
    public ProfileController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    private final Logger logger = LoggerFactory.getLogger(ProfileController.class);


    @PostMapping()
    public ProfileResponse createProfile(@Valid @RequestBody CreateProfileRequest request) {
        logger.info("Create profile request: {}", request.getAge(), request.getName());
        User user = new User();
        user.setName(request.getName());
        user.setAge(request.getAge());
        user.setCity(request.getCity());
        User savedUser = userRepository.save(user);

       return new ProfileResponse(savedUser.getId(), savedUser.getName(), savedUser.getAge(), savedUser.getCity());
    }
    @GetMapping("/{id}")
    public ProfileResponse getbyUserID(@PathVariable String id) {
        User user= userRepository.findById(id).orElseThrow(()->new UserNotFoundException("User not found"));
        return new ProfileResponse(user.getId(), user.getName(), user.getAge(), user.getCity());
    }
    @GetMapping
    public List<ProfileResponse> getUserByCityList(@RequestParam String city) {
        return userRepository.findByCity(city)
                .stream()
                .map(ProfileResponse::new)
                .toList(); // Java 16+




}}
