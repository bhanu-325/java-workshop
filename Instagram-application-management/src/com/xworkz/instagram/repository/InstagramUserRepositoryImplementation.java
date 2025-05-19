package com.xworkz.instagram.repository;

import com.xworkz.instagram.things.InstagramUserDetails;

public class InstagramUserRepositoryImplementation implements InstagramUserRepository {
    private InstagramUserDetails[] listOfUsers = new InstagramUserDetails[3];
    private int index = 0;

    @Override
    public void saveUserDetails(InstagramUserDetails details) {
        System.out.println("details:" + details);
        if (this.index < listOfUsers.length) {
            System.out.println("we can save the details");
            listOfUsers[this.index] = details;
            this.index++;
            System.out.println("saved successfully");
        } else {
            System.err.println("array is full we can't save the data");
        }
    }

    @Override
    public void readInstagramUsers() {
        System.out.println("reading instagram user details!!");
        for (InstagramUserDetails details : listOfUsers) {
            System.out.println("user details:" + details);
        }
    }

    @Override
    public void findUserDetails(String name) {
        System.out.println("find user details method invoked");
        for (int i = 0; i < listOfUsers.length; i++) {
            if (listOfUsers[i].getName().equalsIgnoreCase(name)) {
                System.out.println("user is present");
                System.out.println("details are:" + listOfUsers[i]);
            }
        }
    }

    public void findUserDetails(String name, String email) {
        System.out.println("find user details methods invoked"+name+","+email);
        for (int i = 0; i < listOfUsers.length; i++) {
            if (listOfUsers[i].getName().equalsIgnoreCase(name)
                    && listOfUsers[i].getEmail().equalsIgnoreCase(email)) {
                System.out.println("user is present");
                System.out.println("user details are:" + listOfUsers[i].toString());
            }
        //    else {
          //      System.out.println("user is not present");
            //}
        }
    }
}
