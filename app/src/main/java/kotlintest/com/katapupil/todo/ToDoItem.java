package kotlintest.com.katapupil.todo;

import java.util.Date;

public class ToDoItem {

    private String message;
    private Date created;

    public ToDoItem(String message) {
        this.message = message;
        created = new Date();
    }

    public String getMessage() {
        return message;
    }

    public Date getCreated() {
        return created;
    }
}
