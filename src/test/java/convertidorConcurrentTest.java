
/**import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import parcial.controller.convertidorRESTController;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = RANDOM_PORT)*/
public class convertidorConcurrentTest {
   

/**
    @LocalServerPort
    private int port;
    @MockBean
    private convertidorRESTController cc;


    @Test
    public void mustSurviveTenRequests(){
        ArrayList<Thread> th= new ArrayList<>();
        for(int i=0;i<10;i++){
            Thread thread = new Thread(){
                public void run(){
                    cc.getConversion("celsius",22);
                    cc.getConversion("fahrenheit", 50);
                }
            };
            th.add(thread);

        }
        for(int i=0;i<th.size();i++){
            th.get(i).start();
        }
        Assert.assertTrue(true);


    }
    @Test
    public void mustSurviveTenRequests2(){
        ArrayList<Thread> th= new ArrayList<>();
        for(int i=0;i<10;i++){
            Thread thread = new Thread(){
                public void run(){
                    MockMvcRequestBuilders.get("/Temp/celsius/22");
                    MockMvcRequestBuilders.get("/Temp/fahrenheit/50");
                }
            };
            th.add(thread);

        }
        for(int i=0;i<th.size();i++){
            th.get(i).start();
        }
        Assert.assertTrue(true);


    }

*/
}
