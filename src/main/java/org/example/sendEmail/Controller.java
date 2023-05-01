package org.example.sendEmail;
import org.example.newYorkTimesApi.NewyorkTimesApi;

import java.util.Map;

public class Controller {
    private SendEmail sendEmail;
    private NewyorkTimesApi newyorkTimesApi;
    public Controller(){
        Map<String, String> env = System.getenv();
        sendEmail = new SendEmail("lashkiba.st.lorenzo@maxplanck.edu.it","lorenzoboiko@gmail.com",env.get("password"));
        newyorkTimesApi = new NewyorkTimesApi();
    }

    public void sendDefaultEmail(String theme){
        if( newyorkTimesApi.getXmlFile(theme)) {
            sendEmail.send(newyorkTimesApi.getContent());
        }else{
            System.out.println("Retry");
        }
    }
    public void sendCustomEmail(String email,String theme){
        if(newyorkTimesApi.getXmlFile(theme)) {
            sendEmail.send(newyorkTimesApi.getContent(), email);
        }else{
            System.out.println("Retry");
        }

    }
}
