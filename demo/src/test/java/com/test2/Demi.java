package com.test2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.*;


public class Demi {
    class user{
        public void test(){
            System.out.println(123);
        }
    }
    public static void main(String[] args) {
        System.out.println(user.class);
        System.out.println("输出的打印语句");
    }








        /*ArrayList<Object> one = new ArrayList<Object>(Arrays.asList(new int[]{1,2,3}));
        ArrayList<Object> twe = new ArrayList<Object>(Arrays.asList(new int[]{4,5,6}));
        one.addAll(twe);
        System.out.println(one);*/


/*        ArrayList<Object> list = new ArrayList<Object>();

        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        map.put("list",list);
        map.put("method","RatableResourceSearchServiceNew");
        String[] s={"1","2","3","list"};
        String[] ss={"1","2","3",};

        HashMap<String, String> listMap = new HashMap<String, String>();
        listMap.put("1","a");
        listMap.put("2","b");
        listMap.put("3","c");
        list.add(listMap);

        String clearUp = clearUp(map, s, ss);
        System.out.println(clearUp);*/

        /*String s="{\"Service-Information\":[{\"Para-Field-Result\":\"用户无未打印发票信息!\",\"Service-Result-Code\":\"0\"}],\"time\":\"20191011\"}";
        Map map = JSONObject.parseObject(s, Map.class);*/



    /*}

    static String clearUp(Map<String,Object> map,String[] str1,String[] str2){
        StringBuilder sb = new StringBuilder();
        sb.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:exc=\"http://ws.inf.crm.ztesoft.com/exchange/\">");
        sb.append("<soapenv:Header/>");
        sb.append("<soapenv:Body>");
        sb.append("<exc:exchange>");
        sb.append("<exc:in>");
        sb.append("<![CDATA[");
        sb.append("<root>");

        sb.append("<biz_code>"+map.get("method").toString()+"</biz_code>");//固ding

        for (String s:str1){
            Object obj = map.get(s);
            if (obj instanceof List){ //判断是list
                List<Map<String,String>> list=(List<Map<String,String>>) obj;
                sb.append("<").append(s).append(">");
                for (Map<String,String> listMap : list) { //遍历组里面的每个元素
                    for (String ss : str2) {  //遍历 组的数据并拼接
                        sb.append("<").append(ss).append(">");
                        sb.append(listMap.get(ss));
                        sb.append("</").append(ss).append(">");
                    }
                }
                sb.append("</").append(s).append(">");
            }else {
                //不是list
                sb.append("<").append(s).append(">");
                sb.append(obj.toString());
                sb.append("</").append(s).append(">");
            }
        }


        sb.append("</root>");
        sb.append("]]>");
        sb.append("</exc:in>");
        sb.append("</exc:exchange>");
        sb.append("</soapenv:Body>");
        sb.append("</soapenv:Envelope>");
        return sb.toString();
    }

    private static String test(Map<String,Object> map,String[] str1,String[] str2){
        StringBuilder sb = new StringBuilder();
        sb.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:exc=\"http://ws.inf.crm.ztesoft.com/exchange/\">");
        sb.append("<soapenv:Header/>");
        sb.append("<soapenv:Body>");
        sb.append("<exc:exchange>");
        sb.append("<exc:in>");
        sb.append("<![CDATA[");
        sb.append("<root>");

        sb.append("<biz_code>"+map.get("method").toString()+"</biz_code>");//固ding

        for (String s:str1){
            Object obj = map.get(s);
            if (obj instanceof List){ //判断是list
                List<Object> objectList=(List<Object>) obj;
                List<Map<String,String>> list=(List<Map<String,String>>) objectList.get(0);
                sb.append("<").append(s).append(">");
                for (Map<String,String> listMap : list) { //遍历组里面的每个元素
                    sb.append("<").append(map.get("listName")).append(">");
                    for (String ss : str2) {  //遍历 组的数据并拼接
                        sb.append("<").append(ss).append(">");
                        sb.append(listMap.get(ss));
                        sb.append("</").append(ss).append(">");
                    }
                    sb.append("</").append(map.get("listName")).append(">");
                }
                sb.append("</").append(s).append(">");
            }else {
                //不是list
                sb.append("<").append(s).append(">");
                sb.append(obj.toString());
                sb.append("</").append(s).append(">");
            }
        }

        //sb.append("<seq_id>"+ServId+"</seq_id>");

        //sb.append("<client_id>EOP</client_id>"); //固定
        //sb.append("<client_password>EOP321</client_password>");//固定HB321

*//*                sb.append("<Service-Information>");
                sb.append("<Bill-Information>");
                sb.append("<Acc-Nbr>13340015956</Acc-Nbr>");
                sb.append("<Destination-Attr>2</Destination-Attr>");
                sb.append("<Billing-Cycle>201704</Billing-Cycle>");
                sb.append("<Product-Offer-Id></Product-Offer-Id>");
                sb.append("</Bill-Information>");
                sb.append("</Service-Information>");*//*

        sb.append("</root>");
        sb.append("]]>");
        sb.append("</exc:in>");
        sb.append("</exc:exchange>");
        sb.append("</soapenv:Body>");
        sb.append("</soapenv:Envelope>");
        return sb.toString();
    }*/


}
/*            /*StringBuilder sb = new StringBuilder();
            sb.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:exc=\"http://ws.inf.crm.ztesoft.com/exchange/\">");
            sb.append("<soapenv:Header/>");
            sb.append("<soapenv:Body>");
            sb.append("<exc:exchange>");
            sb.append("<exc:in>");
            sb.append("<![CDATA[");
            sb.append("<root>");

            sb.append("<biz_code>RatableResourceSearchServiceNew</biz_code>");//固定
            sb.append("<seq_id>"+ServId+"</seq_id>");
            sb.append("<client_id>EOP</client_id>");
            sb.append("<client_password>EOP321</client_password>");//固定HB321

            sb.append("<Service-Information>");
            sb.append("<Bill-Information>");
            sb.append("<Acc-Nbr>13340015956</Acc-Nbr>");
            sb.append("<Destination-Attr>2</Destination-Attr>");
            sb.append("<Billing-Cycle>201704</Billing-Cycle>");
            sb.append("<Product-Offer-Id></Product-Offer-Id>");
            sb.append("</Bill-Information>");
            sb.append("</Service-Information>");

            sb.append("</root>");
            sb.append("]]>");
            sb.append("</exc:in>");
            sb.append("</exc:exchange>");
            sb.append("</soapenv:Body>");
            sb.append("</soapenv:Envelope>");*/
