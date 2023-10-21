package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationModel {
    public String checkPhone(String phone) {
        if (!phone.matches("\\d+")) {
            return "Phone number must be a number";
        } else if (phone.length() != 10) {
            return "Phone number must contain 10 digits";
        } else {
            return "";
        }
    }

    public String checkDate(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date);
            return "";
        } catch (ParseException e) {
            return "Date must be in the correct format (dd/MM/yyyy)";
        }
    }

    public String checkEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            return "Email must be in the correct format";
        } else {
            return "";
        }
    }
}