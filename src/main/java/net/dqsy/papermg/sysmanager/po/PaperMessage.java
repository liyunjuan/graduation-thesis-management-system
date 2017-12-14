package net.dqsy.papermg.sysmanager.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "public_messagetable")
public class PaperMessage implements Serializable{
    @Id
    @Column(name = "msgId")
    private int msgId;
    @Column(name = "sender")
    private String sender;
    @Column(name = "receiver")
    private String receiver;
    @Column(name = "sendDate")
    private String sendDate;
    @Column(name = "msgTitle")
    private String msgTitle;
    @Column(name = "msgText")
    private String msgText;
    @Column(name = "flag")
    private int flag;
    @Column(name = "remark")
    private String remark;

    public PaperMessage() {
    }

    public PaperMessage(String sender, String receiver, String sendDate, String msgTitle, String msgText, int flag) {
        this.sender = sender;
        this.receiver = receiver;
        this.sendDate = sendDate;
        this.msgTitle = msgTitle;
        this.msgText = msgText;
        this.flag = flag;
    }

    public int getMsgId() {
        return this.msgId;
    }

    public void setMsgId(int msgId) {
        this.msgId = msgId;
    }

    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSendDate() {
        return this.sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getMsgTitle() {
        return this.msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public String getMsgText() {
        return this.msgText;
    }

    public void setMsgText(String msgText) {
        this.msgText = msgText;
    }

    public int getFlag() {
        return this.flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}