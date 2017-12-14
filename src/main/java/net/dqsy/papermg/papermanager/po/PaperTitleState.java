package net.dqsy.papermg.papermanager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "paper_title_state")
public class PaperTitleState implements Serializable {
    @Id
    @Column(name = "paperTitleStateId")
    private int paperTitleStateId;
    @Column(name = "paperTitleState")
    private int paperTitleState;
    @Column(name = "paperTitleStateDescription")
    private String paperTitleStateDescription;

    public PaperTitleState() {
    }

    public PaperTitleState(int paperTitleState, String paperTitleStateDescription) {
        this.paperTitleState = paperTitleState;
        this.paperTitleStateDescription = paperTitleStateDescription;
    }

    public int getPaperTitleStateId() {
        return this.paperTitleStateId;
    }

    public void setPaperTitleStateId(int paperTitleStateId) {
        this.paperTitleStateId = paperTitleStateId;
    }

    public int getPaperTitleState() {
        return this.paperTitleState;
    }

    public void setPaperTitleState(int paperTitleState) {
        this.paperTitleState = paperTitleState;
    }

    public String getPaperTitleStateDescription() {
        return this.paperTitleStateDescription;
    }

    public void setPaperTitleStateDescription(String paperTitleStateDescription) {
        this.paperTitleStateDescription = paperTitleStateDescription;
    }
}