package org.sorgen.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 * 01.02.2017
 * 18:49
 *
 * @author aan
 */
@ManagedBean
@RequestScoped
public class ContextParamBean {

    private String numberone;

    public String getNumberone() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        numberone = facesContext.getExternalContext().getInitParameter("number.one.in.ATP");
        return numberone;
    }

}
