package com.company.Formatcode;

/**
 * Created by Admin on 13.05.2016.
 */
public class IFormater {

    static int IFormat(int count){
        if ((count == 59 ) || (count == 125))
        {IWriter.IWriterOne(count); return 0;}

        if (count == 123)
        {IWriter.IWriterFour(count); return 0;}

        IWriter.IWriterDefault(count);
        return count;
    }

}
