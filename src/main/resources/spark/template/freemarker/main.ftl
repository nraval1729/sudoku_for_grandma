<!DOCTYPE html>
  <head>
    <meta charset="utf-8">
    <title>${title}</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- In real-world webapps, css is usually minified and
         concatenated. Here, separate normalize from our code, and
         avoid minification for clarity. -->
    <link rel="stylesheet" href="css/normalize.css">
    <link rel="stylesheet" href="css/main.css">
    <!-- <link rel="stylesheet" href="css/bootstrap.min.css"> -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

    <script src="js/jquery-2.1.1.js"></script>
    <script src="js/main.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

  </head>

  <body>    
    <h1 align="center">Sudoku</h1>

    <center>
	    <div class = "btn-group">


		    <button type = "button" class = "btn btn-primary btn-lg" id = "warmupButton" onclick = "handleWarmup()"> Warmup </button>
		    <button type = "button" class = "btn btn-primary btn-lg" id = "easyButton" onclick = "handleEasy()"> Easy </button>
		    <button type = "button" class = "btn btn-primary btn-lg" id = "mediumButton" onclick = "handleMedium()"> Medium </button>
		    <button type = "button" class = "btn btn-primary btn-lg" id = "hardButton" onclick = "handleHard()"> Hard </button>
		    <button type = "button" class = "btn btn-primary btn-lg" id = "insaneButton" onclick = "handleInsane()"> Insane </button>

	    </div>

	    	<div id="sudokuGrid">
	    	</div>
    </center>
    
  </body>
  <!-- See http://html5boilerplate.com/ for a good place to start
       dealing with real world issues like old browsers.  -->
</html>