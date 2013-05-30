package com.github.peholmst.modularappexample.cdi.modules.sample;

import com.github.peholmst.modularappexample.cdi.api.TabRegistrationEvent;
import com.vaadin.ui.Label;

import javax.enterprise.context.Dependent;
import javax.enterprise.event.Observes;

/**
 * @author petter@vaadin.com
 */
@Dependent
public class SampleTabRegistration {

    public void addTabs(@Observes TabRegistrationEvent event) {
        event.getTabs().addTab(new Label("Hello World from Sample Module!"), "Sample Module");
    }
}
