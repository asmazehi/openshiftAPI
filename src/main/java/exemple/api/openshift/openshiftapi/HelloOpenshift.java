package exemple.api.openshift.openshiftapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloOpenshift {
    @GetMapping("/hello")
    public String hello(){
        return  "Hello Openshift Version 1";
    }

}
