package com.meditation.test;

import com.meditation.pojo.vowels;

import javax.swing.text.html.parser.Entity;
import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<HashMap<String,String>>();
        Map map = new HashMap<String,String>();
        map.put("e","ea,ed");
        map.put("d","fgf,gh,jj");
        list.add(map);


        try {
            InputStream in = new FileInputStream("aa//mysqlutin.properties");
            Properties pro = new Properties();
            pro.load(in);
            System.out.println(pro.getProperty("username"));
        } catch (Exception e) {
            e.printStackTrace();
        }



      //  String username = pro.getProperty("username");
       // System.out.println(username);
    }
}
