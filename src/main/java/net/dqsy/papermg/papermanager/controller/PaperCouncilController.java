package net.dqsy.papermg.papermanager.controller;

import net.dqsy.papermg.papermanager.po.PaperCouncil;
import net.dqsy.papermg.papermanager.service.PaperCouncilService;
import net.dqsy.papermg.web.util.PagingSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PaperCouncilController {

    @Autowired
    PaperCouncilService paperCouncilService;

    public void setPaperCouncilService(PaperCouncilService paperCouncilService) {
        this.paperCouncilService = paperCouncilService;
    }

    public PagingSupport getPage(int numberOfPage, int countOfPage) {
        try {
            return this.paperCouncilService.findAll(numberOfPage, countOfPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String apply(PaperCouncil paperCouncil, List<Integer> leaders, List<String> members) {
        return this.paperCouncilService.apply(paperCouncil, leaders, members);
    }

    public String approve(PaperCouncil paperCouncil) {
        return this.paperCouncilService.approve(paperCouncil);
    }
}