package com.c2.hanzi;

import java.io.*;

public class ReaderMy {
    public static String readTxtFile(String url) {

        File file = new File(url);
        Reader reader = null;
        StringBuffer buffer = new StringBuffer();
        /*try {

            //一次读一个字符
            reader = new InputStreamReader(new FileInputStream(file));
            int tempchar;
            try {
                while((tempchar = reader.read())!=-1) {

                    // 对于windows下，\r\n这两个字符在一起时，表示一个换行。

                    // 但如果这两个字符分开显示时，会换两次行。

                    // 因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。

                    if(((char)tempchar)!='\r') {



                        buffer.append((char)tempchar);
                    }
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }*/
        try {

            //一次读多个字符
            char[] tempchars = new char[1024];
            int charread = 0;
            reader = new InputStreamReader(new FileInputStream(file));

            // 读入多个字符到字符数组中，charread为一次读取字符数

            while((charread = reader.read(tempchars))!=-1) {

                // 同样屏蔽掉\r不显示

                if((charread == tempchars.length)&&(tempchars[tempchars.length-1]!='\r')) {

                    buffer.append(tempchars);
                }else {
                    for(int i = 0;i < charread;i++) {
                        if(tempchars[i] == '\r') {
                            continue;
                        }else {
                            buffer.append(tempchars[i]);
                        }
                    }
                }

            }
        }catch(Exception e1) {
            e1.printStackTrace();
        }finally {
            if (reader != null)
                try {
                    reader.close();
                }catch(IOException e1) {

                }
        }

        return buffer.toString();
    }


    public static void printXi(char  tempchar){
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(tempchar);
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS){
            System.out.println(tempchar+":CJK_UNIFIED_IDEOGRAPHS");
        }
        else if(ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS){
            System.out.println(tempchar+":CJK_COMPATIBILITY_IDEOGRAPHS");
        }
        else if(ub == Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS){
            System.out.println(tempchar+":CJK_COMPATIBILITY_FORMS");
        }
        else if(ub == Character.UnicodeBlock.CJK_COMPATIBILITY){
            System.out.println(tempchar+":CJK_COMPATIBILITY");
        }
        else if(ub == Character.UnicodeBlock.CJK_STROKES){
            System.out.println(tempchar+":CJK_STROKES");
        }
        else if(ub == Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT){
            System.out.println(tempchar+":CJK_RADICALS_SUPPLEMENT");
        }





        else if(ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT){
            System.out.println(tempchar+":CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT");
        }
        else if(ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A){
            System.out.println(tempchar+":CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A");
        }
        else if(ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B){
            System.out.println(tempchar+":CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B");
        }
        else if(ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C){
            System.out.println(tempchar+":CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C");
        }
        else if(ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D){
            System.out.println(tempchar+":CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D");
        }
        else if (ub == Character.UnicodeBlock.GENERAL_PUNCTUATION){
            System.out.println(tempchar+":GENERAL_PUNCTUATION");
        }
        else if (ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION){
            System.out.println(tempchar+":CJK_SYMBOLS_AND_PUNCTUATION");
        }
        else if (ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
            System.out.println(tempchar+":HALFWIDTH_AND_FULLWIDTH_FORMS");

        }else{
            System.out.println(tempchar+":非正常中文  或西文");
        }
    }
}
