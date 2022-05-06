package extraTask.Republic.model.user;

import extraTask.Republic.model.area.Address;
import extraTask.Republic.model.area.Republic;

public class President extends Person{
    // ONE TO ONE
    private Republic republic;

    public President(Republic republic) {
        this.republic = republic;
    }

    public President(Integer id, String firstname, String lastname, Address address, Republic republic) {
        super(id, firstname, lastname, address);
        this.republic = republic;
    }

    public Republic getRepublic() {
        return republic;
    }

    public void setRepublic(Republic republic) {
        this.republic = republic;
    }


}
