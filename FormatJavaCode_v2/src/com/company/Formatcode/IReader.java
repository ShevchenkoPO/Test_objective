package com.company.Formatcode;

import java.io.*;

public class IReader {

    static int c, markl;

    static int IRead(char simb, String nameoffile) {
        try(BufferedReader br = new BufferedReader (new FileReader(nameoffile))) {
            // чтение посимвольно
            //br.mark(markl);
            c = br.read();
            if (c != -1) {
                simb = (char)c;
            }
            /*while((c=br.read())!=-1){
                simb = (char)c;
                IFormater.IFormat(simb);
            }*/
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        return simb;
    }
}

// Endclass

