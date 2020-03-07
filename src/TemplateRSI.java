public class TemplateRSI {
    double run(String isin) {
        double quotationsLiveValue;

        ReadData objReadData = new ReadData();
        quotationsLiveValue = objReadData.getQuotations(isin);

        return quotationsLiveValue;
    }
}
