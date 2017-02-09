package org.sorgen.ch_2_10.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * 08.02.2017
 * 12:27
 *
 * @author aan
 */
@RequestScoped
@ManagedBean(name = "playerBeanCh210")
public class PlayerBean {

    private String playerName="none";

    private String playerSurname="none";

    /**
     * Creates a new instance of PlayersBean
     */
    public PlayerBean() {
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