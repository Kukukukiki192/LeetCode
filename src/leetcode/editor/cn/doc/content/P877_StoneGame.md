<p>Alice 和 Bob 用几堆石子在做游戏。一共有偶数堆石子，<strong>排成一行</strong>；每堆都有 <strong>正</strong> 整数颗石子，数目为 <code>piles[i]</code>&nbsp;。</p>

<p>游戏以谁手中的石子最多来决出胜负。石子的 <strong>总数</strong> 是 <strong>奇数</strong> ，所以没有平局。</p>

<p>Alice 和 Bob 轮流进行，<strong>Alice 先开始</strong> 。 每回合，玩家从行的 <strong>开始</strong> 或 <strong>结束</strong> 处取走整堆石头。 这种情况一直持续到没有更多的石子堆为止，此时手中 <strong>石子最多</strong> 的玩家 <strong>获胜</strong> 。</p>

<p>假设 Alice 和 Bob 都发挥出最佳水平，当 Alice 赢得比赛时返回&nbsp;<code>true</code>&nbsp;，当 Bob 赢得比赛时返回&nbsp;<code>false</code>&nbsp;。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>piles = [5,3,4,5]
<strong>输出：</strong>true
<strong>解释：</strong>
Alice 先开始，只能拿前 5 颗或后 5 颗石子 。
假设他取了前 5 颗，这一行就变成了 [3,4,5] 。
如果 Bob 拿走前 3 颗，那么剩下的是 [4,5]，Alice 拿走后 5 颗赢得 10 分。
如果 Bob 拿走后 5 颗，那么剩下的是 [3,4]，Alice 拿走后 4 颗赢得 9 分。
这表明，取前 5 颗石子对 Alice 来说是一个胜利的举动，所以返回 true 。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>piles = [3,7,2,3]
<strong>输出：</strong>true
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>2 &lt;= piles.length &lt;= 500</code></li> 
 <li><code>piles.length</code> 是 <strong>偶数</strong></li> 
 <li><code>1 &lt;= piles[i] &lt;= 500</code></li> 
 <li><code>sum(piles[i])</code>&nbsp;是 <strong>奇数</strong></li> 
</ul>

<details><summary><strong>Related Topics</strong></summary>数组 | 数学 | 动态规划 | 博弈</details><br>

<div>👍 505, 👎 0<span style='float: right;'><span style='color: gray;'><a href='https://github.com/labuladong/fucking-algorithm/discussions/939' target='_blank' style='color: lightgray;text-decoration: underline;'>bug 反馈</a> | <a href='https://labuladong.gitee.io/article/fname.html?fname=jb插件简介' target='_blank' style='color: lightgray;text-decoration: underline;'>使用指南</a> | <a href='https://labuladong.github.io/algo/images/others/%E5%85%A8%E5%AE%B6%E6%A1%B6.jpg' target='_blank' style='color: lightgray;text-decoration: underline;'>更多配套插件</a></span></span></div>

<div id="labuladong"><hr>

