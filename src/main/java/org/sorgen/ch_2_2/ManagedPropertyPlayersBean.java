package org.sorgen.ch_2_2;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 03.02.2017
 * 12:34
 *
 * @author aan
 */
@ManagedBean
@RequestScoped
public class ManagedPropertyPlayersBean {

    private final static Logger LOGGER = Logger.getLogger(ManagedPropertyPlayersBean.class.getName());

    @ManagedProperty(value = "#{param.playerFirstNameParam}")
    private String firstName;

    @ManagedProperty(value = "#{param.playerLastNameParam}")
    private String lastName;

    @PostConstruct
    public void init() {
        LOGGER.log(Level.INFO, "Name: {0} Surname: {1}", new Object[]{firstName, lastName});
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String parametersAction() {
        return "result";
    }

}