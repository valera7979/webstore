<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initialscale=1.0">
    <title><tiles:insertAttribute name="title" /></title>
    <link href="http://getbootstrap.com/dist/css/bootstrap.css"
          rel="stylesheet">
    <link href="http://getbootstrap.com/examples/jumbotron/jumbotron.css" rel="stylesheet">
</head>
<body>
<div class="container" style="margin-top:-50px;">
    <h3 class="text-muted">Web Store</h3>
    <div class="header">
    <div class="jumbotron" style="margin-bottom: -5px">
        <h1>
            <tiles:insertAttribute name="heading" />
        </h1>

        <p>
            <tiles:insertAttribute name="tagline" />
        </p>
    </div>
    <div class="row">
        <ul class="nav nav-pills pull-left" style="padding-left: 15px; padding-bottom: 10px">
            <tiles:insertAttribute name="navigation" />
        </ul>

    </div>
    <div class="row">
        <tiles:insertAttribute name="content" />
    </div>
    <div class="footer">
        <tiles:insertAttribute name="footer" />
    </div>
</div>
</div>
</body>
</html>