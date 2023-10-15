package br.com.davidsonpacifico.davidsonpcfc.Users;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
// import lombok.Getter;
// import lombok.Setter;

@Data
@Entity(name = "tb_users")
//Esses importes abaixo são para pegarmos apenas um método, get ou set.
// @Getter
// @Setter
public class UserModel {

  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  @Column(unique = true)
  private String username;
  private String name;
  private String password;

  @CreationTimestamp
  private LocalDateTime createdAt;

  //getter setters
}