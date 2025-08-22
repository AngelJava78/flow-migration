package com.nttdata.services.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class AccountResponse {


  private int id;
  private String firstName;
  private String lastName;
  private String username;
  private String title;
  private String emailAddress;
  private String phone;

}
