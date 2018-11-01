package helpers;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataHelper {


    public static List<HashMap<String,String>> data(String page){


    List<HashMap<String,String>> myData=new ArrayList<HashMap<String,String>>() ;

        //specify the file where the data will come from

        //specify the file where the data will come from
    //specify the file where the data will come from

            try {
                //specify the file where the data will come from
                FileInputStream  fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\TestData-seleniumframework.xlsx");
               // instantiate teh workbook object
                XSSFWorkbook workbook=new XSSFWorkbook(fs);
                XSSFSheet sheet=workbook.getSheet(page);
                Row headerRow=sheet.getRow(0);


                for(int i=1;i<sheet.getPhysicalNumberOfRows();i++){

                    Row currentRow =sheet.getRow(i);
                    HashMap<String,String> currentHash=new HashMap<String, String>();
                    for (int j=0;j<currentRow.getPhysicalNumberOfCells();j++){

                        Cell currentCell=currentRow.getCell(j);

                        switch(currentCell.getCellType()){

                            case Cell.CELL_TYPE_STRING:


                                currentHash.put(headerRow.getCell(j).getStringCellValue(),currentCell.getStringCellValue());
                                break;

                            case Cell.CELL_TYPE_NUMERIC:
                                String str=NumberToTextConverter.toText(currentCell.getNumericCellValue());

                                currentHash.put(headerRow.getCell(j).getStringCellValue(),str);
                                break;


                       }
                    }

                myData.add(currentHash);


                }



            fs.close();


            } catch (Exception e) {
                e.printStackTrace();
            }


    return myData;
    };
}
