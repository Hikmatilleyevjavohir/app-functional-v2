package extraTask.OnlineAnnouncementSystem.service.impl;

import extraTask.OnlineAnnouncementSystem.Main;
import extraTask.OnlineAnnouncementSystem.model.Category;
import extraTask.OnlineAnnouncementSystem.service.CategoryService;

import java.util.Scanner;

public class CategoryServiceImpl implements CategoryService {
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public int showCategory() {
        int index = 1;
        System.out.println("\nChoose the Category");
        System.out.println("------------------------------------------");

        for (int i = 0; i < Main.categories.size(); i++) {
            if (Main.categories.get(i).getSubcategory() == null){
                System.out.println(index++ + ". " + Main.categories.get(i).getName());
            }
        }

        System.out.println("------------------------------------------");

        index = 0;
        int numberOfCategory = scanner.nextInt();

        for (int i = 0; i < Main.categories.size(); i++) {
            if (Main.categories.get(i).getSubcategory() == null){
                index++;
                if (index == numberOfCategory){
                    return showSubCategory(numberOfCategory - 1);
                }
            }
        }
        return -1;
    }

    @Override
    public int showSubCategory(int numberOfCategory) {
        int index = 1;
        Category category = Main.categories.get(numberOfCategory);
        System.out.println(category.getName() + "'s subcategories ");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < Main.categories.size(); i++) {
            if (Main.categories.get(i).getSubcategory() != null){
                if (Main.categories.get(i).getSubcategory().equals(category)){
                    System.out.println(index++ + ". " + Main.categories.get(i).getName());
                }
            }
        }

        System.out.println("----------------------------------------------------");

        index = 1;
        int subCategoryIndex = scanner.nextInt();

        for (int i = 0; i < Main.categories.size(); i++) {
            if (Main.categories.get(i).getSubcategory() != null){
                if (Main.categories.get(i).getSubcategory().equals(category)){
                    if (index == subCategoryIndex){
                        System.out.println(Main.categories.get(numberOfCategory).getName() + " > " + Main.categories.get(i).getName());
                        return i;
                    }
                    index++;
                }
            }
        }

        return -1;
    }
}
