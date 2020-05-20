package com.test2;

import com.alibaba.fastjson.JSON;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.*;

public class HttpXmlDemo {
    public static void main(String[] args) throws DocumentException {

        String data="<?xml version=\"1.0\" encoding=\"gb2312\" ?> \n" +
                "<ReChargeRsq>\n" +
                "  <ResponseId>102013071816151021926870389</ResponseId> \n" +
                "  <ResponseTime>20130719172352</ResponseTime> \n" +
                "  <ResultCode>0</ResultCode> \n" +
                "  <ResponseAmount>0</ResponseAmount> \n" +
                "  <AcctBalanceID>832021450325</AcctBalanceID> \n" +
                "  <BalanceTypeID>2000</BalanceTypeID> \n" +
                "  <AcctID>33215791</AcctID> \n" +
                "  <ITEM_GROUP_ID>5</ITEM_GROUP_ID> \n" +
                "  <PRIORITY>101000</PRIORITY> \n" +
                "  <Balance>5000</Balance> \n" +
                "  <ReserveBalance>0</ReserveBalance> \n" +
                "  <CycleUpper>99999900</CycleUpper> \n" +
                "  <CycleLower>-99999900</CycleLower> \n" +
                "  <CycleUpperType>5LA</CycleUpperType> \n" +
                "  <CycleLowerType>5LA</CycleLowerType> \n" +
                "  <ADJUST_FLAG>5CA</ADJUST_FLAG> \n" +
                "  <ALLOW_TRANS>5CA</ALLOW_TRANS> \n" +
                "  <EffDate>19690101000000</EffDate> \n" +
                "  <ExpDate>20300322000000</ExpDate> \n" +
                "  <State>00A</State> \n" +
                "  <StateDate>20130719171258</StateDate> \n" +
                "  <RegionID>793</RegionID> \n" +
                "  <UseRuleFlag>F</UseRuleFlag> \n" +
                "  <BalancePrint>0</BalancePrint> \n" +
                "  </ReChargeRsq>";

        Map<String, Object> map = analysisXml(data);
        String s = JSON.toJSONString(map);
        System.out.println(s);
    }

    public static Map<String,Object> analysisXml(String data) throws DocumentException {
        Map<String, Object> map = new HashMap<String, Object>();
        int start = "<?xml version=\"1.0\" encoding=\"gb2312\" ?>".length(); //截取的起始位置
        StringBuffer sb =new StringBuffer(data);
        String s = sb.insert(start, "<root>").append("</root>").toString();
        Document doc = DocumentHelper.parseText(s);
        Element rootElt = doc.getRootElement();
        Iterator it = rootElt.elementIterator();
        ArrayList<Map<String, Object>> arrayList=  new ArrayList<Map<String, Object>>();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            List<Element> list = element.elements();
            Map<String, Object> eleMap = new HashMap<String, Object>();
            for (Element ele : list) {
                eleMap.put(ele.getName(),ele.getText());
            }
            map.put(element.getName(),eleMap);
        }
        return map;
    }
}
