package com.jpaconfig.test;

import com.jpaconfig.dao.RechargePlanDao;
import com.jpaconfig.entity.RechargePlan;
import com.jpaconfig.helper.EntityManagerFactoryRegistry;

public class JPAConfigTest {
    public static void main(String[] args) {
        RechargePlan plan = new RechargePlan();
        plan.setPlanNo(1);
        plan.setPlanName("399 Unlimted plan");
        plan.setCircle("AP");
        plan.setValidityDays(30);
        plan.setDescription("Unlimited Text/Talk plan");
        plan.setRechargeAmount(399);

        try{
            RechargePlanDao dao=new RechargePlanDao();
            dao.saveRechargePlan(plan);
            System.out.println("\n Recharge plan saved");
        }finally {
            EntityManagerFactoryRegistry.closeEntityManagerFacory();
        }
    }
}
