function DoIncJs(sSrc){
var oHead = document.getElementsByTagName('head')[0];
var oScript = document.createElement('script');
	oScript.type = "text/javascript";
	oScript.src = sSrc;
	oHead.appendChild(oScript);
}

function IncJsFiles(sUrls) {
	var sUrls=sUrls.split(",");
	for(var i=0;i<sUrls.length;i++) {
	DoIncJs(sUrls[i]);
	}
}

IncJsFiles("js/common/jquery-1.11.2.js");