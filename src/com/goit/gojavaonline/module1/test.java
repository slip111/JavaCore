package com.goit.gojavaonline.module1;

public class test {
    public static void main(String[] args){
        jedi darth = new jedi("Darth Vader 1", 2, false);
        String userName = "Darth Vader";
        int childrenNumber = 2;
        boolean isOnDarkSide = true;


        float f = 42.0f;
        System.out.println(userName);
        System.out.println(childrenNumber);
        System.out.println(isOnDarkSide);
        System.out.println(darth.getUserName());
        System.out.println(darth.getChildrenNumber());
        System.out.println(darth.getisOnDarkSide());
    }
}
