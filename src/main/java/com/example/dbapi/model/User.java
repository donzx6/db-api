package com.example.dbapi.model;

import javax.persistence.*;

@Entity
@Table(name = "users")

public class User {

        private int id;
        private String firstName;
        private String lastName;

        public User() {
        }

        public User(int id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        public int setId(Integer id) {
            return this.id;
        }
        public int getId() {
            return this.id;
    }
//other setters and getters


}
