package Hutool.DateUtil.DB;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

import java.util.LinkedHashMap;

/**
 * @author LY
 * @version 1.0
 * @date 2024/8/30 10:48
 */
@Data
public class grpRelparty {
    //   // public static void main(String[] args) {
//
//        LinkedHashMap<String, String> map = new LinkedHashMap<>();
//        map.put("1", "grp_relparty_id");
//        map.put("2", "cust_class_cd");
//        map.put("3", "cust_nm_en");
//        map.put("4", "cust_nm_ch");
//        map.put("5", "ecif_cust_nm_ch");
//        map.put("6", "ecif_cust_nm_en");
//        map.put("7", "smbc_flg");
//        map.put("8", "crdt_tp");
//        map.put("11", "crdt_no");
//        map.put("321", "grp_relparty_tp");
//        map.put("312", "rgst_addr");
//        map.put("21", "rel_eff_dt");
//        map.put("22", "del_dt");
//        map.put("23", "cust_id");
//        map.put("34", "vld_flg");
//        map.put("211", "crt_src_stm_tm");
//        map.put("12", "crt_src_stm_no");
//        map.put("234", "crt_org");
//        map.put("54", "crt_user");
//        map.put("55", "crt_au_user");
//        map.put("44", "ecif_crt_tm");
//        map.put("66", "upd_src_stm_tm");
//        map.put("88", "upd_src_stm_no");
//        map.put("32", "upd_org");
//        map.put("33", "upd_user");
//        map.put("35", "upd_au_user");
//        map.put("65", "ecif_upd_tm");
//        map.forEach((k, v) -> {
//            String camelCase = StrUtil.toCamelCase(v);
//            System.out.println(camelCase);
//        });
//    }
    private String grpRelpartyId;
    private String custClassCd;
    private String custNmEn;
    private String custNmCh;
    private String ecifCustNmCh;
    private String ecifCustNmEn;
    private String smbcFlg;
    private String crdtTp;
    private String crdtNo;
    private String grpRelpartyTp;
    private String rgstAddr;
    private String relEffDt;
    private String delDt;
    private String custId;
    private String vldFlg;
    private String crtSrcStmTm;
    private String crtSrcStmNo;
    private String crtOrg;
    private String crtUser;
    private String crtAuUser;
    private String ecifCrtTm;
    private String updSrcStmTm;
    private String updSrcStmNo;
    private String updOrg;
    private String updUser;
    private String updAuUser;
    private String ecifUpdTm;
}

