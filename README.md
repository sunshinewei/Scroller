# Scroller
使用scroller类实现自定义view的弹性滑动。
##### scroller的使用步骤：
1.初始化scroller;
2.复写<code>computeScroll()</code>方法，在内部实现滚动相关的业务逻辑,并进行<code>postInvalidate()</code>的调用；
3.调用<code>startScroll()</code>方法，并进行重绘<code>invalidate()</code>;
实现<code>ImageView</code>的动画：
核心代码：
<pre><code>
public class ImageScrollerView extends LinearLayout {
    private Scroller mScroller;
    private int startX;
    private int duration;
    private boolean flag=true;
    public ImageScrollerView(Context context) {
        super(context);
    }

    public ImageScrollerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mScroller=new Scroller(context);
        duration=3000;
    }

    @Override
    public void computeScroll() {
        if (mScroller.computeScrollOffset()){
            scrollTo(mScroller.getCurrX(),0);
            invalidate();
        }
    }
    public void beginScroll(){
        if(flag){
            mScroller.startScroll(mScroller.getCurrX(),0,-250,0,duration);
            startX=mScroller.getCurrX();
            flag=false;
        }else {
            mScroller.startScroll(-startX,0,80,0,duration);
            flag=true;
        }
        invalidate();
    }
}
</code></pre>
实现效果如下：
ImageView实现图片动画：
![imageview](https://github.com/sunshinewei/Scroller/tree/master/images/scrollerImage.gif)
<p>TextView实现内容移动，通过<code>scrollBy和scrollTo方法</code></p>
![text](https://github.com/sunshinewei/Scroller/tree/master/images/scroller.gif)