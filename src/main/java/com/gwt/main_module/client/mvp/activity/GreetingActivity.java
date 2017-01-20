package com.gwt.main_module.client.mvp.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.gwt.login_module.client.gin.Injector;
import com.gwt.main_module.client.mvp.view.IGreetingView;


public class GreetingActivity extends AbstractActivity implements IGreetingView.IGreetingPresenter {

	private final Injector injector = Injector.INSTANCE;
	
	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		final IGreetingView view = injector.getGreetingView();
		view.setPresenter(this);
		container.setWidget(view.asWidget());
	}
}
