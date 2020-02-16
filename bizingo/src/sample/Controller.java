package sample;


import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public class Controller {

    @FXML
    public void PegaEvento(Event event){
        Node source = (Node)event.getSource();
        Integer colIndex = GridPane.getColumnIndex(source);
        Integer rowIndex = GridPane.getRowIndex(source);
        System.out.printf("Clique na célula [%d, %d]%n", colIndex.intValue(), rowIndex.intValue());
    }

   // public void Mover (){
   //     Integer

  //  }
}
