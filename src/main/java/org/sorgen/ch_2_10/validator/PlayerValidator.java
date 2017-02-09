package org.sorgen.ch_2_10.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.Random;

/**
 * 08.02.2017
 * 12:29
 *
 * @author aan
 */
@FacesValidator("playerValidator")
public class PlayerValidator implements Validator {

    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        System.out.println("Validating ...");
        // simulate some validation here
        Random r = new Random();
        int valid = r.nextInt(20);
        if (valid < 10) {
            FacesMessage msg = new FacesMessage(" Player name/surname validation failed.", "Details about failure!");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);

            throw new ValidatorException(msg);
        }
    }

}