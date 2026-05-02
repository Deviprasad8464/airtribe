package com.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVUtil {

    public static void write (String file, String data) throws IOException
    {
            try(BufferedWriter bw=new BufferedWriter(new FileWriter(file))){
                bw.write(data);
            }

    }
}
