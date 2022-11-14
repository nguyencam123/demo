/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package untity;

/**
 *
 * @author Nguyen Cam
 */
public class UntityLogin {
    private String username ;
    private String password ;
    private String Email ;

    public UntityLogin() {
    }

    public UntityLogin(String username, String password, String Email) {
        this.username = username;
        this.password = password;
        this.Email = Email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "UntityLogin{" + "username=" + username + ", password=" + password + ", Email=" + Email + '}';
    }

    

}
