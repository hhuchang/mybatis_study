package com.c2.hanzi;

import com.c2.utils.zhUtil;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

public class shaixuan {
    public static void main(String[] args) {
        String path="H:\\proj\\kindle\\电纸书软件\\html2\\text";
        File root=new File(path);
        File[] allFiles=root.listFiles();


        //String txt="H:\\proj\\kindle\\电纸书软件\\html\\bang.txt";

        String txt="H:\\proj\\kindle\\电纸书软件\\html\\text\\part0000.html";

        Map<Double,String> store=new HashMap<>();

        for (File allFile : allFiles) {
            String filepath=allFile.getAbsolutePath();
            System.out.println(filepath);

            String res = ReaderMy.readTxtFile(filepath);

            char[] chars = res.toCharArray();

            //System.out.println(zhUtil.chinaToUnicode(res));



            double index=0;
            boolean isEven=false;

            for (char aChar : chars) {
                String unicode=zhUtil.chinaToUnicode2(aChar);
                if (/*unicode.startsWith("\\ud")||*/(unicode.startsWith("\\f")&&unicode.length()>5)){
                    //半个字符
                    index=index+0.5;
                    store.put(index,unicode);
                    System.out.println(unicode);

                }else{
                    //一个字符
                    index++;
                }
            }


        }

        System.out.println(store);














    }
}
