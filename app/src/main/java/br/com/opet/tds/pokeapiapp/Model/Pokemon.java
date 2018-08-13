package br.com.opet.tds.pokeapiapp.Model;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Diego on 12/08/2018.
 */

public class Pokemon {

    @SerializedName("id")
    private long ID;
    private String name;
    private int height;
    private int weight;
    private List<Types> types;
    private Sprites sprites;

    public Pokemon() {
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Types> getTypes() {
        return types;
    }

    public void setTypes(List<Types> types) {
        this.types = types;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public class Types{
        private Type type;

        public Types() {
        }

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }

        public class Type{
            private String name;

            public Type() {
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public class Sprites {
        private String front_default;
        private String front_shiny;
        private String front_female;
        private String front_shiny_female;
        private String back_default;
        private String back_shiny;
        private String back_female;
        private String back_shiny_female;

        public Sprites() {
        }

        public String getFront_default() {
            return front_default;
        }

        public void setFront_default(String front_default) {
            this.front_default = front_default;
        }

        public String getFront_shiny() {
            return front_shiny;
        }

        public void setFront_shiny(String front_shiny) {
            this.front_shiny = front_shiny;
        }

        public String getFront_female() {
            return front_female;
        }

        public void setFront_female(String front_female) {
            this.front_female = front_female;
        }

        public String getFront_shiny_female() {
            return front_shiny_female;
        }

        public void setFront_shiny_female(String front_shiny_female) {
            this.front_shiny_female = front_shiny_female;
        }

        public String getBack_default() {
            return back_default;
        }

        public void setBack_default(String back_default) {
            this.back_default = back_default;
        }

        public String getBack_shiny() {
            return back_shiny;
        }

        public void setBack_shiny(String back_shiny) {
            this.back_shiny = back_shiny;
        }

        public String getBack_female() {
            return back_female;
        }

        public void setBack_female(String back_female) {
            this.back_female = back_female;
        }

        public String getBack_shiny_female() {
            return back_shiny_female;
        }

        public void setBack_shiny_female(String back_shiny_female) {
            this.back_shiny_female = back_shiny_female;
        }
    }
}
