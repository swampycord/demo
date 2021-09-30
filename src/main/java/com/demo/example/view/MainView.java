package com.demo.example.view;

import com.demo.example.ContextProvider;
import com.demo.example.service.UserService;
import com.demo.example.vo.UserVO;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.Notification.Position;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route(value = "")
public class MainView extends VerticalLayout {

	public MainView() {
		// TODO Auto-generated constructor stub

		TextField name = new TextField("Name");

		TextField role = new TextField("Role");

		Button submitBtn = new Button("Submit");

		submitBtn.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> arg0) {
				// TODO Auto-generated method stub

				UserService userService = ContextProvider.getBean(UserService.class);

				UserVO userVO = new UserVO();
				if (name.getValue().equals("") || role.getValue().equals("")) {
					Notification.show("Complete both fields", 4000, Position.TOP_CENTER);
				} else {
					userVO.setName(name.getValue());
					userVO.setRole(role.getValue());

					userService.persistUser(userVO);

					name.clear();
					role.clear();

					Notification.show("Saved", 4000, Position.TOP_CENTER);
				}

			}
		});

		add(name, role, submitBtn);
	}
}
