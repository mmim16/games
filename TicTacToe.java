import java.util.Scanner;
public class TicTacToe{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int input, counter=0;
        boolean check, win=false;
        String playerOne, playerTwo;
        boolean playing = true;
        Board game = new Board();

        System.out.println("Grab a partner and play Tic Tac Toe!\n");
        System.out.print("Enter player one's name: ");
        playerOne = scan.nextLine();           
        System.out.print("Enter player two's name: ");
        playerTwo = scan.nextLine();
        System.out.print("\n" + playerOne + " will be X and " + playerTwo + " will be O. Make all your moves using the board numbers of 1-9.\n");
            System.out.println(game.board());
            
            while(counter<9){
                System.out.print("\n" + playerOne + "'s turn: ");
                input = scan.nextInt();
                check = game.check(input);
                while (check){
                    System.out.print("You entered an invalid number or a number that already has a board piece on it. Please select another available number: ");
                    input = scan.nextInt();
                    check = game.check(input);
                }
                game.oneChange(input);
                counter++;
                System.out.println(game.board());
                
                if (game.xWin()){
                    break;
                }
            
                else if (counter==9){
                    break;
                }
                else if(game.draw()){
                    break;
                }
                
                //player 2 has their turn
                System.out.print("\n" + playerTwo + "'s turn: ");
                input = scan.nextInt();
                check = game.check(input);
                while (check){
                        System.out.print("You entered an invalid number or a number that already has a board piece on it. Please select another available number: ");
                        input = scan.nextInt();
                        check = game.check(input);
                }    
                game.twoChange(input);
                counter++;
                System.out.println(game.board());
                
                if(game.oWin()){
                    break;
                }
            
            }

            if (game.xWin()){
                System.out.println("\nCongratulations, " + playerOne + "! You have won this game.");
            }
            else if (game.oWin()){
                System.out.println("\nCongratulations, " + playerTwo + "! You have won this game.");
            }
            else{
                System.out.println("\nThe game has ended in a draw. Thank you for playing.");
            }
    }
    
}
