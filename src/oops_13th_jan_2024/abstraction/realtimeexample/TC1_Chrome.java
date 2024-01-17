package src.oops_13th_jan_2024.abstraction.realtimeexample;

public class TC1_Chrome extends BaseClass{
    @Override
    String openBrowser() {
        System.out.println("Starting chrome");
        return null;
    }

    @Override
    String closeBrowser() {
        System.out.println("Clsoing chrome");
        return null;
    }
}
