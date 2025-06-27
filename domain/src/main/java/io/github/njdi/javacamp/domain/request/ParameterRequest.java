package io.github.njdi.javacamp.domain.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ParameterRequest {
  private Long id;
  private String name;
  private BigDecimal price;
  private Boolean enabled;
  private String[] tags;
}
