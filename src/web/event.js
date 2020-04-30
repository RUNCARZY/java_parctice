/*
事件监听机制：组件执行操作后，触发代码的执行

常见的事件：
1.点击事件：
    单击：onclick
    双击：ondblclick
2.焦点事件
    onblur 失去焦点
    onfocus 获得焦点
3.加载事件
    onload 一张页面或图片完成加载
4.鼠标事件(不指定具体鼠标按键)：定义方法时，声明一个形参event，访问形参属性值button来获取按键信息
    onmousedown 鼠标按下
    onmouseup   鼠标松开
    onmouseover 鼠标移到元素之上
    onmousemove 鼠标被移动
    onmouseout  鼠标从元素移开
5.键盘事件
    onkeydown 某个键盘按键按下
    onkeyup   某个键盘按键松开
    onkeypress   某个键盘按钮按下并松开
6.选中和改变
    onchange    域中的内容被改变
    onselect    文本被选中
7.表单事件
    onsubmit    提交事件
        返回false 表单不提交
        返回true 表单正常提交
    onreset     重置按钮被点击

 */