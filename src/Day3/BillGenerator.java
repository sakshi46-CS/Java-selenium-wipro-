package Day3;
@FunctionalInterface
public interface BillGenerator {
void generate(double amount);

default void showBillFormat() {
	System.out.println("***********Bill Receipt********");
}
static void displayheader() {
	System.out.println("Welcome to online Billing System");
}
}
