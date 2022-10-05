package guru.springframework.spring5recipeapp.domain;

import javax.persistence.*;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @OneToOne
    private Ingredient ingredient;

    Long getId() {
        return id;
    }

    void setId(final Long id) {
        this.id = id;
    }

    String getDescription() {
        return description;
    }

    void setDescription(final String uom) {
        this.description = uom;
    }

    Ingredient getIngredient() {
        return ingredient;
    }

    void setIngredient(final Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
