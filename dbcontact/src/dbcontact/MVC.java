package dbcontact;
public class MVC {

    public MVC() {
        Model model = new Model();
        View view = new View();
        Controller control = new Controller(model,view);
    }
    
}
