package com.gwt.login_module.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.gwt.login_module.client.mvp.place.LoginPlace;
import com.gwt.main_module.client.mvp.place.GreetingPlace;


@WithTokenizers({LoginPlace.Tokenizer.class, GreetingPlace.Tokenizer.class})
public interface DemoPlaceHistoryMapper extends PlaceHistoryMapper {
}
