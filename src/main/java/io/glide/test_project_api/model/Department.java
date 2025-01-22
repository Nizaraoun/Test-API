package io.glide.test_project_api.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Department {

  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Users> users;

  // Getters and setters
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Users> getUsers() {
    return users;
  }

  public void setUsers(Set<Users> users) {
    this.users = users;
  }
}

