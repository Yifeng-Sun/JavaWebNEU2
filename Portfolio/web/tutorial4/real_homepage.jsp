<%--
  Created by IntelliJ IDEA.
  User: sunyifeng
  Date: 2020/6/19
  Time: 7:43 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Yifeng.RealHomepage</title>
    <link rel="import" href="navigation_bar.jsp" id="bar">
    <link rel="stylesheet" type="text/css" href="../css/PagesCSS.css">
    <script type="text/javascript" src="../jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function(){

        })
    </script>

</head>
<body>
<iframe   src="navigation_bar.jsp" width="100%" height="auto" frameborder="0" name="bar" scrolling="no">
</iframe>
<div class="box" style="margin-bottom: 15%">
    <a href="AboutMe.jsp" class="lilBox"><div>
        <h1> About me</h1>
        <iframe style="margin-left: 10px; margin-right: 10px" class="descriptionIFrame" src="nobar_Aboutme.jsp" width="100%" height="auto" frameborder="0" name="bar" scrolling="no" >
        </iframe>
    </div></a>
    <a href="Project.jsp" class="lilBox"><div>
        <h1>Projects</h1>
        <ul style="margin-right: 10px">
            <li><span>WeChat Mini Program: OnTime</span></li>
            <li><span>Arduino Interact project: MotionFlow</span></li>
            <li><span>Java & JavaFX Program: HIS (NEU Cloud Clinic)</span></li>
        </ul>
    </div></a>
    <a href="Interest.jsp" class="lilBox"><div>
        <h1>Interests</h1>
        <iframe class="descriptionIFrame" src="nobar_Interest.jsp" width="100%" height="auto" frameborder="0" name="bar" scrolling="no" >
        </iframe>
    </div></a>
</div>
<iframe class="footerFrame" src="footer.jsp" width="100%" height="auto" frameborder="0" name="bar" scrolling="no">
</iframe>
</body>
</html>