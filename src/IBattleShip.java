public interface IBattleShip {
    
    // начать игру 
    void start(); 
    // 
    void shot(int i, int j); 
    // 
    int[][] player();
    int[][] computer();
    
    boolean gameStarted(); 
    
    boolean computerStep(); 

    boolean playerWin();

    boolean computerWin(); 
}
