package Hutool.DateUtil.DB;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.ReflectUtil;
import cn.hutool.db.*;
import cn.hutool.db.ds.DSFactory;
import cn.hutool.db.ds.simple.SimpleDataSource;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.util.function.Function;
import java.util.stream.Collectors;

import static cn.hutool.core.util.SystemPropsUtil.set;

/**
 * @author LY
 * @version 1.0
 * @date 2024/8/29 15:49
 */

public class db {
    public static void main(String[] args) throws SQLException {
        // 数据库连接信息
        String url = "jdbc:mysql://localhost:3306/ecif_cust?serverTimezone=Asia/Shanghai"; // 替换为你的数据库名称
        String user = "root"; // 替换为你的数据库用户名
        String password = "root"; // 替换为你的数据库密码

        // 创建自定义数据源
        SimpleDataSource dataSource = new SimpleDataSource(url, user, password);

        try {
            //查询
            /*List<Entity> users = Db.use(dataSource).query("SELECT * FROM grp_relparty"); // 假设表名为 users
            ArrayList<grpRelparty> list = new ArrayList<>();
            for (Entity entity : users) {
                grpRelparty relparty = new grpRelparty();
                BeanUtil.copyProperties(entity, relparty, true);
                relparty.setGrpRelpartyId("2");
                list.add(relparty);
            }*/
            //新增
           /* Entity entity = Entity.create("grp_relparty").
                    set("grp_Relparty_Id", "112").
                    set("cust_Class_Cd", "1").
                    set("cust_Nm_En", "zhangsna").
                    set("cust_Nm_Ch", "张三").
                    set("ecif_Cust_Nm_Ch", "lisi").
                    set("ecif_Cust_Nm_En", "李四").
                    set("smbc_Flg", "1").
                    set("crdt_Tp", "1").
                    set("crdt_No", "232").
                    set("grp_Relparty_Tp", "").
                    set("vld_Flg", "1").
                    set("ecif_crt_Tm", DateUtil.format(new Date(), "yyyyMMdd")).
                    set("ecif_Upd_Tm", DateUtil.format(new Date(), "yyyyMMdd"));
            Db.use(dataSource).insert(entity);*/
            List<String> list = Arrays.asList("INSERT INTO `ecif_cust`.`grp_relparty` (`GRP_RELPARTY_ID`, `CUST_CLASS_CD`, `CUST_NM_EN`, `CUST_NM_CH`, `ECIF_CUST_NM_CH`, `ECIF_CUST_NM_EN`, `SMBC_FLG`, `CRDT_TP`, `CRDT_NO`, `GRP_RELPARTY_TP`, `RGST_ADDR`, `REL_EFF_DT`, `DEL_DT`, `CUST_ID`, `VLD_FLG`, `CRT_SRC_STM_TM`, `CRT_SRC_STM_NO`, `CRT_ORG`, `CRT_USER`, `CRT_AU_USER`, `ECIF_CRT_TM`, `UPD_SRC_STM_TM`, `UPD_SRC_STM_NO`, `UPD_ORG`, `UPD_USER`, `UPD_AU_USER`, `ECIF_UPD_TM`) VALUES ('3', '1', 'zhangsna', '张三', 'lisi', '李四', '1', '1', '232', '', NULL, NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, '2024-08-30 00:00:00.000000', NULL, NULL, NULL, NULL, NULL, '2024-08-30 00:00:00.000000');\n",
                    "INSERT INTO `ecif_cust`.`grp_relparty` (`GRP_RELPARTY_ID`, `CUST_CLASS_CD`, `CUST_NM_EN`, `CUST_NM_CH`, `ECIF_CUST_NM_CH`, `ECIF_CUST_NM_EN`, `SMBC_FLG`, `CRDT_TP`, `CRDT_NO`, `GRP_RELPARTY_TP`, `RGST_ADDR`, `REL_EFF_DT`, `DEL_DT`, `CUST_ID`, `VLD_FLG`, `CRT_SRC_STM_TM`, `CRT_SRC_STM_NO`, `CRT_ORG`, `CRT_USER`, `CRT_AU_USER`, `ECIF_CRT_TM`, `UPD_SRC_STM_TM`, `UPD_SRC_STM_NO`, `UPD_ORG`, `UPD_USER`, `UPD_AU_USER`, `ECIF_UPD_TM`) VALUES ('4', '1', 'zhangsna', '张三', 'lisi', '李四', '1', '1', '232', '', NULL, NULL, NULL, NULL, '1', NULL, NULL, NULL, NULL, NULL, '2024-08-30 00:00:00.000000', NULL, NULL, NULL, NULL, NULL, '2024-08-30 00:00:00.000000');\n"
                    , "update grp_relparty set cust_nm_ch='小三' where grp_relparty_id='3'");
           // Db.use(dataSource).executeBatch(list);
            Db.use(dataSource).del("grp_relparty","grp_relparty_id","3");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}

