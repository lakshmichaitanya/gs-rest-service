package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class GreetingController {
	@RequestMapping("/greeting")
 	 public ArrayList greeting() {
		Greeting a1=new Greeting(1,"one");
		Greeting a2=new Greeting(2,"two");
		Greeting a3=new Greeting(3,"three");
		
	        ArrayList list=new ArrayList();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		return list;
       
		
	}
}

   /* private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

   @RequestMapping("/greeting")
    public @ResponseBody Greeting greeting(@ModelAttribute(value="name") String 		  			name,BindingResult result) {
        	Greeting res= new Greeting();
                if(!result.hasErrors()){
       			 nameList.add(name);
       			 res.setStatus("SUCCESS");
    		}
		else{
        		res.setStatus("FAIL");
   		 }
   res.setResult(name);
   return res;
  }*/
 	

//}



