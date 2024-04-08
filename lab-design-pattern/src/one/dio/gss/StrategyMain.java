package one.dio.gss;

import one.dio.gss.strategy.Comportment;
import one.dio.gss.strategy.ComportmentAggressive;
import one.dio.gss.strategy.ComportmentDefend;
import one.dio.gss.strategy.ComportmentNormal;
import one.dio.gss.strategy.Robot;

public class StrategyMain {

	public static void main(String[] args) {
		Comportment normal = new ComportmentNormal();
		Comportment def = new ComportmentDefend();
		Comportment agr = new ComportmentAggressive();
		
		Robot bot = new Robot();
		bot.setComportment(normal);
		bot.move();
		bot.move();
		bot.setComportment(def);
		bot.move();
		bot.setComportment(agr);
		bot.move();
		bot.move();
		bot.move();
	}
}
