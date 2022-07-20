package art.jguit.labs.quarkus_performance;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class ItemService {

    public List<Item> list() {

        return Item.listAll();
    }

    @Transactional
    public void create() {
        Item newItem = Item.builder()
                .name(UUID.randomUUID().toString())
                .build();
        newItem.persist();
    }

}
