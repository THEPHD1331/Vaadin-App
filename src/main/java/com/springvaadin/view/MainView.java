package com.springvaadin.view;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

    public MainView(){

        VerticalLayout layout = new VerticalLayout();
        TextField textField = new TextField();
        Button addButton = new Button("Add");

        addButton.addClickListener(click -> {
            Checkbox checkbox = new Checkbox(textField.getValue());
            layout.add(checkbox);
            textField.setValue("");
        });
        addButton.addClickShortcut(Key.ENTER);
        add(new H1("Vaadin Todo: "), layout, new HorizontalLayout(textField, addButton));
    }
}
