package rsmciftci;


import rsmciftci.creationalpatterns.builder.first.User;

public class Main {
    public static void main(String[] args){

        // Building a User
        User user1 = new User.UserBuilder("Rasim","Çiftçi")
                .phone("541")
                .build();

        System.out.println(user1);


    }
}



