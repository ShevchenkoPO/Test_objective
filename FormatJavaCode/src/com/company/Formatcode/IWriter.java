package com.company.Formatcode;

/**
 * Created by Admin on 13.05.2016.
 */
public class IWriter {

    static int IWriterDefault(int count){
        System.out.print((char)count);
        return 0;
    }

    static int IWriterOne(int count){
        System.out.print((char)count);
        {System.out.print("\n");}
        return 0;
    }

    static int IWriterFour(int count){
        System.out.print((char)count);
        System.out.print("\n    ");
        return 0;
    }

}
