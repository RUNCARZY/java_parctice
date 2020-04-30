/*
Dom对象：访问和操作html中的元素对象

W3C DOM标准分为3个部分：
    核心DOM - 针对任何结构化文档的标注模型
        Document：文档对象
        Element：元素对象
        Attribute：属性对象
        Text：文本对象
        Comment：注释对象
        Node：节点对象，其他5个对象的父对象
    XML DOM - 针对XML文档的标准模型
    HTML DOM - 针对HTML文档的标准模型


核心Dom模型：
    Document：文档对象
    1.获取对象
    2.方法
        获取Element方法
            getElementById() 通过id获取Element元素，返回数组，id值建议唯一
            getElementByTagName() 通过标签名获取元素，返回数组
            getElementByClassName() 通过class属性获取元素，返回数组
            getElementByName() 通过name属性获取元素，返回数组

        创建其他DOM对象
            creatAttribute(name)
            createComment
            CreateElement
            createTextNode

    Element对象：
    1.获取、创建对象：通过Document对象进行获取和创建
    2.方法
        设置属性 setAttribute(attr, value)
        删除属性 removeAttribute()

    Node节点对象：
    特点：所有DOM对象都可以视为是一个节点
    方法：
        CRUD dom树：
            appendChild(): 向节点的子节点列表的末尾添加新的子节点，新的子节点可以使用Document对象创建
            removeChild(): 删除并返回当前节点指定的子节点
            replaceChild(): 用新节点代替子节点
    属性：
        parentNode 当前节点的父节点



HTML DOM
    1.标签体的设置和获取：innerHTML
    2.使用html元素对象的属性
    3.控制样式
        方式一：访问element.style.attribute进行属性设置
        方式二：提前定义好类选择器，通过修改元素的className属性来控制样式

 */

function clickButton() {
    alert("我是一个被点了的按钮");
}

var elm1 = document.getElementById('1st_p');
elm1.color = "red";