package com.gwt.main_module.client.mvp.view;

import com.google.gwt.user.client.ui.IsWidget;

public interface IGreetingView extends IsWidget {

	void setPresenter(IGreetingPresenter presenter);
	
	interface IGreetingPresenter {
	}
}
