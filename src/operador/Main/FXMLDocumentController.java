/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operador.Main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author fullerd3v
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField operando1, operando2, resultado;
    
    @FXML
    private Button btnOperar;
    
    private int primero;
    private int segundo;
    
    @FXML
    public void txtOperando1(){
        primero = Integer.valueOf(operando1.getText());
        System.out.println(primero);
    }
    
    @FXML
    public void txtOperando2(){
        segundo = Integer.valueOf(operando2.getText());
    }
    
    @FXML
    public void btnOperarOnAction(){
        resultado.setText(String.valueOf(primero + segundo));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}
