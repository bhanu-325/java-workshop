package com.xworkz.instagram.runner;

import com.xworkz.instagram.repository.InstagramUserRepository;
import com.xworkz.instagram.repository.InstagramUserRepositoryImplementation;
import com.xworkz.instagram.things.InstagramUserDetails;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InstagramRunner {
    public static void main(String[] args){
        InstagramUserDetails instagramUserDetails = new InstagramUserDetails();
        instagramUserDetails.setName("Bhanu");
        instagramUserDetails.setEmail("Bhanu@gmail.com");
        instagramUserDetails.setDateOfBirth(LocalDate.of(2006,12,21));
        instagramUserDetails.setCreatedOn(LocalDateTime.now());
        System.out.println(instagramUserDetails.toString());
        InstagramUserDetails user1 = new InstagramUserDetails();
        user1.setName("Bhavya");
        user1.setEmail("Bhavya@gmail.com");
        user1.setDateOfBirth(LocalDate.of(2006,12,21));
        user1.setCreatedOn(LocalDateTime.now());
        System.out.println(user1.toString());
        InstagramUserDetails user2 = new InstagramUserDetails();
        user2.setName("vandana");
        user2.setEmail("vandana@gmail.com");
        user2.setDateOfBirth(LocalDate.of(2006,12,21));
        user2.setCreatedOn(LocalDateTime.now());
        System.out.println(user2.toString());
        System.out.println("welcome to instagram!!!!");
        InstagramUserRepository repo = new InstagramUserRepositoryImplementation();
        repo.saveUserDetails(instagramUserDetails);
        repo.saveUserDetails(user1);
        repo.saveUserDetails(user2);
        repo.saveUserDetails(instagramUserDetails);
        repo.saveUserDetails(instagramUserDetails);
        repo.readInstagramUsers();
        repo.findUserDetails("Bhanu","Bhanu@gmail.com");
    }
}
