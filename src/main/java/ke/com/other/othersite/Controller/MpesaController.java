package ke.com.other.othersite.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MpesaController {
    @RequestMapping(value = "/generateToken", method = RequestMethod.POST)
    public void mpesaAuthentication(){

    }
}
