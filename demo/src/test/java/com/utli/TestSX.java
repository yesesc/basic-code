package com.utli;

import java.util.ArrayList;
import java.util.List;

public class TestSX {
    public static void main(String[] args) {
        List<String> accNumList = new ArrayList<String>();
        int QRY_INVALID_FLAG=0;
        String[] accList={"115720023^移动电话^10^13358876163^100000^100148^^1201^64276630^900100148^65809107^910^^64276630^20131127094659^^20131127094552^20370101000000","247993683^天翼宽带-有线宽带^10^h024lxxc6163^110000^230032^h024lxxc6163^1201^64276630^900230032^65809107^910^^64276630^20150609145045^^20150609145024^20170809132543"};
        for (int j = 0; j < accList.length; j++) {
            // String[] aProd1 = accList.get(0).split("\\^", -1);
            String[] aProd1 = accList[j].split("\\^", -1);	//modify by airx 20191026当有多条时候会报错
            int state = Integer.parseInt(aProd1[4]);
            if (QRY_INVALID_FLAG == 0){
                if (state != 100000 && state != 120000) {
                    continue;
                }
            }else {
                if (state != 110000) {
                    continue;
                }
            }
            accNumList.add(aProd1[3]);
        }
        System.out.println(accNumList.size());
    }


}
