/**
 * 题目Id：剑指 Offer 37
 * 题目：序列化二叉树
 * 日期：2023-04-18 16:12:29
 */
//请实现两个函数，分别用来序列化和反序列化二叉树。 
//
// 你需要设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字
//符串反序列化为原始的树结构。 
//
// 提示：输入输出格式与 LeetCode 目前使用的方式一致，详情请参阅 LeetCode 序列化二叉树的格式。你并非必须采取这种方式，你也可以采用其他的方
//法解决这个问题。 
//
// 
//
// 示例： 
// 
// 
//输入：root = [1,2,3,null,null,4,5]
//输出：[1,2,3,null,null,4,5]
// 
//
// 
//
// 注意：本题与主站 297 题相同：https://leetcode-cn.com/problems/serialize-and-deserialize-
//binary-tree/ 
//
// Related Topics 树 深度优先搜索 广度优先搜索 设计 字符串 二叉树 👍 392 👎 0

package leetcode.editor.cn;

//Java：序列化二叉树
public class POffer37_XuLieHuaErChaShuLcof {
    public static void main(String[] args) {
        Codec codec = new POffer37_XuLieHuaErChaShuLcof().new Codec();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            return null;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            return null;
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
//leetcode submit region end(Prohibit modification and deletion)

}

/**
 * 自定义 UDF 函数，需要继承 GenericUDF 类
 * 需求: 计算指定字符串的长度
 */
//public class MyStringLength extends GenericUDF {
//    /**
//     * @param arguments 输入参数类型的鉴别器对象
//     * @return 返回值类型的鉴别器对象
//     * @throws UDFArgumentException
//     */
//    @Override
//    public ObjectInspector initialize(ObjectInspector[] arguments) throws UDFArgumentException {
//        // 判断输入参数的个数
//        if (arguments.length != 1) {
//            throw new UDFArgumentLengthException("Input Args Length Error!!!");
//        }
//        // 判断输入参数的类型
//        if (!arguments[0].getCategory().equals(ObjectInspector.Category.PRIMITIVE)
//        ) {
//            throw new UDFArgumentTypeException(0, "Input Args Type Error!!!");
//        }
//        //函数本身返回值为 int，需要返回 int 类型的鉴别器对象
//        return PrimitiveObjectInspectorFactory.javaIntObjectInspector;
//    }
//
//    /**
//     * 函数的逻辑处理
//     *
//     * @param arguments 输入的参数
//     * @return 返回值
//     * @throws HiveException
//     */
//    @Override
//    public Object evaluate(DeferredObject[] arguments) throws HiveException {
//        if (arguments[0].get() == null) {
//            return 0;
//        }
//        return arguments[0].get().toString().length();
//    }
//
//    @Override
//    public String getDisplayString(String[] children) {
//        return "";
//    }
//}