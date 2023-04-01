package com.group10;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class PersonId {
        private String name;
        private String lastName;

        public PersonId(String name, String lastName) {
                this.name = name;
                this.lastName = lastName;
        }
}
