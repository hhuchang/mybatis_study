package com.c2.hanzi;

import org.apache.ibatis.lang.UsesJava8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriterHandler {

    public static void main(String[] args) throws IOException {
        //String path="H:\\proj\\kindle\\电纸书软件\\html2\\text\\part0012.html";
        String path="H:\\proj\\kindle\\电纸书软件\\html2\\text";
        //File file= new File(path);
        File root= new File(path);
        File[] allFiles=root.listFiles();
        for (File file : allFiles) {




        List<String> strings = Files.readAllLines(Paths.get(file.getAbsolutePath()));
        //String s="";
        List<String>  replaced=new ArrayList<>();
        for (String s : strings) {
            if (s.trim().startsWith("<h2")){
                int kuohao2index=s.indexOf(">",2);
                int kuohao3index=s.indexOf("</h2");
                String title=s.substring(kuohao2index+1,kuohao3index);
                System.out.println(title);

                String[] split = title.split("　");
                if (title.contains("回")) {
                    if (split.length != 3) {
                        System.out.println(file.getName() + "title分割出错--------====");
                        replaced.add(s);
                    } else {
                        String title1 = split[0];
                        String title2 = split[1];
                        String title3 = split[2];
                        String res = "<table border='0'>" +
                                "<tr>" +
                                "<td rowspan='2'><p class='h2my'>" + title1 + "</p></td>" +
                                "<td><p class='h2my'>　" + title2 + "</p></td>" +
                                "</tr>" +
                                "<tr><td><p class='h2my'>　" + title3 + "</p></td></tr>" +
                                "" +
                                "</table>";

                        replaced.add(res);

                    }
                }else{
                    System.out.println(file.getName()+"不是回目-----============");
                    replaced.add(s);
                }

            }else{
                //System.out.println(file.getName()+"不含h2---------=======");
                replaced.add(s);
            }
        }


        Files.write(Paths.get("H:\\proj\\kindle\\电纸书软件\\html2\\new\\"+file.getName()),replaced);

        }






    }
}
