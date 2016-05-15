package com.company.Formatcode;

public class IFormater {

    static int IFormat(int simb) {
        if ((simb == 59 ) || (simb == 125)) {
            System.out.print("\n");
            return 0;
        }
        if (simb == 123) {
            System.out.print("\n    ");
            return 0;
        }
        return simb;
    }
}
