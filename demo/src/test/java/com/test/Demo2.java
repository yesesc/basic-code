package com.test;


import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        String srr= "latnId\tVARCHAR2 (8)\t1\t受理地市\tLATN_ID\n" +
                        "balanceTypeFlag\tNUMBER (4)\t1\t账本类型分类 \tBALANCE_TYPE_FLAG\n" +
                        "acctBalanceId\tNUMBER (16)\t1\t操作流水所对应的余额帐本标识\tACCT_BALANCE_ID\n" +
                        "acctId\tNUMBER (10)\t1\t账户编号\tACCT_ID\n" +
                        "accNum\tVARCHAR2 (30)\t1\t服务号码\tACC_NUM\n" +
                        "allowDraw\tVARCHAR2 (3)\t1\t允许提取标志\tALLOW_DRAW\n" +
                        "amount\tNUMBER (12)\t1\t操作的金额\tAMOUNT\n" +
                        "balanceAccType\tNUMBER (9)\t1\t余额对象帐本关系\t0\n" +
                        "balanceSourceType\tNUMBER (9)\t1\t来源类型标识\tBALANCE_SOURCE_TYPE_ID\n" +
                        "balanceType\tNUMBER (4)\t1\t账本类型\tBALANCE_TYPE_ID\n" +
                        "bankSerialNbr\tVARCHAR2 (30)\t1\t银行流水号\tBANK_SERIAL_NBR\n" +
                        "bankId\tNUMBER (4)\t1\t银行编号\tINTERFACE_ID\n" +
                        "orgId\tVARCHAR2 (16)\t1\t所属营业厅\tORG_ID\n" +
                        "checkNbr\tVARCHAR2 (30)\t1\t支票号\t空\n" +
                        "cityCode\tVARCHAR2 (8)\t1\t城市代码\tLATN_ID\n" +
                        "curAmount\tNUMBER (12)\t1\t剩余金额\tCUR_AMOUNT\n" +
                        "curStatus\tVARCHAR2 (3)\t1\t当前使用状态\t5TA\n" +
                        "curDate\tDATE\t1\t当前使用时间\tPAYMENT_DATE\n" +
                        "curBalance\tNUMBER (12)\t1\t当前可用余额\tCUR_AMOUNT\n" +
                        "custId\tNUMBER (10)\t1\t客户编号\tCUST_ID\n" +
                        "invoiceNum\tVARCHAR2 (20)\t1\t发票号\tINVOICE_NUM\n" +
                        "invCustId\tVARCHAR2 (3)\t1\t提供发票标志\tINVOICE_ID\n" +
                        "ip\tVARCHAR2 (30)\t1\t终端IP地址\t空\n" +
                        "cancleType\tDATE\t1\t取消类型\t空\n" +
                        "noPayNumber\tNUMBER (10)\t1\t被返销流水号\tOPERATED_PAYMENT_SERIAL_NBR\n" +
                        "noPayPerson\tVARCHAR2 (20)\t1\t返销人\tnoPayPerson\n" +
                        "staffName\tVARCHAR2 (20)\t1\t操作员\tSTAFF_NAME\n" +
                        "paymentDate\tDATE\t1\t操作发生的时间\tPAYMENT_DATE\n" +
                        "operIncomeId\tNUMBER (12)\t1\t为每个余额流水生成的唯一编号，只具有逻辑上的含义，没有物理意义。\tOPER_INCOME_ID\n" +
                        "operType\tVARCHAR2 (3)\t1\t存/转/补等操作\tOPER_TYPE\n" +
                        "paymentId\tNUMBER (12)\t1\tPAYMENT_ID\tPAYMENT_ID\n" +
                        "operationType\tNUMBER (4)\t1\t付费类型\tOPERATION_TYPE\n" +
                        "agentId\tVARCHAR2 (12)\t1\t缴费代理商\t---如果是代理商缴费就写代理商id，不是就null\n" +
                        "collectType\tNUMBER (2)\t1\t收取类型\t1\n" +
                        "reason\tVARCHAR2 (250)\t1\t退费原因\t空\n" +
                        "serviceKind\tNUMBER (4)\t1\t服务类型\tserviceKind\n" +
                        "prodInstId\tNUMBER (10)\t1\t用户编号\tPROD_INST_ID\n" +
                        "staffId\tNUMBER (9)\t1\t操作工号\tSTAFF_ID\n" +
                        "usedStatus\tVARCHAR2 (3)\t1\t已生成；已部分使用；已使用完；\t00A\n" +
                        "statusDate\tDATE\t1\t状态发生改变的时间\tPAYMENT_DATE\n" +
                        "preDefineId\tNUMBER (9)\t1\t分月转兑方案\tPRE_DEFINE_ID";


        String[] split = srr.split("\n");
        /*for (String s1:split){
            String[] ss = s1.split("\t");
            s1=ss[0]+","+ss[4];
        }*/
        for (int i=0;i<split.length;i++){
            String[] strings = split[i].split("\t");
            split[i]=strings[0]+","+strings[4];
        }

        out("D:\\新建文件夹","utf-8","a.txt",split);

        /*String ss = srr.replaceAll("\t", ",");
        String[] split = ss.split("\n");


        System.out.println(split[0]);
        System.out.println(split[2]);
        System.out.println(split[3]);*/
        /*for (String str:split){
            System.out.println();
            *//*String[] strings = str.split(",");
            for (String sss:strings){

                System.out.println(sss);
            }*//*
        }*/


    }

    public static void out(String site, String format,String name,String[] data){
        FileOutputStream fos=null;
        OutputStreamWriter osw = null;
        BufferedWriter bw=null;
        File file=null;
        try {
            file=new File(site);
            if (!file.isFile()){
                file.mkdirs();
            }
            //String startName = name.substring(0, name.lastIndexOf("."))+".html";
            file=new File(file,name);
            fos=new FileOutputStream(file);
            osw=new OutputStreamWriter(fos,format);
            bw=new BufferedWriter(osw);
            for (String map:data){

                bw.write(map);
                bw.write(";");
            }
        }catch (Exception e){
            e.printStackTrace();
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
    }
}
