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
	private double getAverageSale() {
		return getSales() / getSalesMade();
		}
	private int getSalesAboveX(double x) {
		int count = 0;
		for (int y = 0; y < sale.length; y++) {
			if (sale[y] > x) {
				count++;
				}
			}
		return count;	
		}	
			
	public static void main(String[] args) {
		Ledger demo = new Ledger(5);
		demo.addSale(10.00);
		System.out.println(demo.getSalesMade());
		demo.addSale(1.00);
		System.out.println(demo.getSalesMade());
		System.out.println(demo.getSales());
		System.out.println(demo.getAverageSale());
		System.out.println(demo.getSalesAboveX(1.40));
		
		
		}
	}
