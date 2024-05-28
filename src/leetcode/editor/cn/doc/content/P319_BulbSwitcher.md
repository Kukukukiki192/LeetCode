<p>初始时有&nbsp;<code>n</code><em> </em>个灯泡处于关闭状态。第一轮，你将会打开所有灯泡。接下来的第二轮，你将会每两个灯泡关闭第二个。</p>

<p>第三轮，你每三个灯泡就切换第三个灯泡的开关（即，打开变关闭，关闭变打开）。第 <code>i</code> 轮，你每 <code>i</code> 个灯泡就切换第 <code>i</code> 个灯泡的开关。直到第 <code>n</code> 轮，你只需要切换最后一个灯泡的开关。</p>

<p>找出并返回 <code>n</code><em>&nbsp;</em>轮后有多少个亮着的灯泡。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2020/11/05/bulb.jpg" style="width: 421px; height: 321px;" /></p>

<pre>
<strong>输入：</strong>n =<strong> </strong>3
<strong>输出：</strong>1 
<strong>解释：</strong>
初始时, 灯泡状态 <strong>[关闭, 关闭, 关闭]</strong>.
第一轮后, 灯泡状态 <strong>[开启, 开启, 开启]</strong>.
第二轮后, 灯泡状态 <strong>[开启, 关闭, 开启]</strong>.
第三轮后, 灯泡状态 <strong>[开启, 关闭, 关闭]</strong>. 

你应该返回 1，因为只有一个灯泡还亮着。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>n = 0
<strong>输出：</strong>0
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>n = 1
<strong>输出：</strong>1
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>0 &lt;= n &lt;= 10<sup>9</sup></code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>脑筋急转弯 | 数学</details><br>

