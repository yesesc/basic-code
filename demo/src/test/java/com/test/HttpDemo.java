package com.test;


import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;


public class HttpDemo {
    public static void main(String[] args) {

        try {
            URL url = new URL( "http://localhost:20881/ias/QryOntimePayAccept_LN");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setDoInput(true); // 设置可输入
            connection.setDoOutput(true); // 设置该连接是可以输出的
            connection.setRequestMethod("POST"); // 设置请求方式
            connection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");

            String s="{\n" +
                    "\t\"RequestId\":\"YYYYMMDDHHMMSS9987654321\",\n" +
                    "\t\"SystemId\":\"0008\",\n" +
                    "\t\"ServiceName\":\"OntimePayAcceptStat\",\n" +
                    "\t\"CityCode\":\"919\",\n" +
                    "\t\"Operator\":\"620290\"\n" +
                    "}";
            PrintWriter pw = new PrintWriter(new BufferedOutputStream(connection.getOutputStream()));
            pw.write(s);
            pw.flush();
            pw.close();

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
            String line = null;
            StringBuilder result = new StringBuilder();
            while ((line = br.readLine()) != null) { // 读取数据
                result.append(line + "\n");
            }
            connection.disconnect();

            System.out.println(result.toString());
            String ss = result.toString();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
