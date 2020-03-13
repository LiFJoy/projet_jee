<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<%@include file="header.jsp"%>
<title>Reddit Community</title>
<body>
    <div class="grid-container">
        <div class="grid-x grid-padding-x">
            <div class="large-12 cell">
                <h3>Tell something more interesting !</h3>
                <table>
                    <tr>
                    	<th>Topic</th>
                    	<th></th>
                    </tr>
                   <!-- It's up to you-->
                </table>
                <form action="AddTask" method="post">
                	<label>
                		What topic would you like to talk?
                		<!-- It's up to you-->
                	</label>
                	<br>
                	<input type="text" value="topic">
                </form>
                <form action="AddTask" method="post">
                	<label>
                		Content:
                		<!-- It's up to you-->
                	</label>
                	<br>
                	<input type="text" value="content">
                	<br>
                </form>
                <input type="submit" value="Add new comment" class="success button">
            </div>
        </div>
    </div>
</body>
</html>