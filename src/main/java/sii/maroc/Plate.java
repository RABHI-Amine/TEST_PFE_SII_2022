package sii.maroc;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Plate {
    private String name;
    private Recipe recipe;

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Plate(String name){
        Recipe recipe ;
        if(name.equals("Tomato Mozzarella Salad")){
            recipe = new Salade();
        }else if(name.equals("Pizza")){
            recipe = new Pizza();
        }

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plate plate = (Plate) o;
        return Objects.equals(name, plate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
