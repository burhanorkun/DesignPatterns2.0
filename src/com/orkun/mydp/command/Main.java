package com.orkun.mydp.command;

import com.orkun.mydp.command.fx.Button;

public class Main {

    public static void main(String[] args) {
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();
        // Button
        // CheckBox
        // TextBox
    }
}
