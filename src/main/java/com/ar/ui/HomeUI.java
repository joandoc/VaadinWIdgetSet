package com.ar.ui;

import com.askvikrant.digitalclock.DigitalClock;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class HomeUI extends UI {

	@Override
	protected void init(VaadinRequest request) {

		setTheme("example");
		
		VerticalLayout verticalLayout = new VerticalLayout();
		Label label = new Label("hola mundo");
		verticalLayout.addComponent(label);
		setContent(verticalLayout);
		Button btn = new Button("boton");
		btn.addStyleName("botonPersonalizado");
		verticalLayout.addComponent(btn);

		DigitalClock dg = new DigitalClock();
		verticalLayout.addComponent(dg);
		
		
		
	}

}
