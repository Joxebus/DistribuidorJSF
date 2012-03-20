<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Identificaci&oacute;n de usuarios</title>
</head>
<body>
	<f:view>
	<div id="container" align="center">
		<div style="width:400px;">
			<h1>Login</h1>
			<fieldset><legend>Validaci&oacute;n de datos</legend>
			<h:form>
				<div align="left" style="margin-left:40px">
					Usuario <h:inputText value=" "  /><br>
					Contraseña <h:inputSecret value="" />
					<br><br>
					<h:commandButton action="" value="Ingresar"/>
				</div>	
			</h:form>
			</fieldset>
		</div>
	</div>
	</f:view>
</body>
</html>