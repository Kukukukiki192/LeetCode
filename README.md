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

# [KamaCoder](https://kamacoder.com/)
## ACM模式IO练习
7.平均绩点

[Java Map集合初始化并赋值](https://blog.csdn.net/AttleeTao/article/details/113546006?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522171695019916800215029053%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=171695019916800215029053&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-3-113546006-null-null.142^v100^pc_search_result_base6&utm_term=Java%20map%E8%B5%8B%E5%80%BC%E6%96%B9%E5%BC%8F&spm=1018.2226.3001.4187)  

[Java输出多位小数（3种方法)](https://blog.csdn.net/weixin_74837727/article/details/130090751?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522171689698716800184122272%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=171689698716800184122272&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_positive~default-1-130090751-null-null.142^v100^pc_search_result_base6&utm_term=java%E4%BF%9D%E7%95%99%E5%B0%8F%E6%95%B0%E7%82%B9%E5%90%8E%E4%B8%89%E4%BD%8D&spm=1018.2226.3001.4187)

#### Map 初始化及赋值4种方法

1. **使用 HashMap 构造器**

    ```java
    Map<String, Integer> map = new HashMap<>();
    map.put("one", 1);
    map.put("two", 2);
    map.put("three", 3);
    ```

2. **使用静态初始化块（Java 8 新特性）**

    通过创建一个匿名内部类，并在其中使用实例初始化块来添加键值对

    ❗这种方法创建了一个匿名子类，可能会增加不必要的开销并且序列化行为可能会变得复杂，因此不推荐在性能关键的代码中使用

    ```java
    Map<String, Integer> map = new HashMap<String, Integer>() {{
        put("one", 1);
        put("two", 2);
        put("three", 3);
    }};
    ```
3. **使用 Map.of 和 Map.ofEntries（Java 9+）**

    适合用于定义常量映射或在多线程环境中使用，创建的 Map 具有以下特点：

    - 不可变：创建后不能修改（不能增删改条目）
    - 不允许空键或空值：若尝试插入空键或空值，会抛出`NullPointerException`
    - 防止重复键：若提供了重复的键，会抛出`IllegalArgumentException`

    ```java
    Map<String, Integer> map = Map.of(
        "one", 1,
        "two", 2,
        "three", 3
    );
    Map<String, Integer> map = Map.ofEntries(
         Map.entry("one", 1),
         Map.entry("two", 2),
         Map.entry("three", 3)
     );
    ```
4. **使用 Guava 库**

    > Guava是Google提供的一个Java核心工具库，包含了大量实用的工具类和方法

    引入 Maven 依赖

    ```xml
    <dependency>
    <groupId>com.google.guava</groupId>
    <artifactId>guava</artifactId>
    <version>31.1-jre</version> <!-- 请根据需要选择最新版本 -->
    </dependency>
    ```
    ```java
    import com.google.common.collect.ImmutableMap;
    import com.google.common.collect.Maps;
    import java.util.Map;
    ...
    // 使用Guava的ImmutableMap进行初始化
    // 不可变 Map,适用于创建常量 Map
    Map<String, Integer> immutableMap = ImmutableMap.of(
    "one", 1,
    "two", 2,
    "three", 3
    );
    
    // 使用Guava的ImmutableMap.Builder进行初始化
    // 不可变 Map,适用于构建一个较大的 Map，或在运行时动态添加元素
    Map<String, Integer> immutableMapWithBuilder = ImmutableMap.<String, Integer>builder()
    .put("one", 1)
    .put("two", 2)
    .put("three", 3)
    .build();
    
    // 使用Guava的Maps.newHashMap进行初始化
    // 可变 Map
    Map<String, Integer> mutableMap = Maps.newHashMap();
    mutableMap.put("one", 1);
    mutableMap.put("two", 2);
    mutableMap.put("three", 3);
    ```

#### 输出多位小数

1. **使用 String.format**

    ```java
    double v = 123.456789;
    String s = String.format("%.2f", v); // 输出：123.46
    ```

2. **使用 printf**

    ```java
    System.out.printf("%.2f%n", v);
    ```

3. **使用 DecimalFormat**

    DecimalFormat 是 NumberFormat 的一个具体子类，用于格式化十进制数字，主要靠 0 和 # 两个占位符号

    ```java
    import java.text.DecimalFormat;

    DecimalFormat df = new DecimalFormat("#.##");
    System.out.println(df.format(v));
    ```

4. **使用 BigDecimal**

    ```java
    import java.math.BigDecimal;
    import java.math.RoundingMode;

    BigDecimal bd = new BigDecimal(v);
    bd = bd.setScale(2, RoundingMode.HALF_UP); // 设置小数位数为2，并四舍五入
    ```

5. **使用 NumberFormat**

    ```java
    import java.text.NumberFormat; // 是 DecimalFormat 的父类
    
    NumberFormat nf = NumberFormat.getNumberInstance();
    nf.setMaximumFractionDigits(2);
    nf.setMinimumFractionDigits(2);
    System.out.println(nf.format(v));
    ```
#### 类型转换
char int
0~9对应ASCII码48~57
```java
char c = '1';
// 输出1的ASCII码49 因为Java把char字符当做ASCII码值来对待,所以char可以直接转成int
int i = c;
int i1 = (int)c;
// 先转为String,再用Integer.parserInt()返回int类型值
String strc = String.valueOf(c);
int intc = Integer.parseInt(strc);
// 利用封装类Character的静态方法
int intc = Character.getNumericValue(numChar);
```
int_char_string三种类型的相互转换





## 设计模式练习
