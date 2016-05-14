package com.company.Formatcode;

import java.io.*;

/**
 * Created by Admin on 13.05.2016.
 */
public class IReader {

    static char IRead(char count, String nameoffile)
    {

        try(BufferedReader br = new BufferedReader (new FileReader(nameoffile)))
        {
            // чтение посимвольно
            int c;
            while((c=br.read())!=-1){
                count = (char)c;
                IFormater.IFormat(count);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        return count;
    }

}

// Endclass

