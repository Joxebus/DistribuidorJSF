<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar producto</title>
</head>
<body>
<f:view>
	<h:form>
		Nombre:<h:inputText value="productosManageBean.nombre" />
		Existencia:<h:inputText value="productosManageBean.existencia" />
		Precio:<h:inputText value="productosManageBean.precio" />
		<h:commandButton value="Agregar" action="#{productosManageBean.agregarNuevoProducto}" />
	
	</h:form>
</f:view>
</body>
</html>