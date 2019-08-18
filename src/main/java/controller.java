import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("admin")
public class controller {

    @RequestMapping(method = RequestMethod.GET,path = "/hello")
    public String hello(){
        return "hello working";
    }

}
