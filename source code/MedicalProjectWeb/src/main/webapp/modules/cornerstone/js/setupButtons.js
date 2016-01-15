
function setupButtons(studyViewer, viewportModel, type) {
   
    // Tool button event handlers that set the new active tool

    // WW/WL
	
	if (type == "明暗")
    {
        disableAllTools();
        forEachViewport(function(element) {
            cornerstoneTools.wwwc.activate(element, 1);
            cornerstoneTools.wwwcTouchDrag.activate(element);
        });
    }

    // Invert
	if (type == "反色")
    {
        disableAllTools();
        forEachViewport(function(element) {
            var viewport = cornerstone.getViewport(element);
            // Toggle invert
            if (viewport.invert === true) {
                viewport.invert = false;
            } else {
                viewport.invert = true;
            }
            cornerstone.setViewport(element, viewport);
        });
    }

    // Zoom
	if (type == "缩放")
    {
        disableAllTools();
        forEachViewport(function(element) {
            cornerstoneTools.zoom.activate(element, 5); // 5 is right mouse button and left mouse button
            cornerstoneTools.zoomTouchDrag.activate(element);
        });
    }

    // Pan
	if (type == "移动")
    {
        disableAllTools();
        forEachViewport(function(element) {
            cornerstoneTools.pan.activate(element, 3); // 3 is middle mouse button and left mouse button
            cornerstoneTools.panTouchDrag.activate(element);
        });
    }

    // Stack scroll
	if (type == "卷轴")
    {
        disableAllTools();
        forEachViewport(function(element) {
            cornerstoneTools.stackScroll.activate(element, 1);
            cornerstoneTools.stackScrollTouchDrag.activate(element);
        });
    }

    // Length measurement
	if (type == "长度")
    {
        disableAllTools();
        forEachViewport(function(element) {
            cornerstoneTools.length.activate(element, 1);
			cornerstoneTools.lengthTouch.activate(element);
        });
    }

    // Angle measurement
	if (type == "角度")
    {
        disableAllTools();
        forEachViewport(function(element) {
            cornerstoneTools.angle.activate(element, 1);
			cornerstoneTools.angleTouch.activate(element);
        });
    }

    // Pixel probe
	if (type == "单点")
    {
        disableAllTools();
       
        forEachViewport(function(element) {
            cornerstoneTools.probe.activate(element, 1);
			cornerstoneTools.probeTouch.activate(element);
        });
    }
   
	
    // Elliptical ROI
	if (type == "椭圆")
    {
        disableAllTools();
       
        forEachViewport(function(element) {
            cornerstoneTools.ellipticalRoi.activate(element, 1);
			cornerstoneTools.ellipticalRoiTouch.activate(element);
        });
    }

    // Rectangle ROI
	if (type == "矩形")
    {
        disableAllTools();
       
        forEachViewport(function (element) {
            cornerstoneTools.rectangleRoi.activate(element, 1);
			cornerstoneTools.rectangleRoiTouch.activate(element);
        });
    }

	 // remove measurements
	 if (type == "清除")
	{
        disableAllTools();
       
        forEachViewport(function(element) {
			cornerstoneTools.clearToolState(element, "length");
			cornerstoneTools.clearToolState(element, "angle");
			cornerstoneTools.clearToolState(element, "probe");
			cornerstoneTools.clearToolState(element, "ellipticalRoi");
			cornerstoneTools.clearToolState(element, "rectangleRoi");
            cornerstone.updateImage(element);
            
        });
    } 
	
	
    // Play clip
	if (type == "播放")
    {
        forEachViewport(function(element) {
          var stackState = cornerstoneTools.getToolState(element, 'stack');
          var frameRate = stackState.data[0].frameRate;
          // Play at a default 10 FPS if the framerate is not specified
          if (frameRate === undefined) {
            frameRate = 10;
          }
          cornerstoneTools.playClip(element, frameRate);
        });
    }

    // Stop clip
	if (type == "停止")
    {
        forEachViewport(function(element) {
            cornerstoneTools.stopClip(element);
        });
    }
	

};
