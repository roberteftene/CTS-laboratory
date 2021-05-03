package robert.eftene.g1092.prototype;

public class ReportModel implements Cloneable {

    EPeriod period;
    String reportContent;

    public ReportModel(EPeriod period) {
        System.out.println("Generating report for given period...");
        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.period = period;
        this.reportContent = "Some content from DB";
        System.out.println("Rendering statistic graphic.");
    }

    private ReportModel() {}

    @Override
    public Object clone() throws CloneNotSupportedException {
        ReportModel copy = new ReportModel();
        copy.reportContent = this.reportContent;
        return copy;
    }
}
