package net.dqsy.papermg.papermanager.controller;

import net.dqsy.papermg.papermanager.po.PaperPlan;
import net.dqsy.papermg.papermanager.po.PaperWritingTask;
import net.dqsy.papermg.papermanager.service.PaperWritingTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PaperWritingTaskController {

    @Autowired
    private PaperWritingTaskService paperWritingTaskService;

    public boolean saveWritingTask(int titleId, PaperWritingTask paperWritingTask, List<PaperPlan> list) {
        return this.paperWritingTaskService.saveWritingTask(titleId,
                paperWritingTask, list);
    }

    public List findByTieleId(int titleId) {
        return this.paperWritingTaskService.findByTieleId(titleId);
    }
}