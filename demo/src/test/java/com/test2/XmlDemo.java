package com.test2;

import com.alibaba.fastjson.JSON;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class XmlDemo {

    public static void main(String[] args) {


        Map<String, Object> retMap = new HashMap<String, Object>();

        try {
            /*请求流水	RequestId
            结转时间	RequstTime
            退费号码的	ServId
            退费记录项	RequestItem
                余额类型	BalanceTypeId
                赠送金额单位	DrawAmount
                赠送金额	ObjectType
                最高使用限额	Remark1
                起始时间	Remark2*/
    /*        String RequestId = jsonParam.get("RequestId").toString();
            String RequestTime = jsonParam.get("RequestTime").toString();
            String ServId = jsonParam.get("ServId").toString();
            List<Object> ORequestItem = (List<Object>) jsonParam.get("RequestItem");


            StringBuilder sb = new StringBuilder();
            sb.append("<QryOcsSerial xmlns=\"urn:SmsWBS\">");
            sb.append("<QryOcsSerialReq>");
            sb.append("<QryOcsSerial>");

            sb.append("<RequestId>" + RequestId + "</RequestId>");
            sb.append("<RequestTime>" + RequestTime + "</RequestTime>");
            sb.append("<ServId>" + ServId + "</ServId>");

            for (Object obj : ORequestItem) {
                Map<String, Object> map = (Map<String, Object>) obj;
                String BalanceTypeId = map.get("BalanceTypeId").toString();
                String DrawAmount = map.get("DrawAmount").toString();
                String ObjectType = map.get("ObjectType").toString();
                String Remark1 = map.get("Remark1").toString();
                String Remark2 = map.get("Remark2").toString();
                sb.append("<RequestItem>");
                sb.append("<BalanceTypeId>" + BalanceTypeId + "</BalanceTypeId>");
                sb.append("<DrawAmount>" + DrawAmount + "</DrawAmount>");
                sb.append("<ObjectType>" + ObjectType + "</ObjectType>");
                sb.append("<Remark1>" + Remark1 + "</Remark1>");
                sb.append("<Remark2>" + Remark2 + "</Remark2>");
                sb.append("</RequestItem>");
            }

            sb.append("</RequestItem>");
            sb.append("</QryOcsSerial>");
            sb.append("</QryOcsSerialReq>");
            sb.append("</QryOcsSerial>");*/

            //ServerConfig serverConfig = new ServerConfig();
            /*String url = SysdataLoad.getSysParam("HBBalancePayoutService", "OCS", "888",
                    "HBBalancePayoutServiceImpl");*/String ser="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
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

            String url = "http://134.224.22.77:7006/web/services/CommonService?wsdl";
            String resultStr = doHttpPostXml(url, ser);
            Date now = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            String newTime = dateFormat.format(now);


            retMap =getDataDetail(resultStr, "<root>");
            retMap.put("ResponseTime", newTime);
            String s = JSON.toJSONString(retMap);
            System.out.println(s);

        } catch (Exception e) {


        }


    }

    /**
     * 解析xml字符串
     *
     * @param data
     * @param str
     * @return
     * @throws DocumentException
     */
    public static Map<String, Object> getDataDetail(String data, String str) throws DocumentException {
        Map<String, Object> map = new HashMap<String, Object>();
        int start = data.indexOf(str); //截取的起始位置
        String endStr = str.replaceAll("<", "</");
        int end = data.indexOf(endStr); //截取的重点位置
        String sbData = data.substring(start, end + endStr.length()); // 截取到所需内容字符串

        Document doc = DocumentHelper.parseText(sbData); // 将字符串转为XML
        Element rootElt = doc.getRootElement(); // 获取根节点

        Iterator it = rootElt.elementIterator();
        ArrayList<Map<String, Object>> arrayList = new ArrayList<Map<String, Object>>();
        while (it.hasNext()) {
            Element element = (Element) it.next();

            map = recursionResolver(element, map);
        }
        return map;
    }

    private static Map<String, Object> recursionResolver(Element element, Map<String, Object> map) {
        //HashMap<String, Object> map = new HashMap<String, Object>();
        boolean flg = false;
        List<Element> list = element.elements();
        if (list != null && list.size() == 0) {
            map.put(element.getName(), element.getText());  //第一级
        } else if (list != null && list.size() > 0) {
            String listName = element.getName();

            if (map.size() >= 1) { //1.为了解决数据结构的问题，加个数据重名判断，并进行处理

                Set<String> keySet = map.keySet();
                flg = keySet.contains(listName);
            }
            ArrayList<Map<String, Object>> arrayList = new ArrayList<Map<String, Object>>(); //这里会出现数据结构单一的问题

            if (flg) { //重复的
                arrayList = (ArrayList<Map<String, Object>>) map.get(listName); //把地址指向已有的容器
            }

            map.put(listName, arrayList); //确定容器

            Map<String, Object> nextMap = new HashMap<String, Object>();//下一层的容器

            //Map<String, Object> resultMap = new HashMap<String, Object>();
            for (Element ee : list) {
                //第二级
                nextMap = recursionResolver(ee, nextMap); //这里会出现地址值覆盖，思路是在创建一个map固定地址接受参数
                // resultMap.putAll(nextMap);
                //hashMap.put(ee.getName(), ee.getText());
            }
            arrayList.add(nextMap);
        }
        return map;
    }

    public static String doHttpPostXml(final String wsdlURL, String xmlStr) throws ClientProtocolException, IOException {
        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        // 创建Post请求
        HttpPost httpPost = new HttpPost(wsdlURL);
        StringEntity entity = new StringEntity(xmlStr, "UTF-8");
        // 将数据放入entity中
        httpPost.setEntity(entity);
        httpPost.setHeader("Content-Type", "application/json");
        // 响应模型
        CloseableHttpResponse response = null;
        String result = null;
        try {
            // 由客户端执行(发送)Post请求

            response = httpClient.execute(httpPost);
            // 从响应模型中获取响应实体
            // 注意:和doHttpPostByRestTemplate方法用的不是同一个HttpEntity
            org.apache.http.HttpEntity responseEntity = response.getEntity();

            result = EntityUtils.toString(responseEntity);

        } finally {
            // 释放资源
            if (httpClient != null) {
                httpClient.close();
            }
            if (response != null) {
                response.close();
            }
        }
        return result;
    }
}
