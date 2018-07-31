
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zr4mbo
 */
@ManagedBean
@SessionScoped

public class User {

    private String name;
    private String username;
    private String password;
    private String outputMessage;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
  

    public String getOutputMessage() {
        return outputMessage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String login() {
        if (username.equals("zr4mbo") && password.equals("zbZB9607")) {
           
            outputMessage = "myJSFPage2";

        } else {
            outputMessage = "ErrorPage";
        }
        return outputMessage;
    }

    public void resetName() {
        this.name = null;
    }
}
