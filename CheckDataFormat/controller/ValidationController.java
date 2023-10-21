package controller;

import model.ValidationModel;
import view.Menu;

public class ValidationController {
    private ValidationModel model;
    private Menu view;

    public ValidationController(ValidationModel model, Menu view) {
        this.model = model;
        this.view = view;
    }

    public void validateData() {
        String phone, email, date;
        String errorMessage;

        view.displayPrompt("Phone number");
        phone = view.getInput();
        errorMessage = model.checkPhone(phone);
        if (!errorMessage.isEmpty()) {
            view.displayErrorMessage(errorMessage);
            return;
        }

        view.displayPrompt("Email");
        email = view.getInput();
        errorMessage = model.checkEmail(email);
        if (!errorMessage.isEmpty()) {
            view.displayErrorMessage(errorMessage);
            return;
        }

        view.displayPrompt("Date (dd/MM/yyyy)");
        date = view.getInput();
        errorMessage = model.checkDate(date);
        if (!errorMessage.isEmpty()) {
            view.displayErrorMessage(errorMessage);
            return;
        }

        view.displaySuccessMessage();
    }
}