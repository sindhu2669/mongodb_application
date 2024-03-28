package com.example.expense.tracker.Repository;

import com.example.expense.tracker.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
    Category findByName(String name);

    Category findCategoryByName(String categoryName);
}
