package de.atlas.gui.presenter;


import de.atlas.gui.Euro2DollarRechnerView;
import de.atlas.model.Euro2DollarRechner;

public interface Euro2DollarPresenter {

	Euro2DollarRechnerView getView();

	void setView(Euro2DollarRechnerView view);

	Euro2DollarRechner getModel();

	void setModel(Euro2DollarRechner model);

	void onRechnen(); // Presenter

	void onBeenden(); // Presenter

	void onPopulateItems(); // Codebehind
	
	void updateRechnenActionState(); // Codebehind

}