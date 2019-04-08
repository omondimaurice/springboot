
/*
package ke.com.other.othersite.Service;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import ke.com.other.othersite.Model.MpesaAuthorisationResponse;
import ke.com.other.othersite.utils.HttpCall;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.header.Header;

import java.io.Console;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class MpesaService {

    @Value("mpesa.api.consumerkey")
    private String consumerkey;


    @Value("mpesa.api.consumersecret")
    private String secretkey;

    @Value("mpesa.api.baseurl")
    private String mpesabaseurl;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private HttpCall<MpesaAuthorisationResponse> authorizationHttpCall;
    public Map<String,Object> generateToken(){

        Map<String,Object> map = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();

        try{
           HttpHeaders  httpheaders= new HttpHeaders();

           httpheaders.setContentType(MediaType.APPLICATION_JSON);

            String keys=consumerkey+":"+secretkey;

           byte[] auth = Base64.encodeBase64(keys.getBytes(Charset.forName("US-ASCII")));
           String authHeader="Basic " + new String(auth);
            httpheaders. set("Authorization", authHeader);


            final ResponseEntity<MpesaAuthorisationResponse> response = authorizationHttpCall.sendAPIGatewayGETRequest(mpesabaseurl+auth,httpheaders, MpesaAuthorisationResponse.class);

            MpesaAuthorisationResponse authorizationResponse =response.getBody();
            if (response.getStatusCode() == HttpStatus.OK) {
                //Console.println();
               // logger.info("STATE 200 RESPONSE FROM MPESA GATEWAY: " + mapper.writeValueAsString(authorizationResponse), Console.ANSI_BLUE);
              // Console.println();

                map.put("status", "00");
                map.put("accessToken", authorizationResponse.getAccess_token());
                map.put("expiresIn", authorizationResponse.getExpires_in());
                map.put("message", "Success.");

            }



        }
        catch(Exception e){


        }

        return map;
    }
}

*/
