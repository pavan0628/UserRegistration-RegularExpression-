package com.brlab.regx;

public class InvalidUserDetailsException  extends RuntimeException{
    //private String message;

    InvalidUserDetailsException(String message){
        super(message);
        //this.message=message;
    }

}
