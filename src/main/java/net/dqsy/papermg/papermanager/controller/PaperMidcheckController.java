package net.dqsy.papermg.papermanager.controller;

import net.dqsy.papermg.papermanager.po.PaperMidcheck;
import net.dqsy.papermg.papermanager.service.PaperMidcheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PaperMidcheckController {

    @Autowired
    private PaperMidcheckService paperMidcheckService;

    public boolean saveWithTitleId(int titleId, PaperMidcheck paperMidcheck) {
        return this.paperMidcheckService.saveWithTitleId(titleId, paperMidcheck);
    }

    public boolean updateWithTitleId(int titleId, PaperMidcheck paperMidcheck) {
        return this.paperMidcheckService.updateWithTitleId(titleId, paperMidcheck);
    }

    public List findByTitleId(int titleId) {
        return this.paperMidcheckService.findByTitleId(titleId);
    }
}