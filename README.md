# finalProject

# Tic Tac Toe

The game I am making is tic tac toe. The two players will take turns clicking the board, which will add an x or an O. If a player gets three in a row, they win.

### Difficulties or opportunities you encountered along the way.

The part that checks to see if a player won was the hardest part. It was difficult to figure out how to loop it in a way that would check all possible ways to win. Figuring out how to switch between displaying x’s and O’s was hard as well. 

### Most interesting piece of your code and explanation for what it does.

```Java
  	    JButton button1 = createButton(90, 100, 100, 110, "", true);
	    button1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		// check if marked - if so do not change.
	    	    if (!gameData.isGameValueSet(0, 0)) {		
	    	    	if (gameData.isXTurn()) {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		// ALSO DECIDE ON COLORS YOU WANT FOR X's and O's
	    	    		gamePieces.colorX1 = Color.RED;
	    	    		gamePieces.colorO1 = transparent;
	    	    		gamePieces.colorInnerO1 = transparent;
	    	    	}
	    	    	else {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		gamePieces.colorX1 = transparent;
	    	    		gamePieces.colorO1 = Color.RED;
	    	    		gamePieces.colorInnerO1 = Color.WHITE;
	    	    	}
	    	    	gameData.setGameValue(0,0) ;
	    	    	gameData.checkGameState();
	    	    	gameData.setXTurn();			
	    	    	label.setText(gameData.getDialog());
	    	    	//update data with marked square and check for win or tie
	    	    	repaint();
	    	    };
	    	};
	    });

```
This code is interesting because I had to learn to use action handler. I had to display both the x’s and O’s, I had to create both an x and an O in every spot and make them transparent. A color would be applied to one based on whose turn it was. 

## Built With

* [Eclipse](https://eclipse.org/) - The IDE used

## Authors

* **Jake Simons** 

## Acknowledgments

* I would like to thank Stackoverflow.com
* I would like to thank Diana of YouTube https://www.youtube.com/watch?v=zG8CrISqPpU
* I would like to thank Dr. R.
* I would like to thank my dad
