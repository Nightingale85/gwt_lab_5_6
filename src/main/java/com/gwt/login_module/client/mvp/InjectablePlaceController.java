package com.gwt.login_module.client.mvp;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;

/**
 * @author Sergiy_Solovyov
 */
public class InjectablePlaceController extends PlaceController {

    @Inject
    public InjectablePlaceController(EventBus eventBus) {
        super(eventBus);
    }
}
