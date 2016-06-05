var rows = 9;
var cols = 9;
var cellWidth;
var cellHeight;

$(document).ready(function() {
	console.log("Document has loaded!");
	// cellHeight = $('#sudokuGrid').height()/rows;
	// cellWidth = $('#sudokuGrid').width()/cols;
	cellWidth = 20;
	cellHeight = 20;
	console.log("cellWidth: " +cellWidth);
	console.log("cellHeight: " +cellHeight);

	for(var i = 0; i < rows; i++) {
		for(var j = 0; j < cols; j++) {
			$('<div class = "gridCell"</div>').css({
				"width": cellWidth,
				"height": cellHeight,
			}).appendTo("#sudokuGrid");
		}
		$("#sudokuGrid").append("<br/>");
	}
});