import handlers.ActionsHandler;
import handlers.ListHandler;

import java.io.IOException;

class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Cinema!");
        try {
            ActionsHandler.menuAction();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

