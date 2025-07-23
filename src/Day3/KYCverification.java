package Day3;

public interface KYCverification {
 void collectDocument();
 void validatepan();
 void verifyAddress();
 
 default void showstatus() {
	 System.out.println("KYC verification in process");
 }
}