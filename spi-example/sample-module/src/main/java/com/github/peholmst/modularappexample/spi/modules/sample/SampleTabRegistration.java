package com.github.peholmst.modularappexample.spi.modules.sample;

import com.github.peholmst.modularappexample.spi.api.TabRegistration;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;

/**
 * @author petter@vaadin.com
 */
public class SampleTabRegistration implements TabRegistration {
    @Override
    public void addTabs(TabSheet tabs) {
        tabs.addTab(new Label("Hello World from Sample Module!"), "Sample Module");
    }
}
