package com.utli;

/**
 * @ClassName ZhuangH
 * @Description
 * @Author cy
 * @Date 2019/12/16 16:31
 * @Version 1.0
 */
public class ZhuangH {
    public static void main(String[] args) {
        String data="  `id` bigint(20) NOT NULL COMMENT '主键',\n" +
                "  `sensitive_word` varchar(50) DEFAULT NULL COMMENT '敏感词',\n" +
                "  `create_time` datetime DEFAULT NULL COMMENT '创建时间',\n" +
                "  `update_time` datetime DEFAULT NULL COMMENT '更新时间',";
/**
 *
 */
        String a="/**\n" +
                " * ";
        String b="\n"+
                "*/\n";
        StringBuilder sb=new StringBuilder();

        String rs = data.replaceAll("`", "");
        /*String rsr= rs.replaceAll("\n", "");*/
        String rssr = rs.replaceAll("'", "");
        String[] split = rssr.split(",\n");
        for (String s : split) {
            String[] sp = s.trim().split(" ");
            int num=0;
            for (int i = 0; i < sp.length; i++) {
                if ("COMMENT".equals(sp[i])){
                    num=i;
                }
            }
            sb.append(a);
            for (int i =num+1; i < sp.length; i++) {
                sb.append(sp[i]);
            }
            sb.append(b);

            sb.append("private ");

            if (sp[0].contains("_")){ //转换格式
                String[] spl = sp[0].split("_");
                StringBuilder sbs=new StringBuilder();
                for (int i = 0; i < spl.length; i++) {
                    if (i!=0){
                        char[] chars = spl[i].toCharArray();
                        chars[0] -=32;
                        sbs.append(chars);
                        continue;
                    }
                    sbs.append(spl[i]);
                }
                sp[0]=sbs.toString();
            }

            if (sp[1].contains("bigint")){
                sb.append("Long ").append(sp[0]).append(";\n");
            }else if (sp[1].contains("varchar")){
                sb.append("String ").append(sp[0]).append(";\n");
            }else if (sp[1].contains("int")){
                sb.append("Integer ").append(sp[0]).append(";\n");
            }else if (sp[1].contains("datetime")){
                sb.append("Date ").append(sp[0]).append(";\n");
            }else if (sp[1].contains("longtext")){
                sb.append("String ").append(sp[0]).append(";\n");
            }else if (sp[1].contains("text")){
                sb.append("String ").append(sp[0]).append(";\n");
            }
        }

        System.out.println(sb);
    }


}
