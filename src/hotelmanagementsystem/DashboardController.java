package hotelmanagementsystem;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DashboardController implements Initializable {

    @FXML
    private ImageView dashExit;
    @FXML
    private ImageView miniMise;
    @FXML
    private Button manage;
    @FXML
    private Button checkin;
    @FXML
    private Button checkout;
    @FXML
    private Button info;
    @FXML
    private Button bill;
    @FXML
    private Button emp;
    @FXML
    private Pane pane;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        dashExit.setCursor(Cursor.HAND);
        dashExit.setCursor(Cursor.HAND);
        miniMise.setCursor(Cursor.HAND);
        manage.setCursor(Cursor.HAND);
        checkin.setCursor(Cursor.HAND);
        checkout.setCursor(Cursor.HAND);
        info.setCursor(Cursor.HAND);
        bill.setCursor(Cursor.HAND);
        emp.setCursor(Cursor.HAND);
        pane.setCursor(Cursor.MOVE);
    }

    @FXML
    private void signout(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void mRoom(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ManageRoom.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void checkin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CheckIn.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void checkout(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("checkout.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void cusinfo(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CustomerInfo.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void cusdetbill(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Bill.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void mEmployee(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ManageEmployee.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void dash_exit(MouseEvent event) {
        Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
        s.close();
    }

    @FXML
    private void minimise(MouseEvent event) {
        Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
        s.setIconified(true);
    }

}
