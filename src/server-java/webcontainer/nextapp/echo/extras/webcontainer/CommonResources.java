package nextapp.echo.extras.webcontainer;

import nextapp.echo.webcontainer.ContentType;
import nextapp.echo.webcontainer.ResourceRegistry;
import nextapp.echo.webcontainer.WebContainerServlet;

public class CommonResources {

    static {
        ResourceRegistry resources = WebContainerServlet.getResourceRegistry();
        resources.addPackage("Extras", "nextapp/echo/extras/webcontainer/resource/");
        resources.add("Extras", "image/Ok.gif", ContentType.IMAGE_GIF);
        resources.add("Extras", "image/Cancel.gif", ContentType.IMAGE_GIF);
    }
    
    public static void install() {
    }
}