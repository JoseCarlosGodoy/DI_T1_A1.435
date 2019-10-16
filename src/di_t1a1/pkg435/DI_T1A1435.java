/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a1.pkg435;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class DI_T1A1435 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane root=new Pane();
        Text t=new Text(20,20,"A");
        root.getChildren().add(t);
        Scene scene = new Scene(root, 300, 250);
        //Hace que el manejador de eventos vaya al texto y no a la escena
        t.setFocusTraversable(true);
        
        primaryStage.setTitle("Ejercicio 435");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        t.setOnKeyPressed(e->{
            switch(e.getCode()){
                case DOWN:t.setY(t.getY()+10);break;
                case LEFT:t.setX(t.getX()-10);break;
                case RIGHT:t.setX(t.getX()+10);break;
                case UP:t.setY(t.getY()-10);break;
                
            }
                
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
