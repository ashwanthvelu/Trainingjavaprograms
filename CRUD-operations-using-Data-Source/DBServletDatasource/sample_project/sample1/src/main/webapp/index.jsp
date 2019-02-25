<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
        .button {
            background-color: #4CAF50; /* Green */
            border: none;
            color: white;
            padding: 16px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            -webkit-transition-duration: 0.4s; /* Safari */
            transition-duration: 0.4s;
            cursor: pointer;
        }
        
        .button1 {
            background-color: white; 
            color: black; 
            border: 2px solid #4CAF50;
        }
        
        .button1:hover {
            background-color: #4CAF50;
            color: white;
        }
        
        .button2 {
            background-color: white; 
            color: black; 
            border: 2px solid #008CBA;
        }
        
        .button2:hover {
            background-color: #008CBA;
            color: white;
        }
        
        </style>
</head>
<style>
body {
    background-image: "C:\Users\trainee\Documents\paperr.gif";
}
</style>
<body>
        <E><center>KGFSL MEETING</h1></center>
            <p>Meeting about Internship training</p>
            <p><strong>Venue:</strong>KGFSL-4th floor </p>
            
            <button class="button button1"><a href="/UserController?action=listUser"/>Participate</a></button>
            <button class="button button2">Present</button>
            
    <!--<button class="button button2"><a href="/UserController?action=listUser"/>Listuser</a></button>
    <a href="/UserController?action=listUser" /><input type="submit" value="Listuser"></a>-->
</body>
</html>