package src;

import com.axiatadigitallabs.axi.AxiAgentService;
import com.axiatadigitallabs.axi.AxiWebDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author Prishan
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting axi sample automation");
        AxiAgentService axiAgentService = new AxiAgentService();
        AxiWebDriver axiWebDriver = axiAgentService.openChromeBrowser();
        axiWebDriver.get("https://www.axiatadigitallabs.com");
        TimeUnit.SECONDS.sleep(5);
        axiWebDriver.close();
        System.out.println("End of the sample automation");
    }
}
