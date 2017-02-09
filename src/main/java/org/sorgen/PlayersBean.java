package org.sorgen;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.util.Map;

/**
 * 01.02.2017
 * 19:20
 *
 * @author aan
 */
@ManagedBean
@RequestScoped
public class PlayersBean {

    private String name;

    private String surname;

    public PlayersBean() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String parametersAction() {
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String, String> params =
                fc.getExternalContext().getRequestParameterMap();
        name = params.get("playerNameParam");
        surname = params.get("playerSurnameParam");
        System.out.println(name + " " + surname);
        return "request_param_result";
    }

    public String toUpperCase() {
        name = name.toUpperCase();
        surname = surname.toUpperCase();

        return "/ch_2_7/results?faces-redirect=true&includeViewParams=true";
    }

}