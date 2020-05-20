package com.test;


import java.io.*;
import java.util.*;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("123","456");
        map.put("456","897897989");
        map.put("789","123");

        list.add(map);
        list.add(map);
        list.add(map);
        exportDaily("D:\\新建文件夹","utf-8","a.txt",list);


    }

    public static boolean exportDaily(String site, String format,String name,List<Map<String,String>> data){
        FileOutputStream fos=null;
        OutputStreamWriter osw = null;
        BufferedWriter bw=null;
        File file=null;
        File finallyFile=null;
        try {
            file=new File(site);
            finallyFile=new File(site,name);
            if (!file.isDirectory()){
                file.mkdirs();
            }else if (finallyFile.exists()){
                finallyFile.delete();
            }
            String startName = name.substring(0, name.lastIndexOf("."))+".html";
            file=new File(file,startName);
            fos=new FileOutputStream(file);
            osw=new OutputStreamWriter(fos,format);
            bw=new BufferedWriter(osw);
            StringBuilder sb=new StringBuilder();
            for (Map<String,String> map:data){
                Set<String> keySet = map.keySet();
                sb.delete(0,sb.length());
                int i=0;
                for (String key:keySet){
                    ++i;
                    if (i==keySet.size()){
                        sb.append(map.get(key));
                        break;
                    }
                    sb.append(map.get(key)).append("|#|");
                }
                bw.write(sb.toString());
                bw.write("\r\n");
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {
            if(bw!=null){
                try {
                    bw.close();
                    bw=null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(osw!=null){
                try {
                    osw.close();
                    osw =null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos!=null){
                try {
                    fos.close();
                    fos=null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return file.renameTo(finallyFile);
    }
}
