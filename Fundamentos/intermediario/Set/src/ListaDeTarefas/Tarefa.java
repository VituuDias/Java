package ListaDeTarefas;

import java.util.Objects;

public class Tarefa {
    private String description;
    private boolean taferaIsCompleted = false;

    public Tarefa(String description) {
        this.description = description;
        this.taferaIsCompleted = taferaIsCompleted;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getTaferaIsCompleted() {
        return taferaIsCompleted;
    }

    public void setTaferaIsCompleted(boolean taferaIsCompleted) {
        this.taferaIsCompleted = taferaIsCompleted;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(getDescription(), tarefa.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescription());
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "description='" + description + '\'' +
                ", taferaIsCompleted=" + taferaIsCompleted +
                '}';
    }
}
