package org.example;


public class User {
    private String name;
    private String surname;

    @Override
    public String toString(){
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
    public User(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
    }


    public static class Builder {
        private String name;
        private String surname;

        public Builder() {

        }

        //Static factory method for creating a builder instance.
        //Static factory paced in same class it's creating instance for.
        //it provides convenient and controlled way for creating object without directly using constructor
        public static Builder builder(){
            return new Builder();
        }

        public Builder setName(String name){
            this.name = name;
            return  this;
        }

        public Builder setSurname(String surname){
            this.surname = surname;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }
}

