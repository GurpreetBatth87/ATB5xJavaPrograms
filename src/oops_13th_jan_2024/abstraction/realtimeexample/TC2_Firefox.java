package src.oops_13th_jan_2024.abstraction.realtimeexample;

public class TC2_Firefox extends BaseClass{
    @Override
    String openBrowser() {
        System.out.println("Starting FF");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Clsoing FF");
        return null;
    }
}
