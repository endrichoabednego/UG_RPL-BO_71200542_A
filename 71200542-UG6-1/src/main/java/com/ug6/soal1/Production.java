package com.ug6.soal1;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.time.LocalDate;

public class Production
{
    private ArrayList<LocalDate> productionDate;
    private ArrayList<Long> productionDueDays;
    private int productionCapacity;
    private double costCalculation;

    public Production(final int productionCapacity, final ArrayList<LocalDate> productionDate, final ArrayList<Long> productionDueDays) {
        this.setProductionDueDays(productionDueDays);
        this.setProductionDate(productionDate);
        this.costCalculation = 0.0;
        this.setProductionCapacity(productionCapacity);
    }

    public boolean checkPhonesSpecification(final String androidCode) {
        int index = 0;
        boolean status = false;
        for (final String androidLevel : Codes.ANDROIDCODES) {
            status = (!androidCode.equalsIgnoreCase(androidLevel) || index >= 3);
            ++index;
        }
        return status;
    }

    public boolean checkPhonesSpecification(final String androidCode, final int ramCapacity, final int romCapacity) {
        int index = 0;
        boolean status = false;
        System.out.println("Starting with status " + status);
        for (final String androidLevel : Codes.ANDROIDCODES) {
            if (index <= 4 && androidLevel.equalsIgnoreCase(androidCode)) {
                if (ramCapacity <= 8 && ramCapacity >= 1 && romCapacity <= 128 && romCapacity >= 32) {
                    status = true;
                }
            }
            else if (index > 4 && index < Codes.ANDROIDCODES.size() - 1 && androidLevel.equalsIgnoreCase(androidCode) && ramCapacity <= 16 && ramCapacity >= 4 && romCapacity <= 256 && romCapacity >= 64) {
                status = true;
            }
            ++index;
        }
        System.out.println("Finish checking with status " + status);
        return status;
    }

    public void conductProduction(final Phones phone) {
        final LocalDate today = LocalDate.now();
        final long productionDuration = this.productionCapacity * 3L;
        LocalDate productionDueDate = today.plusDays(productionDuration);
        this.productionDate.add(today);
        long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);
        final double cost = this.productionCapacity * 1000 * (double)daysBetweenProduction;
        this.setCostCalculation(cost);
        System.out.println("Congratulation\nBegin To Produce Phone " + phone.getPhoneName());
        System.out.println("With code: " + phone.getPhoneCode());
        System.out.println("Production Date: " + today);
        System.out.println("Production Due date: " + productionDueDate);
        System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
        System.out.println("Calculation Production Cost: Rp " + this.costCalculation);
    }

    public void conductProduction(final Phones phone, final float productionRate) {
        if (productionRate >= 0.0f && productionRate <= 2.0f) {
            LocalDate today = LocalDate.now();
            this.productionDate.add(today);
            final long productionDuration = (long)(this.productionCapacity * 3L * productionRate);
            LocalDate productionDueDate = today.plusDays(productionDuration);
            long daysBetweenProduction = ChronoUnit.DAYS.between(today, productionDueDate);
            final double cost = this.productionCapacity * 1000 * (double)daysBetweenProduction * 2.0;
            this.setCostCalculation(cost);
            System.out.println("Congratulation\nBegin To Produce Phone " + phone.getPhoneName());
            System.out.println("With code: " + phone.getPhoneCode());
            System.out.println("Production Date: " + today);
            System.out.println("Production Due date: " + productionDueDate);
            System.out.println("Days Before Due Date = " + daysBetweenProduction + " Days");
            System.out.println("Calculation Production Cost: Rp " + (long)this.costCalculation);
        }
        else {
            System.out.println("Please Input valid Production Rate");
        }
    }

    public void setProductionCapacity(final int productionCapacity) { this.productionCapacity = productionCapacity; }

    protected void setProductionDate(final ArrayList<LocalDate> productionDate) { this.productionDate = productionDate; }

    public void setCostCalculation(final double costCalculation) { this.costCalculation = costCalculation; }

    public void setProductionDueDays(final ArrayList<Long> productionDueDays) { this.productionDueDays = productionDueDays; }
}