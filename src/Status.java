public enum Status {
    CREATED_BY("СОЗДАН"), EXECUTED ("ИСПОЛНЕН");
    private String type_status;

    Status(String type_status) {
        this.type_status = type_status;
    }

    public String getType_status() {
        return type_status;
    }
}

