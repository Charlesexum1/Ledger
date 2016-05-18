import java.util.Scanner;

public class Ledger {
	
	private int maxSales;
	private int salesMade;
	private double[] sale;
	
	private Ledger(int max) {
		sale = new double[max];
		maxSales = max;
		salesMade = 0;
		}
	
	private void addSale(double d) {
		sale[salesMade] = d;
		salesMade += 1;	
		}
	
	private int getSalesMade() {
		return salesMade;
		}
	private double getSales() {
		double total = 0;
		
		for (int x = 0; x < sale.length; x++) {
			total += sale[x];
			}
		return total;	
		}	
	private void getAverageSale() {
		double average = 0;
		double total = 0;
		int count = 0;
		
		for (int x = 0; x < sale.length; x++) {
			if ((sale[x] == 0)) {
				break;
				}
			else {
				total += sale[x];
				count++;
				}					
			}
		average = total / sale.length;
		System.out.println(average);	
		}	
		
		
	public static void main(String[] args) {
		Ledger demo = new Ledger(5);
		demo.addSale(10.00);
		System.out.println(demo.getSalesMade());
		demo.addSale(1.00);
		System.out.println(demo.getSalesMade());
		System.out.println(demo.getSales());
		demo.getAverageSale();
		
		
		}
	}
