package net.dqsy.papermg.papermanager.service;

import net.dqsy.papermg.papermanager.po.PaperThesisProposal;
import net.dqsy.papermg.support.BaseService;

import java.io.Serializable;
import java.util.List;

public interface PaperThesisProposalService<T extends Serializable> extends BaseService<T> {

    boolean saveWithTitleId(int paramInt, PaperThesisProposal paramPaperThesisProposal);

    boolean updateWithTitleId(int paramInt, PaperThesisProposal paramPaperThesisProposal);

    List findByTitleId(int paramInt);
}