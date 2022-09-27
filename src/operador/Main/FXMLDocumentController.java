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
import javafx.scene.control.RadioButton;
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
    
    @FXML
    private RadioButton suma, resta, mult, div;
    
    private int primero, segundo, opt;
    
    @FXML
    public void txtOperando1(){
        primero = Integer.valueOf(operando1.getText());
        //System.out.println(primero);
    }
    
    @FXML
    public void txtOperando2(){
        segundo = Integer.valueOf(operando2.getText());
        //System.out.println(segundo);
    }
    
    @FXML
    public void sumar(){
        opt = 1;
    }
    
    @FXML
    public void restar(){
        opt = 2;
    }
    
    @FXML
    public void dividir(){
        opt = 3;
    }
    
    @FXML
    public void multiplicar(){
        opt = 4;
    }
    
    @FXML
    public void btnOperarOnAction(){  
        if(operando1.getText().isEmpty() || operando2.getText().isEmpty()){
            opt = 5;
            suma.setSelected(false);
            div.setSelected(false);
            mult.setSelected(false);
            resta.setSelected(false);
        }
        System.out.println(opt);
        switch (opt) {
            case 0:
                resultado.setText("Seleccione una opción");
                break;
                
            case 1:
              resultado.setText(String.valueOf(primero + segundo));
              break;
              
            case 2:
              resultado.setText(String.valueOf(primero - segundo));
              break;
              
            case 3:
              if (segundo == 0){
                  resultado.setText("Error, divisor 0");
              } else {
                  resultado.setText(String.valueOf(primero / segundo));
              }                  
              break;
              
            case 4:
              resultado.setText(String.valueOf(primero * segundo));
              break;
              
            case 5:
                resultado.setText("Operando vacío");
                break;
              
            default:
                resultado.setText("Error");
        } 
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        opt = 0;
    }    
    
}
