<%-- 
    Document   : Calculator
    Created on : 21 Mar, 2017, 1:06:57 PM
    Author     : kavan
--%>
<%@page errorPage="Error.jsp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int add=0;
            int sub=0;
            int mul=0;
            int div=0;
            if(request.getParameter("btnOk")!=null)
            {
                int i=Integer.parseInt(request.getParameter("txtFirstNo"));
                int j=Integer.parseInt(request.getParameter("txtSecondNo"));
                add=i+j;
                sub=i-j;
                mul=i*j;
                div=i/j;
            }
        %>
        <form action="" method="get">
        <table align="center" cellpadding="6" bgcolor="black">
            <tbody align="center" bgcolor="darkgray">
                <tr>
                    <td>Enter no1:</td>
                    <td><input type="text" value="" name="txtFirstNo"></td>
                </tr>
                <tr>
                  <td>Enter no2:</td>
                  <td><input type="text" value="" name="txtSecondNo"></td>
                </tr>
                <tr>
                    <td colspan="2"><select name="Calculator">
                            <option value="1">Addition</option>
                            <option value="2">Subtraction</option>
                            <option value="3">Multiplication</option>
                            <option value="4">Division</option>
                        </select></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" name="btnOk" value="Calculate"></td>
                </tr>
                <%
                 if(request.getParameter("btnOk")!=null)
                            {%>
                <tr>
                    <td colspan="2">Your Ans is:
                        <%
                           
                            int ch=Integer.parseInt(request.getParameter("Calculator"));
                            switch(ch)
                            {
                                case 1:
                                 %> <%=add%><%
                                     break;
                                case 2:
                                 %> <%=sub%><%
                                     break;
                                case 3:
                                 %> <%=mul%><%
                                    break;
                                case 4:
                                 %> <%=div%><%
                                  break;  
                            }

                        %>
                    </td>
                </tr>
                <%
                }
                %>
            </tbody>
        </table>
        </form>
    </body>
</html>
