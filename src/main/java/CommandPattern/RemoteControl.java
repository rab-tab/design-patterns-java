package CommandPattern;

import java.util.Stack;

public class RemoteControl {
    Command command;
    Stack<Command> commandHistory = new Stack<>();

    public RemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandHistory.add(command);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.peek();
            commandHistory.pop();
            lastCommand.undo();

        }
    }

}
