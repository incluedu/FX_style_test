import javafx.scene.control.TextField;

public class StyleTest {

    public TextField textField;


    public void testStyle(){
        textField.setStyle("-fx-background-color: yellow");
        textField.setStyle("-fx-alignment: inherit");
    }
}
