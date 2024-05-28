# LeetCode
> 刷题参考《labuladong 的算法小抄》https://labuladong.github.io/algo/

# :zero: 核心框架汇总​

二叉树

- 深度优先遍历 Depth First Search - **DFS** 
  - 前/中/后序遍历 代码执行顺序: 前序位置-自顶向下 后序位置-自底向上

     <img src="C:\Users\K\AppData\Roaming\Typora\typora-user-images\image-20221202164754549.png" alt="image-20221202164754549" style="zoom:25%;" />

- 广度优先遍历 Breath First Search - **BFS**

1、你理解的二叉树的前中后序遍历是什么，仅仅是三个顺序不同的 List 吗？

**前中后序是遍历二叉树过程中处理每一个节点的三个特殊时间点**，绝不仅仅是三个顺序不同的 List：

前序位置的代码在刚刚进入一个二叉树节点时执行

后序位置的代码在将要离开一个二叉树节点时执行

中序位置的代码在一个二叉树节点左子树都遍历完，即将开始遍历右子树时执行

**每个节点都有「唯一」属于自己的前中后序位置**

为什么多叉树没有中序位置?

因为二叉树的每个节点只会进行唯一一次左子树切换右子树，而多叉树节点可能有很多子节点，会多次切换子树去遍历，所以多叉树节点没有「唯一」的中序遍历位置

2、请分析，后序遍历有什么特殊之处？

3、请分析，为什么多叉树没有中序遍历？

通用思考过程：

**1、是否可以通过遍历一遍二叉树得到答案**？如果可以，用一个 `traverse` 函数配合外部变量来实现。

**2、是否可以定义一个递归函数，通过子问题（子树）的答案推导出原问题的答案**？如果可以，写出这个递归函数的定义，并充分利用这个函数的返回值。

**3、无论使用哪一种思维模式，你都要明白二叉树的每一个节点需要做什么，需要在什么时候（前中后序）做**

[104. 二叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-binary-tree/)

[144. 二叉树的前序遍历](https://leetcode.cn/problems/binary-tree-preorder-traversal/)

[543. 二叉树的直径](https://leetcode.cn/problems/diameter-of-binary-tree/)

[剑指 Offer 55 - I. 二叉树的深度](https://leetcode.cn/problems/er-cha-shu-de-shen-du-lcof/)