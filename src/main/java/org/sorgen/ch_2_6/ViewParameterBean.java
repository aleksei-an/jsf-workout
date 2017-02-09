package org.sorgen.ch_2_6;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * 03.02.2017
 * 15:20
 *
 * @author aan
 */
@ManagedBean
@RequestScoped
public class ViewParameterBean {

    private String playerName;

    private String playerSurname;

    public ViewParameterBean() {

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerSurname() {
        return playerSurname;
    }

    public void setPlayerSurname(String playerSurname) {
        this.playerSurname = playerSurname;
    }

}