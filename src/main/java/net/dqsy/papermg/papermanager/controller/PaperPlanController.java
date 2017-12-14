package net.dqsy.papermg.papermanager.controller;

import net.dqsy.papermg.papermanager.service.PaperPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PaperPlanController {
    @Autowired
    private PaperPlanService paperPlanService;

    public List findByWritingTaskID(int writingTaskID) {
        return this.paperPlanService.findByWritingTaskID(writingTaskID);
    }
}