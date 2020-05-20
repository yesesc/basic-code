package com.test;

import com.alibaba.dubbo.common.json.JSONObject;
import com.alibaba.fastjson.JSON;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.*;
import java.util.Map;

public class StringDemo {
    public static void main(String[] args) throws DocumentException {
        String data = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "   <soapenv:Body>\n" +
                "      <exchangeResponse xmlns=\"http://ws.inf.crm.ztesoft.com/exchange/\">\n" +
                "         <out xmlns=\"\"><![CDATA[<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "\n" +
                "<root>\n" +
                "   <seq_id>20150522182343000008</seq_id>\n" +
                "   <Service-Information>\n" +
                "      <invoice>\n" +
                "         <Invoice_id>137901</Invoice_id>\n" +
                "         <AcctMonth>201808</AcctMonth>\n" +
                "         <Acc_nbr>17770021652</Acc_nbr>\n" +
                "         <State>0</State>\n" +
                "         <Charge>3.75</Charge>\n" +
                "         <Oper_state>缴费</Oper_state>\n" +
                "         <Oper_date>20190629153957</Oper_date>\n" +
                "      </invoice>\n" +
                "      <invoice>\n" +
                "         <Invoice_id>137902</Invoice_id>\n" +
                "         <AcctMonth>201809</AcctMonth>\n" +
                "         <Acc_nbr>17770021652</Acc_nbr>\n" +
                "         <State>0</State>\n" +
                "         <Charge>3.6</Charge>\n" +
                "         <Oper_state>缴费</Oper_state>\n" +
                "         <Oper_date>20190629153957</Oper_date>\n" +
                "      </invoice>\n" +
                "      <invoice>\n" +
                "         <Invoice_id>137903</Invoice_id>\n" +
                "         <AcctMonth>201905</AcctMonth>\n" +
                "         <Acc_nbr>17770021652</Acc_nbr>\n" +
                "         <State>0</State>\n" +
                "         <Charge>12.9</Charge>\n" +
                "         <Oper_state>缴费</Oper_state>\n" +
                "         <Oper_date>20190629153957</Oper_date>\n" +
                "      </invoice>\n" +
                "      <Service-Result-Code>0</Service-Result-Code>\n" +
                "      <Para-Field-Result>查询成功!</Para-Field-Result>\n" +
                "   </Service-Information>\n" +
                "</root>]]></out>\n" +
                "      </exchangeResponse>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";


        String ss = "<root>\n" +
                "   <time>20191011</time>\n" +
                "   <Service-Information>\n" +
                "      <Service-Result-Code>0</Service-Result-Code>\n" +
                "      <Para-Field-Result>用户无未打印发票信息!</Para-Field-Result>\n" +
                "   </Service-Information>\n" +
                "</root>";

        StringBuilder sb = new StringBuilder();
        sb.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:exc=\"http://ws.inf.crm.ztesoft.com/exchange/\">\n");
        sb.append("<soapenv:Header/>");
        sb.append("<soapenv:Body>");
        sb.append("<exc:exchange>");
        sb.append("<exc:in>");
        sb.append("<![CDATA[");
        sb.append("<root>");

        sb.append("<biz_code>" + "biz_code" + "</biz_code>");
        sb.append("<seq_id>" + "seq_id" + "</seq_id>");
        sb.append("<client_id>" + "client_id" + "</client_id>");
        sb.append("<client_password>" + "client_id" + "</client_password>");
        sb.append("<Service-Information>");
        sb.append("<ObjectId>" + "client_id" + "</ObjectId>");
        sb.append("<AcctMonth>" + "client_id" + "</AcctMonth>");
        sb.append("<RequestTime>" + "client_id" + "</RequestTime>"); //Request-Time
        sb.append("</Service-Information>");

        sb.append(" </root>");
        sb.append(" ]]>");
        sb.append(" </exc:in>");
        sb.append(" </exc:exchange>");
        sb.append(" </soapenv:Body>");
        sb.append(" </soapenv:Envelope>");


