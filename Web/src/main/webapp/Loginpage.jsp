<html>
<head>
<meta charset="utf-8">
<title>Log In Page</title>

<style>

body{
	margin:auto;
	font-family:arial;
	background-image: url("automation1.jpg");
	background-size: 100%;
	background-repeat:no-repeat;
}
div#centrecol{
	margin-left:22%;margin-right:22%;
	margin-top:0.4em;
	padding:1em 2em 5em 2em;
	border:solid 1px #ccc;
	background:white;
/*transparency*/
	opacity:0.95;
}
h1{
	color:Tomato;
}

/*form*/
fieldset{
	border:solid 2px #ccc;
	padding:1em 1.4em 0em 1em;
}
fieldset legend{
	font-size:20px;
	padding-left:0.3em; padding-right:0.3em;
}

/*input boxes*/
fieldset input{
	border-radius:4px;
	border:solid 1px #ccc;
	display:block;
	margin-top:0.3em; margin-bottom:1.1em;
	font-size:14px;
}
fieldset input.textbox{
	width:100%;
	height:1.8em;
	padding-left:0.3em
}
/*login button*/
fieldset input#loginbut{
	width:7em;
	height:2em;
}

</style>

</head>
<body>
	<div id="centrecol">
<<<<<<< HEAD
<<<<<<< HEAD
	<h1>Automation Framework</h1>
=======
=======
	
	<h1>Automation Results</h1>
>>>>>>> branch 'master' of https://github.com/Ashmydavid/wamaf.git
	
<<<<<<< HEAD
	<h1>Automation Results</h1>
>>>>>>> branch 'master' of https://github.com/Ashmydavid/wamaf.git
	
=======
>>>>>>> branch 'master' of https://github.com/Ashmydavid/wamaf.git
		<form action="Login" method="post">
	
			<fieldset>
				<legend>Log In</legend>
				
					<label>
					Username:<input type="text" class="textbox" name="username" required>
					</label>
					
					<label>
					Password:<input type="password" class="textbox" name="password" required>
					</label>
					
					<input type="submit" id="loginbut" value="Log in">
					
			</fieldset>
		</form>
	
	
	</div>
</body>
</html>