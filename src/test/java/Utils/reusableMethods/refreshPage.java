package Utils.reusableMethods;

import Utils.logs.Log;
import baseClass.initialize;

public class refreshPage extends initialize {
    public static void page_refresh()
    {
        try
        {
            driver.navigate().refresh();
        }
        catch (Exception e)
        {
            Log.error("Refreshing the page " +e);
        }
    }
}
