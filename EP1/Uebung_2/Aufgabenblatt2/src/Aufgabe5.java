import java.util.Random;
import java.util.Scanner;
import codedraw.CodeDraw;
import java.lang.Math;

public class Aufgabe5 {

    public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);

	Random rand = new Random();
	double startPriceStock = rand.nextDouble(0,100);
	double startOptionPrice = rand.nextDouble(0,10);
	double money = 500;

	
	System.out.println("""
			   This is a Stock playing game
			   You got 500$ for playing\n
			   Following game Options are available:
			   -> Select Company [GME]
			       -> Currently only GameStop is available. Soon other stocks or options of other companies can be bought as well!\n
			   -> Buy  Stock
			   -> Buy Options
			   -> Set leverage [1,3]\n""");
	
	System.out.printf("The Stock price of GME is %.2f and Option price is %.2f \n\n", startPriceStock, startOptionPrice);
			  
	
	System.out.print("Select Company: ");
	String company = checkInput((userInput.nextLine()).toUpperCase(), 0);

	System.out.print("Do you want to trade [STOCK] or [OPTION]? ");
	String stockOrOption = checkInput((userInput.nextLine()).toUpperCase(), 1);

	String leverage = "0";
	if(stockOrOption.equals("OPTION")){
	    System.out.print("What leverage on your Options do you want? ");
	    leverage = checkInput(userInput.nextLine(), 2);
	}

	stockSimulator(money, startPriceStock, startOptionPrice, Integer.parseInt(leverage), stockOrOption);
    }

    public static void stockSimulator(double money, double startPriceStock, double startOptionPrice, int leverage, String stockOrOption){

	boolean playing = true;
	double newPrice = 0;
	double shareCount = money/startPriceStock;
	double optionCount = money/startOptionPrice;
	double currentMoneyValue = 0;

	while(playing){
	    Random randomStockOptionMove = new Random();
	    double stockOptionMove = randomStockOptionMove.nextDouble(0.5,1.5);
	    if(stockOrOption.equals("STOCK")){
		newPrice = startPriceStock*stockOptionMove;
		currentMoneyValue = shareCount * newPrice;
	    }
	    else{
		double leverageValue = ((startOptionPrice*stockOptionMove) - startOptionPrice) * leverage;
		newPrice = startOptionPrice + leverageValue;
		currentMoneyValue = optionCount * newPrice;
	    }
	    
	    if(currentMoneyValue > money){
		System.out.printf("Congrats!\nYour total investment increased in value.\nYour total investment is now worth: %.2f$\n", currentMoneyValue);
	    }
	    else{
		System.out.printf("Sorry\nYour total investment decreased in value.\nYour total investment is now worth: %.2f$\n", currentMoneyValue);
	    }

	    if(stockOrOption.equals("STOCK")){
		startPriceStock = newPrice;
	    }
	    else{
		startOptionPrice = newPrice;
	    }

	    if(Math.round(currentMoneyValue) <= 0){
		System.out.print("\n--------------------------------------------");
		System.out.println("\nSorry your Position lost too much in Value. We hope you have a nice day! Good bye");
		if(newPrice < 0.){
		    System.out.printf("The amount owed to our broker is %f!", currentMoneyValue);
		}
		playing = false;
		continue;
	    }
	    System.out.print("\nDo you want to continue playing? [y] [n]? ");
	    
	    Scanner continuePlay = new Scanner(System.in);
	    String contPlay = continuePlay.nextLine();

	    while(!contPlay.equals("y") && !contPlay.equals("n")){
		System.out.print("As input only [y] or [n] is allowed. ");
		contPlay = continuePlay.nextLine();
	    }

	    if(contPlay.equals("y")){
		System.out.println("------------------------------------------------");
		System.out.println("\nWe appreciate it. We wish you the best.\n");
	    }
	    else{
		System.out.print("---------------------------------------------------");
		System.out.println("\nWe are sad to see you go. Thank you for playing");

		if(currentMoneyValue > 500){
		    System.out.printf("You made %.2f profit. Good Job!\nThats %.2f Percent of your investment\n", currentMoneyValue-money, (100/money*currentMoneyValue)-100);
		}
		else{
		    System.out.printf("You lost %.2f of your money.\nThats %.2f Percent of your investment\n", currentMoneyValue-money, Math.abs((100/money*currentMoneyValue)-100));
		}
		playing = false;
	    }
		    

	}
    }

    public static void printResult(double money, double startPrice, double currentPrice){
	double percentalChange = Math.abs(100 / startPrice * currentPrice);
	
	if(currentPrice > startPrice){
	    System.out.printf("Congrats your investment increased. Your new balance is %f!", currentPrice);
	}
	else{
	    System.out.printf("Sorry, your investment decreased %f. Your new balance is %f!", currentPrice);
	}
	
    }
    
    public static String checkInput(String userInput, int identifier){
	boolean inputBoolean = false;
	
	Scanner input = new Scanner(System.in);
	
	while(!inputBoolean){
	    System.out.println("----------------------------------------");
		
	    inputBoolean =  switch(userInput){
	    case "GME" -> { // , "NVDA", "TSLA", "BB" -> {
		if(identifier == 0){
		    yield true;
		}
		yield false;

	    }
	    case "STOCK", "OPTION" -> {
		if(identifier == 1){
		    yield true;
		}
		yield false;
	    }
	    default -> {
		if(identifier == 2){
		    try{
			int leverage = Math.abs(Integer.parseInt(userInput));
			if(identifier == 2 && (leverage == 0 || leverage >= 4)){
			    System.out.println("We only allow the specified range ");
			    System.out.print("Please try again: ");
			    userInput = input.nextLine();
			    yield false;
			}
		    }
		    catch (NumberFormatException e) {
			System.out.println("We only allow the specified range ");
			System.out.print("Please try again: ");
			userInput = input.nextLine();
			yield false;
		    }
		}

		if(identifier == 0){
		    System.out.println("We only allow companies listed above. ");
		}
		else if(identifier == 1){
		    System.out.println("We only allow Stock or Option traiding ");
		}

		if(identifier == 2 && Math.abs(Integer.parseInt(userInput)) < 11){
		    yield true;
		}
		
		System.out.print("Please try again: ");
		userInput = input.nextLine();
		yield false;
	    }
	    };
	}
	return userInput;
    }
}