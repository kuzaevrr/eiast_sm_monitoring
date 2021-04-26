package com.eist.sm.project.eiast_sm_monitoring.parser;

import com.eist.sm.project.eiast_sm_monitoring.pojo.IncObject;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component(value = "parser")
public class Parser {

    @Value(value = "classpath:excel/file.xls")
    private Resource companiesXml;

    private String stringIsBool = "✔";

    public List<IncObject> parseXLS() {
        List<IncObject> listResult = new ArrayList<>();
        InputStream in = null;
        HSSFWorkbook wb = null;
        try {
            in = companiesXml.getInputStream();
            wb = new HSSFWorkbook(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Sheet sheet = wb.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();
        int i = 0;
        while (it.hasNext()) {
            Row row = it.next();
            if (i == 0) {
            } else {
                IncObject incObject = new IncObject(
                        String.valueOf(row.getCell(0)),
                        String.valueOf(row.getCell(1)),
                        Integer.parseInt(String.valueOf(row.getCell(2)).split(" ")[0]),
                        String.valueOf(row.getCell(3)),
                        String.valueOf(row.getCell(4)),
                        String.valueOf(row.getCell(5)),
                        String.valueOf(row.getCell(6)),
                        String.valueOf(row.getCell(7)),
                        String.valueOf(row.getCell(8)),
                        String.valueOf(row.getCell(9)).equals(stringIsBool),
//                        !String.valueOf(row.getCell(9)).isEmpty(),
                        String.valueOf(row.getCell(10))
                );
                listResult.add(incObject);
            }
            i++;
        }
        return listResult;
    }

}