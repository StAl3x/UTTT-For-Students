package dk.easv.bll.bot;

import dk.easv.bll.game.IGameState;
import dk.easv.bll.move.IMove;

public class UngaricheBot implements IBot{
    @Override
    public IMove doMove(IGameState state) {
        return null;
    }

    @Override
    public String getBotName() {
        return "Ungariche Bot v0.1";
    }
}
