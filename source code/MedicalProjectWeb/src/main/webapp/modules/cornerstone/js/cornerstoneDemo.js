// Load in HTML templates
var loadCnt = 2;
var isViewerOpen = false;
var viewportTemplate; // the viewport template
loadTemplate("templates/viewport.html", function(element) {
    viewportTemplate = element;
    
    loadCnt--;
    if( loadFinish() == true && isViewerOpen == false){
    	isViewerOpen = true;
    	openViewer();
    }
});

var studyViewerTemplate; // the study viewer template
loadTemplate("templates/studyViewer.html", function(element) {
    studyViewerTemplate = element;
    
    loadCnt--;
    if( loadFinish() == true && isViewerOpen == false){
    	isViewerOpen == true;
    	openViewer();
    }
});

function loadFinish(){
	if( loadCnt == 0 ){
		return true;
	}
	return false;
}


function openViewer(){

    // Add tab content by making a copy of the studyViewerTemplate element
    var studyViewerCopy = studyViewerTemplate.clone();

    studyViewerCopy.attr("id", 'x' + 1);
    // Make the viewer visible
    studyViewerCopy.removeClass('hidden');
    // Add section to the tab content
    studyViewerCopy.appendTo('#tabContent');

    // Now load the study.json
    loadStudy(studyViewerCopy, viewportTemplate, studyId);
}

// Resize main
function resizeMain() {
  var height = $(window).height();
  $('#main').height(height - 50);
  $('#tabContent').height(height - 50 - 42);
}


// Call resize main on window resize
$(window).resize(function() {
    resizeMain();
});
resizeMain();


// Prevent scrolling on iOS
document.body.addEventListener('touchmove', function(e) {
  e.preventDefault();
});
