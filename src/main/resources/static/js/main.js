var rows = 9;
var cols = 9;
var cellWidth;
var cellHeight;

// $(document).ready(function() {
// 	$(".gridCell").click(function() {
// 		alert("Nisarg is the boss!");
// 	})
// });

	function handleWarmup() {
		getPuzzle("warmup");
	}

	function handleEasy() {
		getPuzzle("easy");
	}

	function handleMedium() {
		getPuzzle("medium");
	}

	function handleHard() {
		getPuzzle("hard");
	}

	function handleInsane() {
		getPuzzle("insane");
	}

	function getPuzzle(level) {
		var levelInJson = JSON.stringify(level);

		$.post("/puzzle", {level: levelInJson}, function(data){
			var puzzleString = JSON.parse(data).puzzleString;
			drawPuzzle(puzzleString);
		});
	} 

	function drawPuzzle(puzzleString) {
		$('#sudokuGrid').empty();

		cellWidth = 55;
		cellHeight = 55;



		for(var row = 0; row < rows; row++) {
			for(var col = 0; col < cols; col++) {
				var divId = "gridCell" +row +col;
				// console.log("DivIddddd: "+divId);
				// $('<div class = "gridCell" id = ' +divId + '> <a href="#" class="fill-div"></a> </div>').css({
				   $('<div class = "gridCell" id = ' +divId + '> <input type="text"></input></div>').css({

					"width": cellWidth,
					"height": cellHeight,
					"vertical-align": "top",
				}).appendTo("#sudokuGrid");

				var id = "#" + "gridCell" +row +col;
				var fooId = "gridCell" +row +col;

				if(col == 2 || col == 5) {
					$(id).css({
						"border-right": "1px solid #1919ff",
					});
				}

				if(col == 3 || col == 6) {
				$(id).css({
					"border-left": "1px solid #1919ff",
				});
				}

				if(row == 2 || row ==5) {
					$(id).css({
						"border-bottom": "1px solid #1919ff",
					})
				}

				if(row == 3 || row == 6) {
					$(id).css({
						"border-top": "1px solid #1919ff",
					})
				}
				var index = row*9 + col;

				if(puzzleString[index] != 0) {
					$(id).html("<p>" +puzzleString[row*9 + col] +"</p>");
				}
				else {
					$(id).click(function() {
						this.contentEditable='true';
						document.getElementById(fooId).style.fontSize="xx-large";
					});
					$(id).click();
					$(id).html("<p></p>");
				}
			}
			$("#sudokuGrid").append("<br/>");
		}

		
	}

