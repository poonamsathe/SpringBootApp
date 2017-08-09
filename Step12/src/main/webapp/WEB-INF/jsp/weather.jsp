<html>

<head>
<title>First Web Application</title>
<style>
.myTable { 
  width: 50%;
  text-align: left;
  background-color: lemonchiffon;
  border-collapse: collapse; 
  }
.myTable th { 
  background-color: goldenrod;
  color: white; 
  }
.myTable td, 
.myTable th { 
  padding: 10px;
  border: 1px solid goldenrod; 
  }
</style>
</head>

<body>

	<form method="post">
		Name : <input type="text" name="city" />
			<input type="submit" />
	</form>
     <h2>${cityname}</h2>
	
	<font color="red">${data}</font>
	<font color="red">${errorMessage}</font>
</body>

</html>