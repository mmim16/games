public class Board{


    public char one = '1', two='2', three='3', four='4', five='5', six='6', seven='7', eight='8', nine='9';
    private String board;
    private boolean check, xWin, oWin, draw;

    public String board(){      //creates a game board
        board = one + "\t" + two + "\t" +three + "\n" + four + "\t" + five + "\t" + six + "\n" + seven + "\t" + eight + "\t" + nine;
        return board;
    }

    public void oneChange(int output){      //changes the board after player one makes a move
        switch (output) {
            case 1 -> one = 'X';
            case 2 -> two = 'X';
            case 3 -> three = 'X';
            case 4 -> four = 'X';
            case 5 -> five = 'X';
            case 6 -> six = 'X';
            case 7 -> seven = 'X';
            case 8 -> eight = 'X';
            case 9 -> nine = 'X';
        }
    }    


    public void twoChange(int output){      //changes the board after player two makes a move
        switch (output) {
            case 1 -> one = 'O';
            case 2 -> two = 'O';
            case 3 -> three = 'O';
            case 4 -> four = 'O';
            case 5 -> five = 'O';
            case 6 -> six = 'O';
            case 7 -> seven = 'O';
            case 8 -> eight = 'O';
            case 9 -> nine = 'O';
        }
    }    

    public boolean check(int output){       //checks if the board is filled already
        check = false;
        switch (output) {
            case 1 -> {
                if (one=='X'||one=='O'){
                    check=true;
                }
            }
            case 2 -> {
                if (two=='X'||two=='O'){
                    check=true;
                }
            }
            case 3 -> {
                if (three=='X'||three=='O'){
                    check=true;
                }
            }
            case 4 -> {
                if (four=='X'||four=='O'){
                    check=true;
                }
            }
            case 5 -> {
                if (five=='X'||five=='O'){
                    check=true;
                }
            }
            case 6 -> {
                if (six=='X'||six=='O'){
                    check=true;
                }
            }
            case 7 -> {
                if (seven=='X'||seven=='O'){
                    check=true;
                }
            }
            case 8 -> {
                if (eight=='X'||eight=='O'){
                    check=true;
                }
            }
            case 9 -> {
                if (nine=='X'||nine=='O'){
                    check=true;
                }
            }
        }
        return check;
    }


    public boolean xWin(){      //checks if player one won
        if(one=='X'&&two=='X'&&three=='X'){
            xWin=true;
        }
        else if(four=='X'&&five=='X'&&six=='X'){
            xWin=true;
        }
        else if(seven=='X'&&eight=='X'&&nine=='X'){
            xWin=true;
        }
        else if(one=='X'&&four=='X'&&seven=='X'){
            xWin=true;
        }
        else if(two=='X'&&five=='X'&&eight=='X'){
            xWin=true;
        }
        else if(three=='X'&&six=='X'&&nine=='X'){
            xWin=true;
        }
        else if(one=='X'&&five=='X'&&nine=='X'){
            xWin=true;
        }
        else if(three=='X'&&five=='X'&&seven=='X'){
            xWin=true;
        }
        else {
            xWin=false;
        }
        return xWin;
    }


    public boolean oWin(){      //checks if player two won
        if(one=='O'&&two=='O'&&three=='O'){
            oWin=true;
        }
        else if(four=='O'&&five=='O'&&six=='O'){
            oWin=true;
        }
        else if(seven=='O'&&eight=='O'&&nine=='O'){
            oWin=true;
        }
        else if(one=='O'&&four=='O'&&seven=='O'){
            oWin=true;
        }
        else if(two=='O'&&five=='O'&&eight=='O'){
            oWin=true;
        }
        else if(three=='O'&&six=='O'&&nine=='O'){
            oWin=true;
        }
        else if(one=='O'&&five=='O'&&nine=='O'){
            oWin=true;
        }
        else if(three=='O'&&five=='O'&&seven=='O'){
            oWin=true;
        }
        else {
            oWin=false;
        }
        return oWin;
    }


    public boolean draw(){      //checks if the game is a draw
        draw = (one=='X'||one=='O')&&(two=='X'||two=='O')&&(three=='X'||three=='O')&&(four=='X'||four=='O')&&(five=='X'||five=='O')&&(six=='X'||six=='O')&&(seven=='X'||seven=='O')&&(eight=='X'||eight=='O')&&(nine=='X'||nine=='O');
        return draw;
    }
        //reset all the variables and clear game board.

}
