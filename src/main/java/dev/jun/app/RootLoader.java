package dev.jun.app;



import dev.sol.core.application.loader.FXLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class RootLoader extends FXLoader{
    
    @Override
    public void load() {
        Scene scene = (Scene) params.get("scene");

        try {
            Parent root = loader.load();
            scene.setRoot(root);

            RootController controller = loader.getController();
            controller.load();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
