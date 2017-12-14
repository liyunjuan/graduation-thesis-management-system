<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic Accordion - jQuery EasyUI Demo</title>

    <link rel="stylesheet" type="text/css"
          href="<%=basePath%>jquery-easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css"
          href="<%=basePath%>jquery-easyui/themes/icon.css">
    <script src="<%=basePath%>jquery-easyui/jquery-1.8.0.js"></script>
    <script src="<%=basePath%>jquery-easyui/jquery.easyui.min.js"></script>
</head>
<body>
<h2>Basic Accordion</h2>
<div class="demo-info">
    <div class="demo-tip icon-tip"></div>
    <div>Click on panel header to show its content.</div>
</div>
<div style="margin: 10px 0;"></div>
<div class="easyui-accordion" style="width: 500px; height: 300px;">
    <div title="About" data-options="iconCls:'icon-ok'"
         style="overflow: auto; padding: 10px;">
        <h3 style="color: #0099FF;">Accordion for jQuery</h3>
        <p>Accordion is a part of easyui framework for jQuery. It lets
            you define your accordion component on web page more easily.</p>
    </div>
    <div title="Help" data-options="iconCls:'icon-help'"
         style="padding: 10px;">
        <p>The accordion allows you to provide multiple panels and
            display one at a time. Each panel has built-in support for expanding
            and collapsing. Clicking on a panel header to expand or collapse
            that panel body. The panel content can be loaded via ajax by
            specifying a 'href' property. Users can define a panel to be
            selected. If it is not specified, then the first panel is taken by
            default.</p>
    </div>
    <div title="TreeMenu" data-options="iconCls:'icon-search'"
         style="padding: 10px;">
        <ul class="easyui-tree">
            <li><span>Foods</span>
                <ul>
                    <li><span>Fruits</span>
                        <ul>
                            <li>apple</li>
                            <li>orange</li>
                        </ul>
                    </li>
                    <li><span>Vegetables</span>
                        <ul>
                            <li>tomato</li>
                            <li>carrot</li>
                            <li>cabbage</li>
                            <li>potato</li>
                            <li>lettuce</li>
                        </ul>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</div>
</body>
</html>