package com.javaBase.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User {

    Integer id;

    String name;

    Integer age;

    /**
     * final int prime = 31;
     * int result = 1;
     * result = prime * result + ((age == null) ?  0 : age.hashCode());
     * result = prime * result + ((name == null) ? 0 : name.hashCode());
     * return result;
     */

}
