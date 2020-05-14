import org.example.api.implementations.CustomInterfaceImpl;
import org.junit.Test;

public class CustomerInterfaceImplTest {

    @Test
    public void customHttpRequestTest(){
        CustomInterfaceImpl customInterface = new CustomInterfaceImpl();
        String url ="http://restapi.demoqa.com/utilities/weather/city/Hyderabad";
        String method = "GET";
        String result = customInterface.CustomHttpRequest(method,url);

    }

}
