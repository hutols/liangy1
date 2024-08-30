package Hutool.DateUtil.TreeUtil;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNode;
import cn.hutool.core.lang.tree.TreeNodeConfig;
import cn.hutool.core.lang.tree.TreeUtil;
import cn.hutool.json.JSONUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AClothClassVo {
    private Integer id;
    private String name;
    private Integer pid;
    private Integer status;
    private String desc;
    // 子目录列表
    private List<AClothClassVo> treeNode;
 
    public static void main(String[] args) {
        // 构建数据
        List<AClothClassVo> lists = CollUtil.newArrayList();
        lists.add(new AClothClassVo(1, "顶级目录1", 0, 1, "父目录01", null));
        lists.add(new AClothClassVo(2, "顶级目录2", 0, 1, "父目录02", null));
        lists.add(new AClothClassVo(3, "顶级目录3", 0, 1, "父目录03", null));
        lists.add(new AClothClassVo(4, "二级目录4", 1, 1, "父目录01的子类", null));
        lists.add(new AClothClassVo(5, "三级目录5", 4, 1, null, null));
        lists.add(new AClothClassVo(6, "四级目录6", 5, 1, null, null));
        lists.add(new AClothClassVo(7, "二级目录7", 2, 1, "父目录01的子类7", null));
        lists.add(new AClothClassVo(8, "二级目录8", 2, 1, "父目录01的子类8", null));
        lists.add(new AClothClassVo(9, "三级目录9", 4, 1, null, null));
 
        TreeNodeConfig config = new TreeNodeConfig();
 
        // 树形数据中id的属性名,写成id1方便区分,实际上写AClothClassVo实体类的id属性名
        config.setIdKey("id");
 
        // 展示目录深度,数据中一共四级目录
        config.setDeep(6);
 
        /**
         * 入参
         * tree:  最终要返回的数据
         * node:  lists数据
         *
         * 返回
         * Tree<String>
         *   Tree: 转换的实体 为数据源里的对象类型
         *   String: ID类型
         *
         */
 
        List<Tree<String>> list = TreeUtil.build(lists, "0", config, (node, tree) -> {
            tree.setId(node.getId().toString());
            tree.setName(node.getName());
            tree.setParentId(node.getPid().toString());
 
            // 额外的值
            tree.put("status", node.getStatus());
            tree.put("desc", node.getDesc());
        });

        //System.out.println(JSONUtil.toJsonPrettyStr(list));


        // 构建node列表(数据源)
        List<TreeNode<String>> nodeList = CollUtil.newArrayList();
        nodeList.add(new TreeNode<>("1", "0", "系统管理", 5));
        nodeList.add(new TreeNode<>("11", "1", "用户管理", 222222));
        nodeList.add(new TreeNode<>("111", "11", "用户添加", 0));
        nodeList.add(new TreeNode<>("2", "0", "店铺管理", 1));
        nodeList.add(new TreeNode<>("21", "2", "商品管理", 44));
        nodeList.add(new TreeNode<>("221", "2", "商品管理2", 2));
        // 0表示最顶层的id是0
        List<Tree<String>> treeList = TreeUtil.build(nodeList, "0");
        System.out.println(
                JSONUtil.toJsonPrettyStr(treeList));

    }
}