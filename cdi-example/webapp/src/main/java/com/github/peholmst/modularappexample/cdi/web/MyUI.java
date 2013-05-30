package com.github.peholmst.modularappexample.cdi.web;

import com.github.peholmst.modularappexample.cdi.api.TabRegistrationEvent;
import com.vaadin.cdi.CDIUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.UI;

import javax.inject.Inject;

/**
 * @author petter@vaadin.com
 */
@CDIUI
public class MyUI extends UI {

    @Inject
    javax.enterprise.event.Event<TabRegistrationEvent> tabRegistrationEvent;

    @Override
    protected void init(VaadinRequest request) {
        final TabSheet tabs = new TabSheet();
        tabs.setSizeFull();
        setContent(tabs);
        tabRegistrationEvent.fire(new TabRegistrationEvent() {
            @Override
            public TabSheet getTabs() {
                return tabs;
            }
        });
    }
}
