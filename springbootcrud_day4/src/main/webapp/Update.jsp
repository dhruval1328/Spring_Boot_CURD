<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f3f3f3;
                margin: 0;
                padding: 0;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
            }
 
            .main {
                background-color: #fff;
                border-radius: 15px;
                box-shadow: 0 0 20px
                    rgba(0, 0, 0, 0.2);
                padding: 20px;
                width: 300px;
            }
 
            .main h2 {
                color: #4caf50;
                margin-bottom: 20px;
            }
 
            label {
                display: block;
                margin-bottom: 5px;
                color: #555;
                font-weight: bold;
            }
 
            input[type="text"],
            input[type="email"],
            input[type="password"],
            select {
                width: 100%;
                margin-bottom: 15px;
                padding: 10px;
                box-sizing: border-box;
                border: 1px solid #ddd;
                border-radius: 5px;
            }
 
            button[type="submit"] {
                padding: 15px;
                border-radius: 10px;
                border: none;
                background-color: #4caf50;
                color: white;
                cursor: pointer;
                width: 100%;
                font-size: 16px;
            }
        </style>
</head>

 <div class="main">
      <h2>Registration Form</h2>
<form action="update"> 
		<label for="first"
                    >ID:</label
                >
                <input
                    type="text"
                    id="eid"
                    name="eid"
                    value="${stu.eid}"
                    required
                />
 
                <label for="Name"
                    >Name:</label
                >
                <input
                    type="text"
                    id="name"
                    name="name"
                    value="${stu.name}"
                    required
                />
 
                <label for="username">Username:</label>
                <input
                    type="text"
                    id="user"
                    name="username"
                    value="${stu.username}"
                    required
                />
 
                <label for="password"
                    >Password:</label
                >
                <input
                    type="password"
                    id="password"
                    name="password"
                    value="${stu.password}"
                    pattern="^(?=.*\d)(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9])\S{8,}$"
                    title="Password must contain at least one number, 
                           one alphabet, one symbol, and be at 
                           least 8 characters long"
                    required
                />
 
              
 
                <button type="submit" value="update">
                    Update
                </button>
</form>
</body>
</html>