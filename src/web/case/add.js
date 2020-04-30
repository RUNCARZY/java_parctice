

var btn = document.getElementById("add_btn");
btn.onclick = function add() {
    var num = document.getElementById("add_num").value;
    var name = document.getElementById("add_name").value;
    var age = document.getElementById("add_age").value;
    var table = document.getElementById("member_list");
    // var table = document.getElementsByTagName("tbody")[0];
    var checked = true;
    var notice_num = document.getElementById("notice_num");
    var notice_name = document.getElementById("notice_name");
    var notice_age = document.getElementById("notice_age");

    if (!(/^\d+$/.test(num))) {
        notice_num.innerHTML = "请输入整数";
        checked = false;
    }else {
        notice_num.innerHTML = "";
    }

    if (!/^.{1,10}$/.test(name)) {
        notice_name.innerHTML = "长度在1~10";
        checked = false;
    } else {
        notice_name.innerHTML = "";
    }

    if (!(/^\d+$/.test(age))) {
        notice_age.innerHTML = "请输入整数";
        checked = false;
    }else {
        notice_age.innerHTML = "";
    }
    /*
        var new_line = document.createElement("tr");
        var td_num = document.createElement("td");
        var text_num = document.createTextNode(num);
        td_num.appendChild(text_num);
        new_line.appendChild(td_num);

        var td_name = document.createElement("td");
        var text_name = document.createTextNode(name);
        td_name.appendChild(text_name);
        new_line.appendChild(td_name);

        var td_age = document.createElement("td");
        var text_age = document.createTextNode(age);
        td_age.appendChild(text_age);
        new_line.appendChild(td_age);

        var td_del = document.createElement("td");
        var link_del = document.createElement("a");
        link_del.text = "删除";
        link_del.href = "javascript:void(0);";
        td_del.appendChild(link_del);
        new_line.appendChild(td_del);

        table.appendChild(new_line);*/
    if (checked) {
        table.innerHTML += "<tr onmousemove=\"mouseOver(this)\" onmouseout=\"mouseOut(this)\">\n" +
            "<td><input type=\"checkbox\" class=\"checkbox\" id=\"select_" + num + "\"></td>" +
            "<td>" + num + "</td>\n" +
            "<td>" + name + "</td>\n" +
            "<td>" + age + "</td>\n" +
            "<td><a href=\"javascropt:void(0)\" class=\"del\" onclick='remove(this)'>删除</a></td>\n" +
            "</tr>";
    }
}


function checkInput() {
    var num = document.getElementById("add_num").value;
    var name = document.getElementById("add_name").value;
    var age = document.getElementById("add_age").value;
    var notice_num = document.getElementById("notice_num");
    var notice_name = document.getElementById("notice_name");
    var notice_age = document.getElementById("notice_age");

    if (!(/^\d+$/.test(num))) {
        notice_num.innerHTML = "请输入整数";
    }else {
        notice_num.innerHTML = "";
    }

    if (!/^.{1,10}$/.test(name)) {
        notice_name.innerHTML = "长度在1~10";
    } else {
        notice_name.innerHTML = "";
    }

    if (!(/^\d+$/.test(age))) {
        notice_age.innerHTML = "请输入整数";
    }else {
        notice_age.innerHTML = "";
    }
}

function remove(obj) {
    var table = obj.parentNode.parentNode.parentNode;
    var row = obj.parentNode.parentNode;
    table.removeChild(row);
}

function selectAll() {
    var checkboxes = document.getElementsByClassName("checkbox");
    for(var i=0; i<checkboxes.length; i++){
        checkboxes[i].checked = true;
    }
}

function selectNone() {
    var checkboxes = document.getElementsByClassName("checkbox");
    for(var i=0; i<checkboxes.length; i++){
        checkboxes[i].checked = false;
    }
}

function selectReverse() {
    var checkboxes = document.getElementsByClassName("checkbox");
    for(var i=0; i<checkboxes.length; i++){
        checkboxes[i].checked = !checkboxes[i].checked;
    }
}

function mouseOver(obj){
    obj.style.backgroundColor = "pink";
}

function mouseOut(obj){
    obj.style.backgroundColor = "#FFFFFF";
}