        String ser="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "   <soapenv:Body>\n" +
                "      <exchangeResponse xmlns=\"http://ws.inf.crm.ztesoft.com/exchange/\">\n" +
                "         <out xmlns=\"\"><![CDATA[<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "\n" +
                "<root>\n" +
                "   <seq_id></seq_id>\n" +
                "   <Service-Information>\n" +
                "      <Product-OFF-INFO>\n" +
                "         <Offer-Type>11</Offer-Type>\n" +
                "         <Product-Offer-Id>7500000000690001761</Product-Offer-Id>\n" +
                "         <Product-OFF-Name>飞Young4G 201407纯流量云卡49元</Product-OFF-Name>\n" +
                "         <ProdOfferInstanceId>712043631668</ProdOfferInstanceId>\n" +
                "         <Respond-Ratable-Query>\n" +
                "            <Ratable-Resource-name>免省内上网流量累积量</Ratable-Resource-name>\n" +
                "            <UnitType-Id>3</UnitType-Id>\n" +
                "            <Balance-Amount>2097152.00</Balance-Amount>\n" +
                "            <BeginTime>20170401000000</BeginTime>\n" +
                "            <Ratable-Resource-ID>321100</Ratable-Resource-ID>\n" +
                "            <Owner-Type>80C</Owner-Type>\n" +
                "            <EndTime>20170430235959</EndTime>\n" +
                "            <Owner-ID>712043631668</Owner-ID>\n" +
                "            <Usage-Amount>0.00</Usage-Amount>\n" +
                "            <Ratable-Amount>2097152.00</Ratable-Amount>\n" +
                "         </Respond-Ratable-Query>\n" +
                "      </Product-OFF-INFO>\n" +
                "      <Service-Result-Code>0</Service-Result-Code>\n" +
                "      <Para-Field-Result>查询成功!</Para-Field-Result>\n" +
                "   </Service-Information>\n" +
                "</root>]]></out>\n" +
                "      </exchangeResponse>\n" +
                "   </soapenv:Body>\n" +
                "</soapenv:Envelope>";
        String s1 = sb.toString();

