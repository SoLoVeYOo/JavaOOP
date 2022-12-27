package seminar_6.Solid7DIP.dip;

import java.util.ArrayList;
import java.util.List;

public class Report{
    private List<ReportItem> items;	// Отчетные данные

    // расчет отчетных данных
    public void calculate(){
        items =  new ArrayList<ReportItem>();
        items.add(new ReportItem("First", (float)5));
        items.add(new ReportItem("Second", (float)6));
    }

    public void output(){
        PrintReport reportPrint = new PrintReport();
        reportPrint.output(items);
    }
}