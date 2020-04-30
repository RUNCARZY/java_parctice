/*
BOM:Browser Object Model 浏览器对象模型
主要包括：浏览器对象Navigator、地址栏对象Location、历史记录对象History、窗口对象Window(包含Dom对象)、显示器屏幕对象Screen

Window窗口对象：
    1.获取对象：浏览器创建了window对象，可以直接使用，
        访问window的方法、属性可以省略引用
        比如window.alert() 可以省略引用，直接使用 alert()
    2.方法：
        弹出框：
            alert() 显示一个带有消息、确认按钮的提示框
            confirm() 显示一个带有消息、确认按钮、取消按钮的对话框
                用户点击确认，返回true
                用户点击取消，返回false
            prompt() 显示提示用户输入的对话框，返回用户输入的内容

        打开关闭窗口：
            close() 关闭当前窗口
            open(url) 打开一个新窗口，返回新的window对象

        定时器：
            setTimeout()    一次性定时器
                参数1：js代码或者方法对象
                参数2：毫秒值
                返回定时器唯一标识
            clearTimeout(id)  取消一次性定时器

            setInterval()   循环定时器
            clearInterval() 取消循环定时器
    3.属性：
        1.获取其他BOM对象history，navigator，location，screen
        2.获取DOM对象

地址栏对象Location
    1.获取对象--window.location
    2.方法：
        reload()    重新加载当前文档。刷新
        replace()	用新的文档替换当前文档
    3.属性
        href 获取当前url，修改该属性可以加载新的页面

历史记录对象History：
    1.获取对象--window.history
    2.方法
        back()  加载history列表中的前一个url
        forward()  加载history列表中的后一个url
        go()    加载history列表中某个具体页面
    3.属性
        length：返回当前窗口历史列表中的URL数量


 */


window.location
