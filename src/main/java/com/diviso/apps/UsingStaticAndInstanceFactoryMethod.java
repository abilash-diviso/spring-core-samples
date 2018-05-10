package com.diviso.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diviso.domain.SnakeAndLadderGame;

public class UsingStaticAndInstanceFactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context=new ClassPathXmlApplicationContext("snakeAndLadderCongif.xml");
		
		SnakeAndLadderGame game=context.getBean("game", SnakeAndLadderGame.class);
		game.launchGame();
	}

}
