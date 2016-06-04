package com.NewVillage.dao;

import com.NewVillage.entity.PowerDesign;

import java.util.List;

/**
 * Created by xfcq on 2016/6/3.
 */
public interface PowerDesignDao {
    public boolean addPowerDesign(PowerDesign powerDesign);
    public PowerDesign queryPowerDesignByID(int powerid);
    public PowerDesign queryPowerDesignByNewID(int newid);
    public boolean deletePowerDesign(PowerDesign powerDesign);
    public boolean updatePowerDesign(PowerDesign powerDesign);
    public List<PowerDesign> allPowerDesignsByEmpID(int empid);
    public List<PowerDesign> allPowerDesignsByNewID(int newid);
    List<PowerDesign> allPowerDesigns();

    List<PowerDesign> queryPowerDesign();
}
