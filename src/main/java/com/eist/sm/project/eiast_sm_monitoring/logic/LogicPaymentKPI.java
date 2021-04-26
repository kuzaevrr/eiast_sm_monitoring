package com.eist.sm.project.eiast_sm_monitoring.logic;


import com.eist.sm.project.eiast_sm_monitoring.parser.Parser;
import com.eist.sm.project.eiast_sm_monitoring.pojo.IncObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "logicPaymentKPI")
public class LogicPaymentKPI {

    @Autowired
    private Parser parser;

    private double KPI_ZPVVST;

    private double SPI_SUM;
    private double NI_SUM;

    private double Ni = 1; //убрать потом
    private double SumT = 1; //убрать потом
    private double Count;
    private int ZPi = 0;
    private int ZPiprvvst = 0;

    private int[] niArray = {4, 24, 36, 60};

    public double logicExcel() {
        List<IncObject> incObjects = parser.parseXLS();

        double Wi = 0;

        //Integer.parseInt(incObjects.getPriority().split(" - ")[0]);
        for (int iFor = 1; iFor <= 4; iFor++) {
            switch (iFor) {
                case 1:
                    Wi = 0.4;
                    break;
                case 2:
                    Wi = 0.3;
                    break;
                case 3:
                    Wi = 0.025;
                    break;
                case 4:
                    Wi = 0.05;
                    break;
            }

            for (IncObject incObject : incObjects) {
                if (iFor == incObject.getPriority()) {
                    ZPi++;
                }
                if (iFor == incObject.getPriority() && incObject.isOverdue()) {
                    ZPiprvvst++;
                }
                Ni = niArray[iFor-1];
//                if()
//                SumT = ?;
                NI_SUM = (Ni * Count) / SumT;
            }


            SPI_SUM = (double) (ZPi - ZPiprvvst) / ZPi;
            if (ZPi == 0) {
                SPI_SUM = 1;
            }



            KPI_ZPVVST += (double) (Wi * ((0.2 * SPI_SUM) + (0.8 * NI_SUM)));
        }
        return KPI_ZPVVST;
    }
}
/*
 ///////////////////////////////////////////////////////Вопросы//////////////////////////////////////////////////////////////
 1. Какое значение брать в Ni ?
 2. Как расчитывать SumT?
 */
