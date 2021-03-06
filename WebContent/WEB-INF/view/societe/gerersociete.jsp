<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:choose>
	<c:when test="${societe != null }">
			<div class="consultation-societe">
		
			<div class="icon">
				<div class="lien">
				<a class="active" href="<c:url value="/societe/${scte.slug }/gerer-societe" />">D�tails</a>
			<a href="<c:url value="/societe/${scte.slug }/gerer-societe/modifier" />">Modifier</a>
					
					<a href="<c:url value="/societe/${slug }/gerer-societe/exercices" />">Exercices</a>
					<a  href="<c:url value="/societe/${slug }/gerer-salaries/lister"/>">Salari�s</a>
					<a  href="<c:url value="/societe/${scte.slug }/gerer-bareme/information" />">Bar�mes</a>
				</div>
				<div class="nom">
					${societe.intituleSociete }
				</div>
				<div class="image">
					<img src="<c:url value="/documents/${societe.lienLogo() }"/>"/>
				</div>
				
			</div>
			<div class="detail">
				
				<div class="input c2">
	<label>ID fiscale : </label>
	<input type="text" disabled="disabled" placeholder="IDentifiant fiscale de la soci�t�"  value="${societe.idfiscale }"  name="idfiscale"/>
</div>
<div class="input c2">
	<label>CNSS : </label>
	<input type="text" disabled="disabled" placeholder="CNSS de la soci�t�" value="${societe.cnss }"  name="cnss"/>
</div>

<div class="input c3">
	<label>Code Tribunal : </label>
	<input type="text" disabled="disabled" placeholder="RC + Code Tribunal de la soci�t�" value="${societe.rcCodeTribunal }" name="rcCodeTribunal"/>
</div>
<div class="input c3">
	<label>FAX : </label>
	<input type="text" disabled="disabled" placeholder="Le fax de la soci�t�" value="${societe.fax }"  name="fax"/>
</div>
<div class="input c3">
	<label>Email : </label>
	<input type="text" disabled="disabled" placeholder="Adresse email de la soci�t�" value="${societe.email }"  name="email"/>
</div>
<div class="input c3">
	<label>T�l�phone : </label>
	<input type="text" disabled="disabled" placeholder="N�telephonex de la soci�t�" value="${societe.telephone }" name="telephone"/>
</div>
<div class="input c3">
	<label>CIMR : </label>
	<input type="text" disabled="disabled" placeholder="N� CIMR de la soci�t�" value="${societe.cimr }" name="cimr"/>
</div>
<div class="input c3">
	<label>Mutuelle : </label>
	<input type="text" disabled="disabled" placeholder="N� Mutuelle de la soci�t�" value="${societe.mutuelle }" name="mutuelle"/>
</div>
<div class="input c3">
	<label>Patente : </label>
	<input type="text" disabled="disabled" placeholder="Patente de la soci�t�" value="${societe.patente }"  name="patente"/>
</div>
<div class="input c3">
	<label>Nombre maximal de compte : </label>
	<input type="text" disabled="disabled" placeholder="Nombre max de compte" value="${societe.maxcompte }" name="maxcompte"/>
</div>
<div class="input c3">
	<label>Ville : </label>
	<input type="text" disabled="disabled" placeholder="Non d�finie !!!" value="${societe.ville }" name="ville"/>
</div>
<div class="input c1">
	<label>Adresse : </label>
	<input type="text" disabled="disabled" placeholder="Adresse de la soci�t�" value="${societe.adresse }" name="adresse"/>
</div>


				
			</div>
		</div>
	</c:when>
	<c:otherwise>
		<h1>Lien Incorrect : ${slug }</h1>
	</c:otherwise>
</c:choose>