        String test=
                "<AcctBalanceQryRst>\n" +
                "  <ResponseId>10201906280014124641727830</ResponseId>\n" +
                "  <ResponseTime>20190628001412</ResponseTime>\n" +
                "  <ResultCode>0</ResultCode>\n" +
                "  <ResponseAmount>3</ResponseAmount>\n" +
                "  <AcctBalanceItem>\n" +
                "    <AcctBalanceID>832052236928</AcctBalanceID>\n" +
                "    <BalanceTypeID>1063</BalanceTypeID>\n" +
                "    <BalanceTypeName>X元一次性到账预存账本</BalanceTypeName>\n" +
                "    <AcctID>804109073122</AcctID>\n" +
                "    <ITEM_GROUP_ID>313</ITEM_GROUP_ID>\n" +
                "    <PRIORITY>100045</PRIORITY>\n" +
                "    <BALANCE>1600</BALANCE>\n" +
                "    <ReserveBalance>0</ReserveBalance>\n" +
                "    <CycleUpper>10000000000</CycleUpper>\n" +
                "    <CycleLower>-10000000000</CycleLower>\n" +
                "    <CycleUpperType>5LA</CycleUpperType>\n" +
                "    <CycleLowerType>5LA</CycleLowerType>\n" +
                "    <ADJUST_FLAG>5CA</ADJUST_FLAG>\n" +
                "    <ALLOW_TRANS>5CB</ALLOW_TRANS>\n" +
                "    <EffDate>20190627000000</EffDate>\n" +
                "    <ExpDate>20360226235959</ExpDate>\n" +
                "    <State>00A</State>\n" +
                "    <StateDate>20180904200643</StateDate>\n" +
                "    <RegionID>791</RegionID>\n" +
                "    <UseRuleFlag>T</UseRuleFlag>\n" +
                "    <BalancePrint>0</BalancePrint>\n" +
                "    <UseRuleCount>0</UseRuleCount>\n" +
                "    <BalanceUnit>0</BalanceUnit>\n" +
                "    <OBJECT_TYPE_ID></OBJECT_TYPE_ID>\n" +
                "    <OBJECT_ID></OBJECT_ID>\n" +
                "    <Acct_name></Acct_name>\n" +
                "    <Serv_name></Serv_name>\n" +
                "  </AcctBalanceItem>\n" +
                "  <AcctBalanceItem>\n" +
                "    <AcctBalanceID>832052236929</AcctBalanceID>\n" +
                "    <BalanceTypeID>3178</BalanceTypeID>\n" +
                "    <BalanceTypeName>预存待划拨账本(每月16元到1099账本)</BalanceTypeName>\n" +
                "    <AcctID>804109073122</AcctID>\n" +
                "    <ITEM_GROUP_ID>103</ITEM_GROUP_ID>\n" +
                "    <PRIORITY>101001</PRIORITY>\n" +
                "    <BALANCE>8400</BALANCE>\n" +
                "    <ReserveBalance>0</ReserveBalance>\n" +
                "    <CycleUpper>1600</CycleUpper>\n" +
                "    <CycleLower>-1600</CycleLower>\n" +
                "    <CycleUpperType>5LA</CycleUpperType>\n" +
                "    <CycleLowerType>5LA</CycleLowerType>\n" +
                "    <ADJUST_FLAG>5CA</ADJUST_FLAG>\n" +
                "    <ALLOW_TRANS>5CB</ALLOW_TRANS>\n" +
                "    <EffDate>20190627000000</EffDate>\n" +
                "    <ExpDate>20360226235959</ExpDate>\n" +
                "    <State>00A</State>\n" +
                "    <StateDate>20180904200643</StateDate>\n" +
                "    <RegionID>791</RegionID>\n" +
                "    <UseRuleFlag>T</UseRuleFlag>\n" +
                "    <BalancePrint>0</BalancePrint>\n" +
                "    <UseRuleCount>0</UseRuleCount>\n" +
                "    <BalanceUnit>0</BalanceUnit>\n" +
                "    <OBJECT_TYPE_ID></OBJECT_TYPE_ID>\n" +
                "    <OBJECT_ID></OBJECT_ID>\n" +
                "    <Acct_name></Acct_name>\n" +
                "    <Serv_name></Serv_name>\n" +
                "  </AcctBalanceItem>\n" +
                "  <AcctBalanceItem>\n" +
                "    <AcctBalanceID>832057794031</AcctBalanceID>\n" +
                "    <BalanceTypeID>2000</BalanceTypeID>\n" +
                "    <BalanceTypeName>存款(通用余额账本)</BalanceTypeName>\n" +
                "    <AcctID>804109073122</AcctID>\n" +
                "    <ITEM_GROUP_ID>5</ITEM_GROUP_ID>\n" +
                "    <PRIORITY>101000</PRIORITY>\n" +
                "    <BALANCE>0</BALANCE>\n" +
                "    <ReserveBalance>0</ReserveBalance>\n" +
                "    <CycleUpper>10000000</CycleUpper>\n" +
                "    <CycleLower>-10000000</CycleLower>\n" +
                "    <CycleUpperType>5LA</CycleUpperType>\n" +
                "    <CycleLowerType>5LA</CycleLowerType>\n" +
                "    <ADJUST_FLAG>5CA</ADJUST_FLAG>\n" +
                "    <ALLOW_TRANS>5CA</ALLOW_TRANS>\n" +
                "    <EffDate>20190501000000</EffDate>\n" +
                "    <ExpDate>20351231235959</ExpDate>\n" +
                "    <State>00A</State>\n" +
                "    <StateDate>20190626234944</StateDate>\n" +
                "    <RegionID>791</RegionID>\n" +
                "    <UseRuleFlag>F</UseRuleFlag>\n" +
                "    <BalancePrint>0</BalancePrint>\n" +
                "    <UseRuleCount>0</UseRuleCount>\n" +
                "    <BalanceUnit>0</BalanceUnit>\n" +
                "    <OBJECT_TYPE_ID></OBJECT_TYPE_ID>\n" +
                "    <OBJECT_ID></OBJECT_ID>\n" +
                "    <Acct_name></Acct_name>\n" +
                "    <Serv_name></Serv_name>\n" +
                "  </AcctBalanceItem>\n" +
                "</AcctBalanceQryRst>";
        //String test2 = test.replaceAll("</Service-Information>|<Service-Information>", "");
        Map<String, Object> map = getDataDetail(data, "<root>");
        String s = JSON.toJSONString(map);

