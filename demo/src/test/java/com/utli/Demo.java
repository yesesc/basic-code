package com.utli;

public class Demo {
    public static void main(String[] args) {


        String s="SF_IAS_QRY_ACCT_INFO\n" +
                "SF_IAS_QRY_CUST_INFO\n" +
                "SF_IAS_QRY_MAINNBR_INFO\n" +
                "SF_IAS_QRY_OFFER_INFO\n" +
                "SF_IAS_ADJUST_BILL_TYPE\n" +
                "SF_IAS_QRY_XACCT_ITEM\n" +
                "SF_IAS_QRY_ACCT_ITEM_DATA_FEE\n" +
                "SF_IAS_ACCT_COUNT_PROD_ATTR\n" +
                "SF_IAS_QRY_REAL_FEE_INFO_BILL\n" +
                "SF_IAS_QRY_REAL_FEE_INFO\n" +
                "SF_IAS_FEE_INFO_DEAL\n" +
                "SF_IAS_QRY_FEE_INFO\n" +
                "SF_IAS_QRY_LATEFEE_DISC\n" +
                "SF_IAS_QRY_CUST_FEE_INFO\n" +
                "SF_IAS_PAY_QRY_ACCT_BAL_JX\n" +
                "SF_IAS_QRY_XACCT_ITEM_VIRTUAL_JX\n" +
                "SF_IAS_PAY_CALC_LATEFEE\n" +
                "SF_IAS_CREATE_FEE\n" +
                "SF_IAS_DCA_QRY_OFFER_INST_INFO\n" +
                "SF_IAS_CREATE_FEE\n" +
                "SF_IAS_QRY_PREPAY_RATABLE_TOTAL\n" +
                "SF_IAS_QRY_POSTPAY_RATABLE_TOTAL\n" +
                "SF_IAS_COLLECT_RATABLE_TOTAL\n" +
                "SF_IAS_DPRINT_CREATE_DATA\n" +
                "SF_IAS_QRY_BIL_REMARK_INFO\n" +
                "SF_IAS_DPRINT_CREATE_DATA\n" +
                "SF_IAS_QRY_HADINVOICE_AMOUNT\n" +
                "SF_IAS_QRY_PRESENT_RECORDS\n" +
                "SF_IAS_QRY_PNT\n" +
                "SF_IAS_QRY_SIX_MONTH_FEE\n" +
                "SF_IAS_RETURN_ACCTITEM_FOR_FRONT\n" +
                "SF_IAS_RETURN_ACCTITEM";

        System.out.println(test(s));
    }

    public static String test(String s){
        String data = s.replaceAll("\n", ",");
        return data;
    }
}
