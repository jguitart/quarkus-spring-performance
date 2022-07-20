package art.jguit.labs.springperformance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;


    public void create() {
        Item item = Item.builder()
                .name(UUID.randomUUID().toString())
                .build();
        itemRepository.save(item);
    }

    public List<Item> list() {
        Iterable<Item> items = itemRepository.findAll();
        List<Item> result = new ArrayList<>();
        items.forEach(result::add);
        return result;
    }

}
