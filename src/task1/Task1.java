package task1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author KAMWANA
 */
public class Task1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //components
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        Label lb1 = new Label("STUDENTS DETAILS");
        TextField fn = new TextField("First Name");
        TextField ln = new TextField("Last Name");
        TextField dt = new TextField("Date");
        Button ep = new Button("Edit Photo");
        Button sv = new Button("Save");
        Button ex = new Button("Exit");
        Image pic;
        Label lp = new Label();
        ToggleGroup group = new ToggleGroup();
        RadioButton rm = new RadioButton("Male");
        RadioButton rf = new RadioButton("Female");
        
        pic = new Image("img1.jpg");
        lp.setGraphic(new ImageView(pic));
        rm.setToggleGroup(group);
        rf.setToggleGroup(group);
        //layouts
        VBox root=new VBox();
        StackPane lay1 = new StackPane();
        HBox lay2 = new HBox();
        HBox lay3 = new HBox();
        VBox lay21 = new VBox();
        VBox lay22 = new VBox();
        HBox lay23 = new HBox();
        //styling
        root.setPadding(new Insets(20));
        root.setSpacing(10);
        lay2.setSpacing(10);
        sv.setPadding(new Insets(20));
        ex.setPadding(new Insets(20));
        ep.setPadding(new Insets(20));
        lay3.setPadding(new Insets(20));
        lay21.setSpacing(10);
        lay23.setPadding(new Insets(10));
        lay22.setPadding(new Insets(10));
        lay22.setSpacing(10);
        lay21.setPadding(new Insets(10));
        lay3.setSpacing(20);
        lay3.setAlignment(Pos.CENTER_RIGHT);
        lay1.setStyle("-fx-border-color:black");
        lay21.setStyle("-fx-border-color:red");
        lay22.setStyle("-fx-border-color:green");
        lay3.setStyle("-fx-border-color:black");
        lb1.setFont(Font.font("Verdana",FontWeight.BOLD, 20));
        //action
        ep.setOnAction((ActionEvent event) -> {
            JOptionPane.showMessageDialog(null,
                    "Your clicked Edit Photo");
        });
        ex.setOnAction((ActionEvent event) -> {
            JOptionPane.showMessageDialog(null, 
                    "Your clicked Exit Button");
        });
        sv.setOnAction((ActionEvent event) -> {
            JOptionPane.showMessageDialog(null, 
                    "Your clicked Save Button");
        });
        //adding components
        lay1.getChildren().add(lb1);
        lay2.getChildren().addAll(lay21,lay22);
        lay21.getChildren().addAll(fn, ln, dt,lay23);
        lay22.getChildren().addAll(lp,ep );
        lay23.getChildren().addAll(rm,rf);
        lay3.getChildren().addAll(sv, ex);
        root.getChildren().addAll(lay1, lay2, lay3);
        
        Scene scene = new Scene(root, 450, 450);
        
        primaryStage.setTitle("Task 1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
