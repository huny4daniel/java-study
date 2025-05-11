
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		//Edit -> Find/Replace를 이용하여 10000.0을 한번에 12345.0으로 바꿔 계산 가능
		
		double ValueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = ValueOfSupply * vatRate;
		double total = ValueOfSupply + vat;
		double expense = ValueOfSupply * expenseRate;
		double income = ValueOfSupply - expense;

		System.out.println("Value of supply : "+ ValueOfSupply);
		System.out.println("VAT : "+ total);
		System.out.println("Total : "+ (ValueOfSupply + total));
		System.out.println("Expense : "+ expense);
		System.out.println("Income : "+ income);

		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		int i = 0;
		while(i < dividendRates.length) {
			System.out.println("Dividend : " + (income * dividendRates[i]));
			i = i + 1;
		}
		
	}

}
