package net.dqsy.papermg.papermanager.controller;

import net.dqsy.papermg.papermanager.po.PaperGuidancerecord;
import net.dqsy.papermg.papermanager.service.PaperGuidancerecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PaperGuidancerecordController {

    @Autowired
    private PaperGuidancerecordService paperGuidancerecordService;

    public boolean saveWithTitleId(int titleId, PaperGuidancerecord paperGuidancerecord) {
        return this.paperGuidancerecordService.saveWithTitleId(titleId,
                paperGuidancerecord);
    }

    public boolean updateWithTitleId(int titleId, PaperGuidancerecord paperGuidancerecord) {
        return this.paperGuidancerecordService.updateWithTitleId(titleId,
                paperGuidancerecord);
    }

    public List findWithTitleId(int titleId) {
        return this.paperGuidancerecordService.findWithTitleId(titleId);
    }
}