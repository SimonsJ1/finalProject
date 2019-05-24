public static void Tictac{ 
//draw board goes here
  public int array twoplayer[2][2]{
   for(int i =0; i<10; i++){ 
    int playercount = 0;
    stringone = "";
    stringtwo = "";
    int num = 0;
    int num2 = 0;
    int xcount = 0;
    int ocount = 0;
    if (playercount %2 ==0) 
      system.out.println("player one's turn");
    else
      system.out.println("player two's turn");
    system.in(stringone, stringtwo);
    stringone "top" = num 0;
    stringone "center" = num 1; //Will take players input
    stringone "bottem" = num 2; 
    stringtwo "first" = num 0; 
    stringtwo "second" = num 1; 
    stringtwo "third" = num 2;
    if (playercount %2 ==0)
      drawx twoplayer[num][num2];  //acess drawing 
    else 
      drawo twoplayer[num][num2];
    for(int k =0; k<3; k++){
      for(int j=0; j<3; j++){  //checks for a winner
        if twoplayer[k][j].contains(x)
          xcount++;
        else if twoplayer[k][j].contains(o)
          ocount++;
      }
    }
    if(xcount ==3)
      system.out.println("Player one wins!");
      i = 9;
    else if(ocount ==3)
      system.out.println("Player two wins!");
      i = 9;
    playercount ++;       
   }
}

  public drawx{
    //draw on board
  }
  public drawo{
  }
  
