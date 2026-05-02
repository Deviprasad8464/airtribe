package com.util;

import com.exception.InvalidDataException;

public class Validator {

    public static void validateName(String name)
        throws InvalidDataException{
        if(name==null || name.isEmpty())
        {
            throw new InvalidDataException("Invalid name");
        }
    }
}
