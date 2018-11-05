<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>论坛</title>
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/index.css"/>
    <link rel="stylesheet" type="text/css" href="css/layui/css/layui.css"/>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
    <link rel="stylesheet" href="script/jinyu/css/normalize.css">
    <link rel="stylesheet" href="script/jinyu/css/style.css" media="screen" type="text/css"/>
    <style>
        .banzhu {
            height: 680px;
            background: rgba(51, 122, 183, 0.15);
        }

        .banzhudiv {
            width: 23%;
            height: 310px;
            background-color: #FFF9EC;
            float: left;
            margin: 1%;
        }

        .banzhudiv-title {
            color: #000000;
            font-size: 34px;
            text-align: center;
            text-transform: uppercase;
        }

        .banzhudiv-title-two {
            color: #999;
            font-size: 15px;
            text-align: center;
            margin: .1em 0em 3em;
            letter-spacing: 2px;
            word-spacing: 1px;
        }

        .banzhudiv-touxiang {
            width: 100%;
            height: 80%;
        }

        .banzhutuijian-p {
            margin-top: 4%;
            text-decoration: none;
            color: #f58703;
            font-size: 20px;
            letter-spacing: 1px;
            margin-bottom: .5em;
            display: block;
            line-height: 30px;
        }

        .fontjuzhong {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="logo">
    <img src="image/index/logo.png"/>
</div>
<ul class="layui-nav daohang " style="background-color:#F8F8FF" lay-filter="">
    <li class="layui-nav-item layui-this relativeleft">
        <a href="" style="color: black">首页</a>
    </li>
    <li class="layui-nav-item relativeleft">
        <a href="" style="color: black">论坛</a>
    </li>
    <li class="layui-nav-item relativeleft">
        <a href="javascript:;" style="color: black">数据中心</a>
        <dl class="layui-nav-child">
            <!-- 二级菜单 -->
            <dd>
                <a href="">移动模块</a>
            </dd>
            <dd>
                <a href="">后台模版</a>
            </dd>
            <dd>
                <a href="">电商平台</a>
            </dd>
        </dl>
    </li>
    <li class="layui-nav-item relativeleft">
        <a href="" style="color: black">社区</a>
    </li>
    <li class="layui-nav-item relativeleft">
        <a href="" style="color: black">个人中心</a>
    </li>
    <li class="layui-nav-item loginrelativeleft">
        <a href="" style="color: black"> <img src="http://t.cn/RCzsdCq" class="layui-nav-img">请登录</a>
        <dl class="layui-nav-child">
            <dd>
                <a href="javascript:;">修改信息</a>
            </dd>
            <!-- <dd>
            <a href="javascript:;">安全管理</a>
            </dd> -->
            <dd>
                <a href="javascript:;">退出登录</a>
            </dd>
        </dl>
    </li>
</ul>
<div class="layui-carousel lunbotu" id="lunbotu">
    <div carousel-item>
        <div>
            <img src="image/index/1.jpg" style="width: 100%;height: 100%">
        </div>
        <div>
            <img src="image/index/2.jpg" style="width: 100%;height: 100%"/>
        </div>
        <div>
            <img src="image/index/3.jpg" style="width: 100%;height: 100%"/>
        </div>
        <div>
            <img src="image/index/4.jpg" style="width: 100%;height: 100%"/>
        </div>
    </div>
</div>

<div class="layui-collapse" lay-accordion="">
    <div class="layui-colla-item">
        <h2 class="layui-colla-title">推荐板块</h2>
        <div class="layui-colla-content">
            <!-- layui-show -->
            <p>
                推荐板块
            </p>
        </div>
    </div>
    <div class="layui-colla-item">
        <h2 class="layui-colla-title">推荐板块</h2>
        <div class="layui-colla-content">
            <!-- layui-show -->
            <p>
                推荐板块
            </p>
        </div>
    </div>
    <div class="layui-colla-item">
        <h2 class="layui-colla-title">推荐板块</h2>
        <div class="layui-colla-content">
            <p>
                推荐板块
            </p>
        </div>
    </div>
    <div class="layui-colla-item">
        <h2 class="layui-colla-title">推荐板块</h2>
        <div class="layui-colla-content">
            <p>
                推荐板块
            </p>
        </div>
    </div>
</div>
<!-- <fieldset class="layui-elem-field layui-field-title bigdivdingwei">
<legend>
版主推荐
</legend>
</fieldset> -->
<div class="banzhu bigdivdingwei">
    <div class="banzhudiv">
        <div class="banzhudiv-touxiang">
            <img src="image/index/1.jpg" class="imgMax">
        </div>
        <div class="fontjuzhong">
            <a class="banzhutuijian-p"> 查看详情 </a>
        </div>
    </div>
    <div class="banzhudiv">
        <div class="banzhudiv-touxiang">
            <img src="image/index/2.jpg" class="imgMax">
        </div>
        <div class="fontjuzhong">
            <a class="banzhutuijian-p"> 查看详情 </a>
        </div>
    </div>
    <div class="banzhudiv">
        <div class="banzhudiv-touxiang">
            <img src="image/index/3.jpg" class="imgMax">
        </div>
        <div class="fontjuzhong">
            <a class="banzhutuijian-p"> 查看详情 </a>
        </div>
    </div>
    <div class="banzhudiv">
        <div class="banzhudiv-touxiang">
            <img src="image/index/4.jpg" class="imgMax">
        </div>
        <div class="fontjuzhong">
            <a class="banzhutuijian-p"> 查看详情 </a>
        </div>
    </div>
    <div class="banzhudiv">
        <div class="banzhudiv-touxiang">
            <img src="image/index/1.jpg" class="imgMax">
        </div>
        <div class="fontjuzhong">
            <a class="banzhutuijian-p"> 查看详情 </a>
        </div>
    </div>
    <div class="banzhudiv">
        <div class="banzhudiv-touxiang">
            <img src="image/index/2.jpg" class="imgMax">
        </div>
        <div class="fontjuzhong">
            <a class="banzhutuijian-p"> 查看详情 </a>
        </div>
    </div>
    <div class="banzhudiv">
        <div class="banzhudiv-touxiang">
            <img src="image/index/3.jpg" class="imgMax">
        </div>
        <div class="fontjuzhong">
            <a class="banzhutuijian-p"> 查看详情 </a>
        </div>
    </div>
    <div class="banzhudiv">
        <div class="banzhudiv-touxiang">
            <img src="image/index/4.jpg" class="imgMax">
        </div>
        <div class="fontjuzhong">
            <a class="banzhutuijian-p"> 查看详情 </a>
        </div>
    </div>
</div>
<div id="whale"></div>
<div class="foot">
    <p>
        版权所有：小燕 小裴
    </p>
</div>
</body>
<script type="text/javascript" src="script/jquery-3.2.1.js"></script>
<script type="text/javascript" src="script/bootstrap.js"></script>
<script type="text/javascript" src="css/layui/layui.js"></script>
<script type="text/javascript" src="script/jinyu/layui.js"></script>
<script type="text/javascript" src="script/jinyu/layui.js"></script>
<script type="text/javascript" src="script/jinyu/layui.js"></script>
<script type="text/javascript" src="script/jinyu/js/index.js"></script>
<script src="script/jinyu/js/gg_bd_ad_720x90.js" type="text/javascript"></script>
<script src="script/jinyu/js/follow.js" type="text/javascript"></script>
<script>


    //轮播图
    layui.use('carousel', function () {
        var carousel = layui.carousel;
        //建造实例
        carousel.render({
            elem: '#lunbotu',
            width: '72%',
            height: '650px',
            interval: '4000',
            arrow: 'always'
        });
    });
    //注意：导航 依赖 element 模块，否则无法进行功能性操作
    layui.use('element', function () {
        var element = layui.element;
        //…
    });
</script>
</html>