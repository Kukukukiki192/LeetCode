<p>你和你的朋友，两个人一起玩&nbsp;<a href="https://baike.baidu.com/item/Nim游戏/6737105" target="_blank">Nim 游戏</a>：</p>

<ul> 
 <li>桌子上有一堆石头。</li> 
 <li>你们轮流进行自己的回合，&nbsp;<strong>你作为先手&nbsp;</strong>。</li> 
 <li>每一回合，轮到的人拿掉&nbsp;1 - 3 块石头。</li> 
 <li>拿掉最后一块石头的人就是获胜者。</li> 
</ul>

<p>假设你们每一步都是最优解。请编写一个函数，来判断你是否可以在给定石头数量为 <code>n</code> 的情况下赢得游戏。如果可以赢，返回 <code>true</code>；否则，返回 <code>false</code> 。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong><span><code>n = 4</code></span>
<strong>输出：</strong>false 
<strong>解释：</strong>以下是可能的结果:
1. 移除1颗石头。你的朋友移走了3块石头，包括最后一块。你的朋友赢了。
2. 移除2个石子。你的朋友移走2块石头，包括最后一块。你的朋友赢了。
3.你移走3颗石子。你的朋友移走了最后一块石头。你的朋友赢了。
在所有结果中，你的朋友是赢家。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>n = 1
<strong>输出：</strong>true
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>n = 2
<strong>输出：</strong>true
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= n &lt;= 2<sup>31</sup> - 1</code></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>脑筋急转弯 | 数学 | 博弈</details><br>

<div>👍 685, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.gitee.io/article/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.github.io/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：[数据结构精品课](https://aep.h5.xeknow.com/s/1XJHEO) 和 [递归算法专题课](https://aep.xet.tech/s/3YGcq3) 即将涨价，[第 20 期打卡挑战](https://opedk.xet.tech/s/1cEM6U) 即将开始，最后 1 天报名！**



<p><strong><a href="https://labuladong.gitee.io/article/slug.html?slug=nim-game" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

PS：这道题在[《算法小抄》](https://item.jd.com/12759911.html) 的第 414 页。

**我们解决这种问题的思路一般都是反着思考**：

如果我能赢，那么最后轮到我取石子的时候必须要剩下 1~3 颗石子，这样我才能一把拿完。

如何营造这样的一个局面呢？显然，如果对手拿的时候只剩 4 颗石子，那么无论他怎么拿，总会剩下 1~3 颗石子，我就能赢。

如何逼迫对手面对 4 颗石子呢？要想办法，让我选择的时候还有 5~7 颗石子，这样的话我就有把握让对方不得不面对 4 颗石子。

如何营造 5~7 颗石子的局面呢？让对手面对 8 颗石子，无论他怎么拿，都会给我剩下 5~7 颗，我就能赢。

这样一直循环下去，我们发现只要踩到 4 的倍数，就落入了圈套，永远逃不出 4 的倍数，而且一定会输。

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
    bool canWinNim(int n) {
        // 如果上来就踩到 4 的倍数，那就认输吧
        // 否则，可以把对方控制在 4 的倍数，必胜
        return n % 4 != 0;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
# 本代码已经通过力扣的测试用例，应该可直接成功提交。

class Solution:
    def canWinNim(self, n: int) -> bool:
        # 如果上来就踩到 4 的倍数，那就认输吧
        # 否则，可以把对方控制在 4 的倍数，必胜
        return n % 4 != 0
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public boolean canWinNim(int n) {
        // 如果上来就踩到 4 的倍数，那就认输吧
        // 否则，可以把对方控制在 4 的倍数，必胜
        return n % 4 != 0;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

func canWinNim(n int) bool {
    // 如果上来就踩到 4 的倍数，那就认输吧
    // 否则，可以把对方控制在 4 的倍数，必胜
    return n % 4 != 0
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

var canWinNim = function(n) {
    // 如果上来就踩到 4 的倍数，那就认输吧
    // 否则，可以把对方控制在 4 的倍数，必胜
    return n % 4 !== 0;
};
```

</div></div>
</div></div>

<details open><summary><strong>🥳🥳 算法可视化 🥳🥳</strong></summary><div id="data_nim-game" data="G+MLEdWaNQC0SuDO0hxSBP1mr1o9wTk9wAqRY7ns9d22d14B4ieqVIAgQ2BgzbocJP19mpejD84LuQ4+nYgGVci53/9+bcEbnK5yN3X0dFKembcXsyTuXzCPm5DEtiUTEiHSGlvssvbitTi15YeaN8Hv/e9FJVb4PX74h4Ej2ceqHEJIdb2XnB9WxpTwPy4Xsnee74+Z8L4UsTIzuBATfVX4TymBvwE/QeRA5RJxpmmYHyLtRP/LY1oIYObShsBYQilmyknlg1c/Pz1vBskxbT43c1SiMvDA2xd8TJnaYk4VlbGXHwLOoxSPdF7fiaKjCohWeosvrDpmddpacxbCAjn3vDKyFGQqSVcfU0LLWmI5jUfM4Vph/9/4yms/l6bgocaIvMt7M/sF30tZ2WDRXpLOmUW6gPmlipDnXNo0zAo56CznCr+33QtfDxzhh5fQUAY5HSZpnYlToHBvx7GknWTDn8SnArLObe59iywMw2xdwtnO2FtOgEcuLy/nEmvSmmvBFCbQwY79gk0DlxkY5xyyxzrnqjUXjBlkbQsRQ2tkjSACloqJyQYDMZU295cZVpkGp17am1chCc7QJ5TA662yYJlAv/dZSkELrDElvjTml2bBVzEku7cbM2grBy84mB7G8rwx7p54LLGiDqLd5i8LliqJir7JEib1DIkBHEAI6GyyggEcAEcIGZSikwaUEIpIw4BNQLay1LGUMv8AZ2I1YUVIyOLlBcBhMGUd5+e3twV6HwWIX08QUm0SCt5xFnTlyVD5FmcB46LovJoX91UXXsOBbLscEvwEnLVGChZQ69vfwtc2sc0N5VdoXUad6NocQmBthaYKfQMFi2bbRBmSYh1Iq8QYh4zNWEhtA3UJTNFnlfB3ngcRs+7JYd5KWQ8+A9sGMzTbOBUJ3fG2wMaouhUEYgkUEQxPpfdjH0WGYFEIJ41RArEeKJJn33WGVXLgBJXbx9jaRIYyQX30VrNyOduz6yv1LjUuMXcHU+YYUoxm9hWgCDS6O4B6GHnjmyIIqPCbNlDGS3m21yr1+ue3tzU2qS96wolhzhwpJiYa1AhTpaZomkbYqqfOQqBsEDLB/rU5grEhGZlEEQgCyEFCUpi+AgQnbKStQiaeCu1vHuTOherZIjMwg925MtRqYujLMsm1BWOgpg02uiyr0d9aYshLzZCeZF3/vY3ue8/hGmP8cO+VKoZ8zDsVVVSaEqpn+MKP+nIAb4+2nONoMXB2dvG2feTl34q6bf/oE1vlaEoAQ7D90YdK8MBSfQnnc7tlYMFuiISUReuOU8p6Cs8oaTx5x9gOPx3nbLhoyq/Y9cqRhw9H5D7nuN/YxjkGPTt9d+2hXKZu1bfvq5EL8qfpwcHJHEP3KZOU7Q8B"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_nim-game"></div></div>
</details><hr /><br />

**类似题目**：
  - [319. 灯泡开关 🟠](/problems/bulb-switcher)
  - [877. 石子游戏 🟠](/problems/stone-game)

</details>
</div>



