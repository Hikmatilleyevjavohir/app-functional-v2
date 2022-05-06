package extraTask.OnlineAnnouncementSystem.controller;

import extraTask.OnlineAnnouncementSystem.service.CategoryService;
import extraTask.OnlineAnnouncementSystem.service.impl.CategoryServiceImpl;

public class CategoryController {
    private CategoryService categoryService = new CategoryServiceImpl();

    public int showCategory(){
        return categoryService.showCategory();
    }
}
