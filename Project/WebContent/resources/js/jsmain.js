src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"
src="resources/bootstrap/js/bootstrap.min.js"
src="https://code.jquery.com/jquery-2.1.4.min.js"

		function maxLengthCheck(object)
		  {
		    if (object.value.length > object.maxLength)
		      object.value = object.value.slice(0, object.maxLength)
		  }
		
		var root_url = '<c:url value="/" />';
		function eternal(){
			$('img').fadeToggle(4000, function(){
				eternal();
			});
		}
	
		function onClick(){
		$('img').click(function() {
		       $(this).toggle(1000);
		   });
		}
		
		function createBtn(){
			$(".crt").toggle(1000);
		}
	
		/*window.onload = function(){
			$(document).ready(function() {
				
				
				onClick();
				$(".create_btn").click(createBtn);
				$(".create_btn").on('click',function(){
			        var r= $('<input type="button" value="new button"/>');
			        $("body").append(r);
			    });
						//eternal();
			});
		}*/

