package com.company.Formatcode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char buf = 0;
        int mark = 0;

        IReader Reader = new IReader();
        IFormater Format = new IFormater();
        IWriter Writer = new IWriter();

while (buf != -1) {
    Reader.IRead(buf, "1.txt");
    Reader.markl++;
    buf = (char)IReader.c;
    Format.IFormat(buf);
    Writer.IWriter(buf);
}
        // IReader.IRead(buf, "1.txt", mark);
       // System.out.print(buf);
    }
}
