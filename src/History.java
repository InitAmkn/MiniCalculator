import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Command> commands = new ArrayList<>();
    public void save(Command command)
    {
        commands.add(command);
    }

    @Override
    public String toString() {
        StringBuilder history = new StringBuilder();
        history.append("history:");
        history.append("\n");
        for (Command item: commands) {
            history.append(item);
            history.append("\n");
        }
        return history.toString();
    }
}
