package br.com.leonardobatistacarias.state.pacman.states;

import br.com.leonardobatistacarias.state.pacman.Ghost;

public interface GhostState {
	void spotPacman(Ghost ghost);
	void losePacman(Ghost ghost);
	void pacmanTurnsSpecial(Ghost ghost);
	void pacmanTurnsNormal(Ghost ghost);
	void eatenByPacman(Ghost ghost);
	void reachTheBase(Ghost ghost);
}
