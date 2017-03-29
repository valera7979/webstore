<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Type" content=
            "text/html; charset=ISO-8859-1">
    <link rel="stylesheet"
          href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Products</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Products</h1>
            <p>Add products</p>
        </div>
    </div>
</section>
<section class="container">

    <div class="col-sm-6">
    <h2>Add new product</h2>
    <form:form modelAttribute="newProduct" class="form-horizontal">
        <div class="form-group">
                <label class="control-label col-sm-2" for="productId">Product Id</label>
                <div class="col-sm-10">
                    <form:input id="productId" path="productId" type="text" class="form-control"/>
                </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="Name">Name</label>
            <div class="col-sm-10">
                    <form:input id="name" path="name" type="text" class="form-control"/>
                </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="unitPrice">Unit price</label>
            <div class="col-sm-10">
                    <form:input id="unitPrice" path="unitPrice" type="number" min="0" class="form-control"/>
                </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="description">Description</label>
            <div class="col-sm-10">
                    <form:textarea id="description" path="description" rows="3" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="manufacturer">Manufacturer</label>
            <div class="col-sm-10">
                    <form:input id="manufacturer" path="manufacturer" type="text" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="category">Category</label>
            <div class="col-sm-10">
                    <form:input id="category" path="category" type="text" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="unitsInStock">Units in Stock</label>
            <div class="col-sm-10">
                    <form:input id="unitsInStock" path="unitsInStock" type="number" min="0" class="form-control"/>
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2" for="unitsInOrder">Units in Order</label>
            <div class="col-sm-10">
                <form:input id="unitsInStock" path="unitsInOrder" type="number" min="0" class="form-control"/>
            </div>
        </div>



            <div class="form-group">
                <div class="col-lg-offset-2 col-lg-10">
                    <input type="submit" id="btnAdd" class=
                            "btn btn-primary" value ="Add"/>
                </div>
            </div>

    </form:form>
</div>
</section>
</body>
</html>