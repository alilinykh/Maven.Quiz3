package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    SCISSOR,
    PAPER;

    public RockPaperScissorHandSign getWinner() {
        switch (this) {
            case ROCK: return PAPER;
            case PAPER: return SCISSOR;
            case SCISSOR: return ROCK;
        }
        return null;
    }

    public RockPaperScissorHandSign getLoser() {

        switch (this) {
            case ROCK: return SCISSOR;
            case PAPER: return ROCK;
            case SCISSOR: return PAPER;
        }return null;
    }
}