**通知：[数据结构精品课](https://aep.h5.xeknow.com/s/1XJHEO) 和 [递归算法专题课](https://aep.xet.tech/s/3YGcq3) 即将涨价，[第 20 期打卡挑战](https://opedk.xet.tech/s/1cEM6U) 即将开始，最后 1 天报名！**



<p><strong><a href="https://labuladong.gitee.io/article/slug.html?slug=stone-game" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

PS：这道题在[《算法小抄》](https://item.jd.com/12759911.html) 的第 414 页。

**这个条件下先手必胜**。

如果我们把这四堆石头按索引的奇偶分为两组，即第 1、3 堆和第 2、4 堆，那么这两组石头的数量一定不同，也就是说一堆多一堆少。因为石头的总数是奇数，不能被平分。

而作为第一个拿石头的人，你可以控制自己拿到所有偶数堆，或者所有的奇数堆。

你最开始可以选择第 1 堆或第 4 堆。如果你想要偶数堆，你就拿第 4 堆，这样留给对手的选择只有第 1、3 堆，他不管怎么拿，第 2 堆又会暴露出来，你就可以拿。同理，如果你想拿奇数堆，你就拿第 1 堆，留给对手的只有第 2、4 堆，他不管怎么拿，第 3 堆又给你暴露出来了。

也就是说，你可以在第一步就观察好，奇数堆的石头总数多，还是偶数堆的石头总数多，然后步步为营，就一切尽在掌控之中了。知道了这个漏洞，可以整一整不知情的同学了。

当然，「总共有偶数堆石子」和「石子总数为奇数」是先手必胜的前提条件，如果题目更具一般性，没有这两个条件，就属于标准的博弈问题，应该使用动态规划算法来解决了，详见 [动态规划之博弈问题](https://labuladong.github.io/article/fname.html?fname=动态规划之博弈问题)。

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
    bool stoneGame(vector<int>& piles) {
        return true;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
# 本代码已经通过力扣的测试用例，应该可直接成功提交。

class Solution:
    def stoneGame(self, piles: List[int]) -> bool:
        return True
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public boolean stoneGame(int[] piles) {
        return true;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

func stoneGame(piles []int) bool {
    return true
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

/**
 * @param {number[]} piles
 * @return {boolean}
 */
var stoneGame = function(piles) {
    return true;
};
```

</div></div>
</div></div>

<details open><summary><strong>🍭🍭 算法可视化 🍭🍭</strong></summary><div id="data_stone-game" data="G+oLIGRaznp9O3mt5GYRS0/U6HQIkkCAUDPrf6wdSbyrDRYiIeMh8ihxd/8NZtYPEU/WRCOVnFhkU1xTUlH+YBuuTrLSu0FZTf+3ohCzsprK6gcG9gTUqhrCRjW9Ecz2Ki5l+4/5FtG2k9WlxrD6nYgVS9dWLbVVwarSQsy0KfwqFY8zTD2yygf/6D8DNWsEsGy+wsikfGN0FNSqNyiWjGh/CjGpIcHlsrlpY0KMX2zVWvcq9MSrn5+eV12ghtXzbpO1ZA3a8vYFH8NrZExKjZI2t6yKj3a1GVU+lllJXBsIkgosJmV19qEC1oKphP2sxjtekmcR2dUuMx2V12FeRy+DUCghtm1SNLMfWzCWVDhyHAFp/gjKPmfnHslqelJOGSrBEEHrSlhV4lWBzJJaVjg3OyxV6+UicS+qaeeYLWKmU6W1mROFicBtN1ZB5dDzSX3KcKA9UF1vs3Ncaw4gWGXwuM+9fOV8Pt9DGrGb+8EYSvCA+3/5Y4XYeI6cA8kWi64wZm4aE7g+NspL6MgSBTLmlDaTFVLbD95cZCZQVuesntyDV3FUfCUNow68AssfSmNcvno2jtGqLPLWUgRovuuqNHEMpre7veWJakAvVJksUGDLO3eXPNZw3hNnN/5jgsBFJkrQuSpLHBRjpAlehw2OwWooNMHrgGFz1yklMF0nhyIBIwZ11klmfYttkvgTea32A5bEDqN4gusUUA6zeM/Pb28ztGBwXnx/QrBXZMRCieyP6Affpr7N64gcDB3VuLjvvFhtNqApUOmFnz6vhYnC0WWP9n8Lnh+dU/rYcyDLMy0FY9wAPr8uPg1tPhhl9gIzt0EMRRxVYorX78tsIqPpPEaEXSog+yvxPKpUrBFfIoul7Xrmu3pdPHMbS2xmc8DbDMsEsBCSYgkmEYqiQuT9H1UBwLsUOsO5WqsjqR1OfbcJVq0TSYi71+Ca76zRA3DNYeMl+WTNdu2Fixhw6t09TZlCN01CY698VsFId0/Q1fo1DphDvMZ+sw4rlenga6wejf357S24nEKMdqQ5Z4LQ6pGdazMO7HTitnA2o3BhBwuTskIcaPbnbTIUm6aHTE4aCMGgoMNdfvXKKwi3syV7zxPzU2xA5D0wLpzPEkZkz+1elhvaTBzySDq52qDf61WMhTEc9v22Lc28NAz6Cbjuv69RP30yl2NHb5f+R/3Fb1ZSevNXZdjz/5CqGUtRbz36j7ubGynz5Gby5I82NaeA9PD/2WUS0nJwd6bRcmo9kOoLpPIukVMKBoLW0t0ogq7ryak+M5nQA0VIKcsVUuZo1/+72/UQ1Z9X/2mNa1LT2fV9Cbtwv2a6r2u5yUF8vykIxaUC"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_stone-game"></div></div>
</details><hr /><br />

**类似题目**：
  - [292. Nim 游戏 🟢](/problems/nim-game)
  - [319. 灯泡开关 🟠](/problems/bulb-switcher)

</details>
</div>



