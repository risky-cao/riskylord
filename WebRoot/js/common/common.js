/**
 */
function updateJsMain(){
	var URL = arguments[0];
	var type = "get";
	var pars = "";
	if(arguments[1]=="get"||arguments[1]=="post"){
		type = arguments[1];
		pars = arguments[2];
	}
	else{
		pars = arguments[1];
	}
	var myAjax = new Ajax.Updater(
		'Main',
		URL,
		{
			method : type,
			parameters : pars,
			onComplete : callback
		}
	)
}

/**
 */
function updateJs(){
	var frame = arguments[0];
	var URL = arguments[1];
	var type = "get";
	var pars = "";
	if(arguments[2]=="get"||arguments[2]=="post"){
		type = arguments[2];
		pars = arguments[3];
	}
	else{
		pars = arguments[2];
	}
	var myAjax = new Ajax.Updater(
		frame,
		URL,
		{
			method : type,
			parameters : pars,
			onComplete : callback
		}
	)
}

function updateCB(){
	var frame = arguments[0];
	var URL = arguments[1];
	var type = "get";
	var pars = "";
	var cbmethod =  "";
	if(arguments[2]=="get"||arguments[2]=="post"){
		type = arguments[2];
		pars = arguments[3];
		cbmethod = arguments[4];
	}
	else{
		pars = arguments[2];
		cbmethod = arguments[3];
	}
	var myAjax = new Ajax.Updater(
		frame,
		URL,
		{
			method : type,
			parameters : pars,
			onComplete : cbmethod
		}
	)
}

function callback(){
//	alert("success");
}

Event.observe(document, "keydown", function(event) {
	var e = Event.element(event);
    if(event.shiftKey)
    {
        if(event.keyCode==119){
  	  		if(confirm("reload js?")){
  	  			window.location.reload();
  	  		}else{
  	  			return false;
  	  		}
        }

    }
  });



function shadow(){
	if(arguments.length!=0){
		//alert("dddd");
	}
	var shadowMask = document.createElement("div");
	shadowMask.setAttribute("id", "shadowMask");
	document.body.appendChild(shadowMask);
}

function noShadow(){
	var shadowMask = $('shadowMask');
	if(shadowMask!=null){
		document.body.removeChild(shadowMask);
	}
}

function WinOpen(){
	if(arguments[0]=='undefined'){
		alert("argument is not blank,must be a form");
		return false;
	}else{
		form = arguments[0];
	}
	 form.target = "newWindow";
	 var win = window.open("about:blank","newWindow","height=650,width=1000,scrollbars=yes,status=yes,toolbar=no,menubar=no,location=no");
	 win.focus();
	 form.submit();
	 form.target = "_self";

}