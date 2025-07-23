package Day3;
public class KYCDemoApp {
    public static void main(String[] args) {
        KYCverification individual = new individualkyc();
        individual.showstatus();
        individual.collectDocument();
        individual.validatepan();
        individual.verifyAddress();

        System.out.println();

        CorporateKYC corporate = new CorporateKYC();

        corporate.collectDocument();
        corporate.validatepan();
        corporate.verifyAddress();
    }
}
