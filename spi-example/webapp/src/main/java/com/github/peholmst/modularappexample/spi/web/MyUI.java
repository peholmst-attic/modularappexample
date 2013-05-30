package com.github.peholmst.modularappexample.spi.web;

import com.github.peholmst.modularappexample.spi.api.TabRegistration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.UI;

import java.util.ServiceLoader;

/**
 * @author petter@vaadin.com
 */
public class MyUI extends UI {

    private static ServiceLoader<TabRegistration> tabRegistrations = ServiceLoader.load(TabRegistration.class);

    @Override
    protected void init(VaadinRequest request) {
        TabSheet tabs = new TabSheet();
        tabs.setSizeFull();
        setContent(tabs);
        for (TabRegistration tr : tabRegistrations) {
            tr.addTabs(tabs);
        }
    }
}