        System.out.println(s);

    }


       /* HashMap<String, Object> map = new HashMap<String, Object>();
        int start = s1.indexOf("<root>");
        int end = s1.indexOf("</root>");
        String sbData = s1.substring(start, end + "<root>".length() + 1);
        String s = sbData.replaceAll("</Service-Information>|<Service-Information>", "");


        Document doc = DocumentHelper.parseText(s); // 将字符串转为XML
        Element rootElt = doc.getRootElement(); // 获取根节点*/


       /* Iterator it = rootElt.elementIterator();
        List<List> recordDetaillist = new ArrayList<List>();
        String listName="";
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String name = element.getName();
           // System.out.println(name);

            //print(element);

            List<Element> list = element.elements();
            if (list!=null&&list.size()==0){
                map.put(element.getName(),element.getText());  //第一级
            }else if (list!=null&&list.size()>0){
                listName=element.getName();
                ArrayList<Map<String, String>> arrayList = new ArrayList<Map<String, String>>();;
                for (Element ee:list){
                    List<Element> elements = ee.elements();
                    String eeName = ee.getName();
                    if (elements!=null&&elements.size()==0){
                       // map.put(ee.getName(),ee.getText()); //第二级

                        HashMap<String, String> hashMap = new HashMap<String, String>();
                        hashMap.put(ee.getName(),ee.getText());
                        arrayList.add(hashMap);
                        //System.out.println(ee.getName());
                    }else if (elements!=null&&elements.size()>0){
                        for (Element eee:elements){
                            HashMap<String, String> hashMap = new HashMap<String, String>();
                            hashMap.put(eee.getName(),eee.getText());
                            //recordDetaillist.add(hashMap);
                        }
                    }
                }
                recordDetaillist.add(arrayList);
            }*/


        /*print(element);*//*

        }



            /*while (it.hasNext()) {
                Element  element  = (Element) it.next();
                String nodeName = element.getName();
                // 判断底下是否有字元素
                List<Element> childElements = element.elements();
                // 无子元素
                if (childElements != null && childElements.size() == 0) {
                    map.put(nodeName, element.getText());
                    // 遍历Service-Information
                } else if ("recordDetail".equals(nodeName)){
                    Map<String, Object> tempMap = new HashMap<String, Object>();
                    for (Element childElement : childElements) {
                        String name = childElement.getName();
                        String value = childElement.getText();
                        tempMap.put(name, value);
                    }
                    recordDetaillist.add(tempMap);
                }else {
                    continue;
                }
            }*/


    /*public static void print(Element element){
        List<Element> list = element.elements();
        if (list!=null&&list.size()>0){
            for (Element ee:list){
                String eeName = ee.getName();
                System.out.println(eeName);
                print(ee);
            }
        }
    }*/
        /*if (listName.length()>0){
            map.put(listName,recordDetaillist);
        }*/





    public static Map<String, Object> getDataDetail(String data,String str) throws DocumentException {
        Map<String, Object> map = new HashMap<String, Object>();
        int start = data.indexOf(str); //截取的起始位置
        String endStr = str.replaceAll("<", "</");
        int end = data.indexOf(endStr); //截取的重点位置
        String sbData = data.substring(start, end + endStr.length()); // 截取到所需内容字符串
        //String s = sbData.replaceAll("</Service-Information>|<Service-Information>", "");


        Document doc = DocumentHelper.parseText(sbData); // 将字符串转为XML
        Element rootElt = doc.getRootElement(); // 获取根节点


        Iterator it = rootElt.elementIterator();
        //List<List> recordDetaillist = new ArrayList<List>();
        ArrayList<Map<String, Object>> arrayList=  new ArrayList<Map<String, Object>>();
        //String listName = "";
        while (it.hasNext()) {
            Element element = (Element) it.next();
            // String name = element.getName();
            // System.out.println(name);


            /*List<Element> list = element.elements();
            if (list != null && list.size() == 0) {
                map.put(element.getName(), element.getText());  //第一级
            } else if (list != null && list.size() > 0) {
                listName = element.getName();
                map.put(listName, arrayList);
                HashMap<String, String> hashMap=new HashMap<String, String>();;

                for (Element ee : list) {
                    //第二级
                    hashMap.put(ee.getName(), ee.getText());
                }
                arrayList.add(hashMap);
            }*/

            map=test(element,map);
            //arrayList.add(map);
        }
        /*Map<String, Object> rulMap = new HashMap<String, Object>();
        for (Map<String, Object> objectMap : arrayList) {
            Set<String> keySet = objectMap.keySet();
            for (String key : keySet) {
                rulMap.put(key,objectMap.get(key));
            }
        }*/

        return map;
    }

    public static Map<String, Object> test(Element element,Map<String, Object> map){
        //HashMap<String, Object> map = new HashMap<String, Object>();
        boolean flg = false;
        List<Element> list = element.elements();
        if (list != null && list.size() == 0) {
            map.put(element.getName(), element.getText());  //第一级
        } else if (list != null && list.size() > 0) {
            String listName = element.getName();

            if (map.size()>=1){ //1.为了解决数据结构的问题，加个数据重名判断，并进行处理

                Set<String> keySet = map.keySet();
                flg = keySet.contains(listName);
            }
            ArrayList<Map<String, Object>> arrayList=  new ArrayList<Map<String, Object>>(); //这里会出现数据结构单一的问题

            if (flg){ //重复的
                arrayList=(ArrayList<Map<String, Object>>)map.get(listName); //把地址指向已有的容器
            }

            map.put(listName, arrayList); //确定容器

            Map<String, Object> nextMap=new HashMap<String, Object>();//下一层的容器

            //Map<String, Object> resultMap = new HashMap<String, Object>();
            for (Element ee : list) {
                //第二级
                nextMap = test(ee,nextMap); //这里会出现地址值覆盖，思路是在创建一个map固定地址接受参数
               // resultMap.putAll(nextMap);
                //hashMap.put(ee.getName(), ee.getText());
            }
            arrayList.add(nextMap);
        }
        return map;
    }








    /**
     * 从XML字符串中获取标签内容
     * <功能详细描述>
     * @param xmlStr
     * @param eleName
     * @return
     * @see [类、类#方法、类#成员]
     */
    private String getTextFromXml(String xmlStr, String eleName)
    {
        xmlStr = xmlStr.replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll(" ", "");
        String upperCaseXmlStr = xmlStr.toUpperCase(Locale.CHINA);
        eleName = eleName.toUpperCase(Locale.CHINA);
        String[] strs = upperCaseXmlStr.split(eleName);
        int j=0;
        int k=0;
        int endIndex = 0;
        for (int i = 0; i < strs.length; i++)
        {
            String string  = strs[i];
            if('/' != string.charAt(string.length()-1))
            {
                j ++;
            }
            else
            {
                k ++;
            }
            if(j == k)
            {
                break;
            }
            endIndex += strs[i].length() + eleName.length();
        }
        return xmlStr.substring(upperCaseXmlStr.indexOf("<"+eleName)+eleName.length()+2, upperCaseXmlStr.indexOf("</"+eleName+">", endIndex));
    }


}

