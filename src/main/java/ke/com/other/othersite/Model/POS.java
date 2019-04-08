package ke.com.other.othersite.Model;

import org.springframework.web.bind.annotation.*;

public class POS {

    @CrossOrigin(origins = "http://localhost:4200")
    @RestController
    public class PosController {
        String message;

        //using Get mapping , one needs to specify the path
        @PostMapping(path = "add-pos")
        public BeanClass HelloWorld(){


            return new BeanClass("you have successfully added Pos");
        }

        //list
        @GetMapping(path="/list")
        public BeanClass Hello(){

            return new BeanClass("hello world bean");
        }


        @PutMapping(path = "/nextdata")
        public String NextDataService(){

            return "its working now ";
        }
        @DeleteMapping(path="/delete")
        public String DeletePos(){

            return "you have successfully deleted Pos";
        }


    }

}
