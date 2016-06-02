package com.NewVillage.action;

import java.util.*;

import com.NewVillage.dao.CostDao;
import com.NewVillage.dao.ReceiptDao;
import com.NewVillage.daoimpl.ReceiptDaoImp;
import com.NewVillage.entity.BusinessCost;
import com.NewVillage.entity.PayRecord;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

/**
 * Created by 珏 on 2016/6/2.
 *
 * 5.财务 1.9确定费用 1.10业务收费
 */
public class FinanceAction extends ActionSupport{
    private Map session;
    private ReceiptDao receiptdao;
    private CostDao costdao;
    private PayRecord payRecord;
    public void setSession(Map session) {
        this.session = session;
    }

    public void setReceiptdao(ReceiptDao receiptdao) {
        this.receiptdao = receiptdao;
    }

    public void setCostdao(CostDao costdao) {
        this.costdao = costdao;
    }

    public void setPayRecord(PayRecord payRecord) {
        this.payRecord = payRecord;
    }

    public String QueryCost(){
        try{
            List<BusinessCost> businessCosts=costdao.QueryAllCost();
            session.put("businessCosts",businessCosts);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return SUCCESS;
    }

    public String ExaminCost(){
        try{

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return SUCCESS;
    }

    @Override
    public String execute() {
        String flag=INPUT;
        try{
            receiptdao.addPayRecord(payRecord);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }
}