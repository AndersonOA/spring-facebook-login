<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<html lang="pt-br">
	<head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        
        <title><decorator:title /></title>
        <meta name="description" content="Spring Social Login com Facebook" />
        <meta name="robots" content="index, follow" />
        
        <link rel="stylesheet" href="../_cdn/css/bootstrap.min.css" />
        <link rel="stylesheet" href="../_cdn/css/style.css" />
    </head>
    <body>
    	<decorator:body />
    </body>
</html>