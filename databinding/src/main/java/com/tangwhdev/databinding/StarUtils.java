package com.tangwhdev.databinding;

public class StarUtils {
    public static String getStarStr(int star){
        String str = "";
        switch (star){
            case 1:
                str="一星";
                break;
            case 2:
                str="二星";
                break;
            case 3:
                str="三星";
                break;
            case 4:
                str="四星";
                break;
            case 5:
                str="五星";
                break;

        }
        return str;
    }
}
