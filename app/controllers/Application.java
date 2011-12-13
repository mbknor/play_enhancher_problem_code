package controllers;

import play.*;
import play.mvc.*;
import play.data.binding.*;
import java.util.*;
import org.apache.commons.io.*;

import models.*;
import play.libs.*;
import play.utils.*;

public class Application extends Controller {

    public static List<String> getLetters() {
        String[] array = new String[36];

        int i = 0;
        for (int nCharCode = 65; nCharCode <= 90; nCharCode++) // a-z = 26
            array[i++] = String.valueOf((char) nCharCode);
        for (int nCharCode = 48; nCharCode <= 57; nCharCode++) // 0-9 = 10
            array[i++] = String.valueOf((char) nCharCode);

        return Arrays.asList(array);
    }
        
}