<div>👍 358, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.gitee.io/article/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.github.io/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：[数据结构精品课](https://aep.h5.xeknow.com/s/1XJHEO) 和 [递归算法专题课](https://aep.xet.tech/s/3YGcq3) 即将涨价，[第 20 期打卡挑战](https://opedk.xet.tech/s/1cEM6U) 即将开始，最后 1 天报名！**



<p><strong><a href="https://labuladong.gitee.io/article/slug.html?slug=bulb-switcher" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

PS：这道题在[《算法小抄》](https://item.jd.com/12759911.html) 的第 414 页。

因为电灯一开始都是关闭的，所以某一盏灯最后如果是点亮的，必然要被按奇数次开关。

我们假设只有 16 盏灯，对于第十六盏灯会被按几次？

被按的次数就是 16 不同因子的个数，因为 `16 = 1*16 = 2*8 = 4*4`，其中因子 4 重复出现，所以第 16 盏灯会被按 5 次，奇数次。

一个正整数 `n` 的不同因子有几个？就是 `n` 的平方根向下取整，也就是这个问题的答案。

**详细题解：[一行代码就能解决的算法题](https://labuladong.github.io/article/fname.html?fname=一行代码解决的智力题)**

**标签：[数学](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2122023604245659649)**

## 解法代码

提示：🟢 标记的是我写的解法代码，🤖 标记的是 chatGPT 翻译的多语言解法代码。如有错误，可以 [点这里](https://github.com/labuladong/fucking-algorithm/issues/1113) 反馈和修正。

<div class="tab-panel"><div class="tab-nav">
<button data-tab-item="cpp" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">cpp🤖</button>

<button data-tab-item="python" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">python🤖</button>

<button data-tab-item="java" class="tab-nav-button btn active" data-tab-group="default" onclick="switchTab(this)">java🟢</button>

<button data-tab-item="go" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">go🤖</button>

<button data-tab-item="javascript" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">javascript🤖</button>
</div><div class="tab-content">
<div data-tab-item="cpp" class="tab-item " data-tab-group="default"><div class="highlight">

```cpp
// 注意：cpp 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

class Solution {
public:
    int bulbSwitch(int n) {
        return (int) sqrt(n);
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
# 本代码已经通过力扣的测试用例，应该可直接成功提交。

class Solution:
    def bulbSwitch(self, n: int) -> int:
        return int(n ** 0.5)
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

func bulbSwitch(n int) int {
    return int(math.Sqrt(float64(n)))
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

/**
 * @param {number} n
 * @return {number}
 */
var bulbSwitch = function(n) {
  return Math.floor(Math.sqrt(n));
};
```

</div></div>
</div></div>

<details open><summary><strong>🍭🍭 算法可视化 🍭🍭</strong></summary><div id="data_bulb-switcher" data="G6oLAIzEOCbyooiVg0JkXK56fSd97Tp4OVFlM0GspdAx87/fr4k2PJud2RSIbEkLJd773h7EVpIZJJe/D5XEkKwxJEIlJ0rhIZt2MVmkP2b+IBvNy8p7/1tRiUV5TzZfGLis7kqVQxiprofA3WZFpoz/MF3E1PbydIXC+1DEEblPYf5JDWVBr7K+MtGpeFDJlFnjlJBN2f1H/ym+YlgI66a5eu2xhbTC65TMB69+fnpexcAVrD73q2LEZeHRty84SYyqK6io0n9HNkWqxj3dlTcW4VENRDe92QhOrzibwJy5MZBzeWbkx3IMQcDsCUT9PxLecIwABS3glLUt5whvqBXZUHwq7TBf4fjCSy+HVsXdJun0atGA0XBCz0nfjE06g/ml/pHbBoT9ICFbrNVclPcOJ4Frs082U8NJoSmdJa2NYVOg8G22o4PC2eQn9SnrMnFMobcFQzItd3kXyt5ccw3cN51ON8LzUBu3gjGWpM0g/SvtK2ypBp11DNmiKNIX434xwZy7lIJEjSyx5hwDpcNkhZ3TMBrXlwlMYCarh/bmVa6KM9Q89JVnW9Uis8GG7c9qzU6VEkknV4xPWovKqRrMld2YIAMlvFBgskDXJ8/sFfFYo/ZqDOYif0yQGBmMEm8y616O0ZH+18EIa4YoFPpfBxwzCylVYlJHDpU1EAzWOJLFcWCCyfyDslTbAa41uoqH5yiQsyfulZ/f3mYIgyVKfHqCkCkqVKiOa5GN8eXt27LMcnuhUzYv9p0uLrkWiyLU+MXPVJatkYIefW6vfwtfnomIw87PQJb7VAo8uBksr5gY+tYPRr61Z8q4426tOiHG2N0HpGx954cRmD4moxL+2fOshtFZAXY5RmjsWQq1E9FS1wbOGd3wNkMAlUYhH5YgEcHodEAo/VGNEKzHIWKDlEAEDUh49N0lyFUnIoTcJciWa1cNgpbst2Ashfbs8la9u6qGyF6/1JMWuO7hkEpFBRnt9T8v7bjtG3Bn2745j+gsBsetM9W6n9/ewkdZgDYT0peTIXpMYtfqCuPALaoInIwE2sasTPiTFVzpqHhuVcBQPDEsBwgEYQ3xMMbS4pVfUO8WdY+4SMRToTy7hM7WhukJhR9cTOa6lSdaTWxGhZWcWZBOZhGj9KPSqd9O08dLw1CewGf+exveU3oX7mRz8kqVPj7onYoq6p6/3F5cSFkmF5Mnv7pMHULCydOkgMzhAXMtxm+X5GDAEyApJZnJlvPJgZH9G9sbTNfV7GI2XzJsPL8/floQ3hLZLf+Eu/wQdegMsxTJ2pB7pW6MzVclkC7BhRg5AQ=="></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_bulb-switcher"></div></div>
</details><hr /><br />

**类似题目**：
  - [292. Nim 游戏 🟢](/problems/nim-game)
  - [877. 石子游戏 🟠](/problems/stone-game)

</details>
</div>



