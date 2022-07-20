package art.jguit.labs.springperformance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @RequestMapping(value="/item",method= RequestMethod.POST)
    public void create() {
        itemService.create();
    }

    @RequestMapping(value="/item",method= RequestMethod.GET)
    public List<Item> list() {
        return itemService.list();
    }

}
