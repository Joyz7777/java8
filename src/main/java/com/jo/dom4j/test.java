package com.jo.dom4j;


import org.dom4j.*;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;

public class test {


    public static Document getDocument() {

        Document document =null;

        try {
            SAXReader reader = new SAXReader();
            document = reader.read(new File("F:\\IDE_WORKSPACE\\Java8\\pom.xml"));
        }catch (Exception e){
            System.out.println(e.getClass().getName());
        }
        return document;

    }





    public static void main(String[] args) throws DocumentException {
        Document document = test.getDocument();
        Element root = document.getRootElement();
        Element memberElm=root.element("dependencies");// "member"是节点名
        String text=memberElm.getText();
    //    String text=root.elementText("name");
                System.out.println(text);
    }
}
