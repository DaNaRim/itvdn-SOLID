package SRP.employee;

public class ReportFormatter {

    protected String formattedOutput;

    public ReportFormatter(Object o, FormatType formatType) {
        switch (formatType) {
            case XML:
                formattedOutput = convertedObjectToXML(o);
                break;
            case CSV:
                formattedOutput = convertedObjectToCSV(o);
                break;
        }
    }

    private String convertedObjectToXML(Object o) {
        return "converted to XML " + o.toString();
    }

    private String convertedObjectToCSV(Object o) {
        return "converted to CSV " + o.toString();
    }
}
