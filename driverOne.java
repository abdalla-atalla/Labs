package lab4;

import java.util.ArrayList;

public class DriverOne{
    public static void main(String[] args){
    ArrayList<String> list = new ArrayList<String>();
    String x = "hello";
    String y = "world";
    replace(list, x, y);
    delete(list, y);
    }

    public static String replace(ArrayList<String> aList, String oldItem, String newItem){
        return "replace";
    }

    public static String delete(ArrayList<String> aList, String target){
 
        return "delete";
    }
}
}
