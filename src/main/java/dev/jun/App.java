package dev.jun;

import dev.jun.app.RootLoader;
import dev.sol.core.application.FXApplication;
import dev.sol.core.application.loader.FXLoaderFactory;
import dev.sol.core.scene.FXSkin;
import dev.sol.db.DBService;

public class App extends FXApplication {
    public static final DBService DB_EMPLOYEE = DBService.INSTANCE.initialize("jdbc:mysq://Localhost/employee");

    @Override
    public void initialize() throws Exception {


        setTitle("babyjared_Employ");
        setSkin(FXSkin.PRIMER_LIGHT);
        _initialize_application();
    }

    private void _initialize_application() {
        RootLoader rootLoader = (RootLoader) FXLoaderFactory
                .createInstance(RootLoader.class, App.class.getResource("/dev/jun/app/ROOT.fxml"))
                .addParameter("scene", applicationScene).initialize();
        rootLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}