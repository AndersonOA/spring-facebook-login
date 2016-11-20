<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ taglib uri="http://www.springframework.org/spring-social/facebook/tags" prefix="facebook" %>
<%@ page session="false" %>
<title>Bem vindo, Spring Social Facebook Login</title>
<div id="form-container">
     <div class="panel" id="form-box">
         <form action="<c:url value="/plain/signin/authenticate" />" method="post">
             <h1 class="text-center">Login</h1>
             
             <div class="formInfo">
		  		<c:if test="${param.error eq 'bad_credentials'}">
		  		<div class="error">
		  			Your sign in information was incorrect.
		  			Please try again or <a href="<c:url value="/signup" />">sign up</a>.
		  		</div>
		 	 	</c:if>
		  		<c:if test="${param.error eq 'multiple_users'}">
		  		<div class="error">
		  			Multiple local accounts are connected to the provider account.
		  			Try again with a different provider or with your username and password.
		  		</div>
		 	 	</c:if>
			</div>

             <div class="form-group">
                 <label class="sr-only" for="username">Usuário</label>
                 <div class="input-group">
                     <div class="input-group-addon">
                        <span class="glyphicon glyphicon-user"></span>
                     </div>
                     <input type="text" name="username" class="form-control" placeholder="Seu login de usuário">
                 </div>
             </div>

             <div class="form-group">
                 <label class="sr-only" for="password">Senha</label>
                 <div class="input-group">
                     <div class="input-group-addon">
                         <span class="glyphicon glyphicon-lock"></span>
                     </div>
                     <input type="password" name="password" class="form-control" placeholder="Digite sua senha">
                 </div>
             </div>

             <div class="form-group">
                 <input type="submit" value="Entrar" class="btn btn-success form-control" />
             </div>
             
             <div class="form-group">
             	<a id="btn-fblogin" href="<c:url value="/auth/facebook"/>" class="btn btn-primary" style="width: 100%;">Entrar com Facebook</a>
             </div>
 
             <div class="form-group">
                 Não é registrado? <a href="cadastro.html">Crie uma conta</a>.
             </div>
         </form>
     </div>
 </div>