// Priority Enum
enum Priority {
    LOW("Low urgency"),
    MEDIUM("Medium urgency"),
    HIGH("High urgency");

    private String description;

    Priority(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}