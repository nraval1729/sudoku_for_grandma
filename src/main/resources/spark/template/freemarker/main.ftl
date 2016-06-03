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
  </head>
  <body>
  	<script src="js/jquery-2.1.1.js"></script>
    <script src="js/main.js"></script>
    
    <h1 align="center">Bacon</h1>
    
     <div id = "wrapperDiv">
     <!-- <form method="POST" action="/path"> -->
	     <div id="startActorDiv">
	      <textarea id="userInputStartActor" rows="1" cols="20" placeholder="Start Actor!">
	      </textarea>
	      
	       <div class="listOfSuggestions1">
      
		      <div id="suggestionStart1">
		      </div>
		
		       <div id="suggestionStart2">
		      </div>
		
		       <div id="suggestionStart3">
		      </div>
		
		       <div id="suggestionStart4">
		      </div>
		
		       <div id="suggestionStart5">
		      </div>
		
		  </div>
	    </div>
	    
	     <div id="endActorDiv">
	      <textarea id="userInputEndActor" rows="1" cols="20" placeholder="End Actor!">
	      </textarea>
	      
	      <div class="listOfSuggestions2">
      
		      <div id="suggestionEnd1">
		      </div>
		
		       <div id="suggestionEnd2">
		      </div>
		
		       <div id="suggestionEnd3">
		      </div>
		
		       <div id="suggestionEnd4">
		      </div>
		
		       <div id="suggestionEnd5">
		      </div>
		
		  </div>
	      
	    </div>
	    
	    <input id ="submitButton" type = "submit" value = "Find Path!">
	 <!-- </form> -->
	 </div>

	 <div id = "path">
	 </div>
    
  </body>
  <!-- See http://html5boilerplate.com/ for a good place to start
       dealing with real world issues like old browsers.  -->
</html>