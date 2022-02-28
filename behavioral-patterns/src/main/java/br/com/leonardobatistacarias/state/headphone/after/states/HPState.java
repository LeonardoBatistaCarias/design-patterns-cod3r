package br.com.leonardobatistacarias.state.headphone.after.states;

import br.com.leonardobatistacarias.state.headphone.after.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
