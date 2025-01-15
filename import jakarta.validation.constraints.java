import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Language {

    private int id;

    @NotNull(message = "Language name cannot be null")
    @Size(min = 2, max = 50, message = "Language name must be between 2 and 50 characters")
    private String name;

    @Size(max = 200, message = "Description should not exceed 200 characters")
    private String description;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
